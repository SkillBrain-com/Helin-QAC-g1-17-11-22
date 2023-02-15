package Tema2;

public class Blackjack {
    public static void main(String[] args) {
        Blackjack blackjack = new Blackjack();
        System.out.println(blackjack.parseCard("ace"));
        System.out.println(blackjack.isBlackjack("queen", "ace"));
        System.out.println(blackjack.largeHand(true, 7));
        System.out.println(blackjack.smallHand(15, 12));
        System.out.println(blackjack.firstTurn("eight", "ace", "king"));
    }
    public static int  parseCard(String card) {

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

    public boolean isBlackjack(String card1, String card2) {
        if (parseCard(card1) + parseCard(card2) == 21)
            return true;
        else return false;
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        if (!isBlackjack)
            return "P";
        else if (dealerScore < 10)
            return "W";
        else return "S";
    }

    public String smallHand(int handScore, int dealerScore) {
        if (handScore >= 17)
            return "S";
        else if (handScore <= 11)
            return "H";
        else if (dealerScore >= 7)
            return "H";
        else return "S";
    }

    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
