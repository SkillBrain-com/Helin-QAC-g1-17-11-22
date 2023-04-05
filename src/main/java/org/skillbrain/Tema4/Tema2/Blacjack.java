package org.skillbrain.Tema4.Tema2;
import java.util.Random;
public class Blacjack {
    public static void main(String[] args) {


    String card1 = getrandom(cards());
    String card2 = getrandom(cards());
    String dealerCard1 = getrandom(cards());
    String dealerCard2 = getrandom(cards());
        System.out.println("Cartile tale sunt: " + card1 + " si " + card2);
        System.out.println("Dealerul a primit " + dealerCard1 + " si " + " ? ");
    firstTurn(card1, card2, dealerCard1, dealerCard2);

}


    static String[] cards() {
        String[] cards = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
        return cards;
    }

    static String getrandom(String[] cards) {

        int randomcard = new Random().nextInt(cards.length);
        return cards[randomcard];

    }

    static int hit(/*int handscore*/) {

        String newcard = getrandom(cards());
        System.out.println("S-a tras " + newcard);
        return parseCard(newcard);

    }



    static String firstTurn(String card1, String card2, String dealerCard1, String dealerCard2) {
        int handScore = score(card1, card2);
        int dealercard1 = parseCard(dealerCard1);
        int dealercard2 = parseCard(dealerCard2);
        if (handScore > 20) {
            if(largeHand(isBlackjack(card1, card2), dealercard1, card1, card2) == "W")
            {
                System.out.println("Ai castigat!");
                return "Win";
            }
            else if (largeHand(isBlackjack(card1, card2), dealercard1, card1, card2) == "S") {

                if (reveal(dealerCard1, dealerCard2) > 21 || reveal(dealerCard1, dealerCard2) <= handScore) {
                    System.out.println("Ai castigat!");
                    return "Win";
                } else {
                    System.out.println("Ai pierdut :(");
                    return "Loss";
                }}

        } else {
            while (smallHand(handScore, dealercard1) != "S") {
                int cartenoua=hit();
                System.out.println("Tragi carte "+handScore);
                handScore = handScore + cartenoua;
                System.out.println("Ai in mana "+handScore+" puncte");
            }
            if (reveal(dealerCard1, dealerCard2) <= handScore && handScore<=21 || reveal(dealerCard1,dealerCard2)>21) {
                System.out.println("Ai castigat!");
                return "Win";
            }
            else {
                System.out.println("Ai pierdut :(");
                return "Loss";
            }
        }
        return "S";
    }
    static int score(String card1, String card2){

        return parseCard(card1)+parseCard(card2);

    }


    static int reveal(String dealercard1,String dealercard2){

        System.out.println("Dealerul are "+dealercard1+" si "+dealercard2);
        int score=score(dealercard1,dealercard2);
        while (score<=16 && score<21){
            System.out.println("Dealerul trage carte ");
            int newcard=hit();
            score=score+newcard;
            System.out.println("Dealerul are "+score+" puncte");
        }
        System.out.println("Dealerul are "+score+" puncte");
        return score;

    }

    static int parseCard(String card) {

        switch (card) {
            case "ace":
                return 11;
            case "two":
                return 2;
            case "three":
                return 3;
            case "four":
                return 4;
            case "five":
                return 5;
            case "six":
                return 6;
            case "seven":
                return 7;
            case "eight":
                return 8;
            case "nine":
                return 9;
            case "ten":
            case "jack":
            case "queen":
            case "king":
                return 10;
            default:
                return 0;
        }
    }

    static boolean isBlackjack(String card1, String card2) {

        if (parseCard(card1)+ parseCard(card2) == 21){
            System.out.println("Ai blackjack!");
            return true;}
        else return false;

    }

    static String largeHand(boolean isBlackjack, int dealerScore, String card1, String card2) {

        if(card1=="ace" && card2 == "ace")
            return split(dealerScore);

        if (isBlackjack(card1,card2))
            if (dealerScore < 10) {
                System.out.println("Ai castigat! ");
                return "W";
            } else {
                System.out.println("Stai ");
                return "S";
            }
        else {
            System.out.println("Stai ");
            return "S";
        }


    }

    static String split(int dealerScore){

        String card1 = "ace";
        String card2 = "ace";
        int leftHand = parseCard(card1);
        int rightHand = parseCard(card2);
        String R;
        String L;
        leftHand = leftHand+hit();
        if (leftHand > 20) {
            System.out.println("Split stanga: "+largeHand(isBlackjack(card1,card2), dealerScore, card1, card2));
        } else {
            System.out.println("Split stanga: "+smallHand(leftHand, dealerScore));
        }

        rightHand = rightHand+hit();
        if (leftHand > 20) {
            System.out.println("Split dreapta: "+largeHand(isBlackjack(card1,card2), dealerScore, card1, card2));
        } else {
            System.out.println("Split dreapta: "+smallHand(rightHand,dealerScore));
        }


        return "Split";
    }

    static String smallHand(int handScore, int dealerScore) {

        if (handScore >= 17) {
            System.out.println("Stai ");
            return "S";
        } else if (handScore <= 11) {
            System.out.println("Tragi carte ");
            return "H";
        } else if (handScore >= 12 && handScore <= 16)
            if (dealerScore >= 7) {
                System.out.println("Tragi carte ");
                return "H";
            }
            else {
                System.out.println("Stai ");
                return "S";
            }
        return "S";
    }

}
