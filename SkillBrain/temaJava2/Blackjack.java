public class Blackjack {

    public static void main(String[] args) {
       
        String card1 = "ace";
        String card2 = "seven";


        String dealerCard = "five";

        int handScore = calculateCardValue(card1) + calculateCardValue(card2);

        int dealerScore = calculateCardValue(dealerCard);

        boolean isBlackjack = isBlackjack(card1, card2);

        String decision;
        if (handScore < 21) {
            decision = getDecision(handScore, dealerScore);
        } else {
            decision = getDecision(isBlackjack, dealerScore);
        }

        System.out.println("Player's hand: " + card1 + " " + card2 + " (" + handScore + ")");
        System.out.println("Dealer's hand: " + dealerCard + " (face up)");
        System.out.println("Decision: " + decision);
    }

    public static boolean isBlackjack(String card1, String card2) {
        int value1 = calculateCardValue(card1);
        int value2 = calculateCardValue(card2);

        return value1 + value2 == 21;
    }

    public static String getDecision(boolean isBlackjack, int dealerScore) {
        if (isBlackjack) {
            if (dealerScore == 11 || dealerScore == 10 || dealerScore == 1) {
                return "stand";
            } else {
                return "win";
            }
        }

        return "stand";
    }

    public static String getDecision(int handScore, int dealerScore) {
        if (handScore < 11) {
            return "hit";
        }

        if (handScore >= 12 && handScore <= 16) {
            if (dealerScore >= 7) {
                return "hit";
            } else {
                return "stand";
            }
        }

        if (handScore >= 17) {
            return "stand";
        }

        return "";
    }

    public static int calculateCardValue(String card) {
        if (card.equals("ace")) {
            return 1;
        } else if (card.equals("two")) {
            return 2;
        } else if (card.equals("three")) {
            return 3;
        } else if (card.equals("four")) {
            return 4;
        } else if (card.equals("five")) {
            return 5;
        } else if (card.equals("six")) {
            return 6;
        } else if (card.equals("seven")) {
            return 7;
        } else if (card.equals("eight")) {
            return 8;
        } else if (card.equals("nine")) {
            return 9;
        } else if (card.equals("ten") || card.equals("jack") || card.equals("queen") || card.equals("king")) {
            return 10;
        } else {
            return 0;
        }
    }
}