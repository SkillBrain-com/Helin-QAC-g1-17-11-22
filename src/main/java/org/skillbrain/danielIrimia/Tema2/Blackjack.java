package org.skillbrain.danielIrimia.Tema2;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Blackjack {

    public static void main(String[] args) {

        String[] cards = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven",
                "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

        String card1 = getRandomCard(cards);
        String card2 = getRandomCard(cards);
        String dealerCard = getRandomCard(cards);
        int playerScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);
        String playerHand = card1 + " and " + card2;
        String dealerHand = dealerCard;

        // Game starts here.
        System.out.println("Welcome to Blackjack!");

        Scanner input = new Scanner(System.in);
        System.out.println("Your name? ");
        String playerName = input.nextLine();



        System.out.println("Hello, " + playerName + "!");

        System.out.println("====================================");

        System.out.println(playerName + " draw " + playerHand + " and have a total of " + playerScore + " points.");
        System.out.println("The dealer draws " + dealerHand +
                " and have a total of " + dealerScore + " points.");
        System.out.println("Recomandation to do next  " + firstTurn(card1, card2, dealerCard, cards));
        System.out.println("====================================");

        System.out.println(" What do  you want to do next: " +
                " H - hit " +
                " S - stand " +
                " P - split " +
                " W - Automatically win " +
                " L - Automatically lose " +
                " Q - quit");

        // Depending on your two cards and the card of the dealer, there is a strategy for the first turn of the game,
        // in which you have the following options:
        //      H - Hit:  Take another card from the deck.
        //      S - Stay: Keep your current cards and end your turn.
        //      P - Split: If you have two cards of the same value, you can split them into two hands.
        //      W - Automatically win the game.
        //      L - Automatically lose the game.
        //      Q - Quit the game.
        String userInput = input.nextLine();
        System.out.println("You chose " + userInput);
        userInput = userInput.toUpperCase();

        Game:
        while (!userInput.equals("Q")) {
            if (userInput.equals("H")) {
                System.out.println("You chose to hit");
                String newCard = getRandomCard(cards);
                playerScore += parseCard(newCard);
                playerHand += " and " + newCard;
                dealerScore += parseCard(dealerCard);
                System.out.println(playerName+ " draw " + playerHand +
                        " and have a total of " + playerScore + " points.");
                dealerScore = dealerTurn(dealerScore, dealerHand, cards);
                System.out.println(checkWhoWin(isBlackjack(playerHand,newCard),playerScore, dealerScore, playerName));
                break;
            } else if (userInput.equals("S")) {
                System.out.println("You chose to stay");
                dealerScore = dealerTurn(dealerScore, dealerHand, cards);
                System.out.println(checkWhoWin(isBlackjack(card1, card2), playerScore, dealerScore, playerName));
                break;
            } else if (userInput.equals("P")) {
                //  Implement split. If the player chooses to split, set the card value of the dealer's split card equal to the value of the player's hand.
                //  The dealer will receive a split hand and the dealer will see the card value.
                //  The player will be able to split at any time.
                System.out.println("You chose to split");

                String newCard1 = getRandomCard(cards);
                String newCard2 = getRandomCard(cards);

                // new card for player hand 1 and score 1
                System.out.println("Player hand 1: " + card1 + " and " + newCard1);
                playerHand = card1 + " and " + newCard1;
                playerScore = parseCard(card1) + parseCard(newCard1);
                System.out.println("Player hand 1 score: " + playerScore);
                dealerScore = dealerTurn(dealerScore, dealerHand, cards);
                System.out.println("Check for player hand 1: " +
                        checkWhoWin(isBlackjack(card1, newCard1), playerScore, dealerScore, playerName));
                System.out.println("====================================");

                // new card for player hand 2 and score 2
                System.out.println("Player hand 2: " + card2 + " and " + newCard2);
                String newPlayerHand = card2 + " and " + newCard2;
                int newPlayerScore = parseCard(card2) + parseCard(newCard2);
                System.out.println("Player hand 2 score: " + newPlayerScore);
                dealerScore = dealerTurn(dealerScore, dealerHand, cards);
                System.out.println("Check for player hand 2: " +
                        checkWhoWin(isBlackjack(card2, newCard2), newPlayerScore, dealerScore, playerName));
                System.out.println("====================================");
                break;
            } else if (userInput.equals("W")) {
                if (isBlackjack(card1,card2)) {
                    System.out.println("You chose to win");
                    System.out.println(playerName + " wins!");
                    break;
                } else {
                    System.out.println("You can't win");
                    System.out.println("You have to draw blackjack");
                    break Game;
                }
            } else if (userInput.equals("L")) {
                System.out.println("You chose to lose");
                System.out.println("You draws " + dealerHand +
                        " and have a total of " + playerScore + " points");
                System.out.println("The dealer draws " + dealerHand +
                        " and the dealer have a total of " + dealerScore + " points");
                System.out.println("You lose!");
                break;
            } else {
                System.out.println("Invalid input");
            }

            // close the while loop
            System.out.println("What do you want to do next: " +
                    " H - hit " +
                    " S - stand " +
                    " P - split " +
                    " W - Automatically win " +
                    " L - Automatically lose " +
                    " Q - quit");
            userInput = input.nextLine();
            System.out.println("You chose " + userInput);
            userInput = userInput.toUpperCase();
        }

        // Play again
        System.out.println("====================================");
        System.out.println("Want to play again? Y/N");
        String playAgain = input.nextLine();
        playAgain = playAgain.toUpperCase();

        if (playAgain.equals("Y")) {
            System.out.println("====================================");
            System.out.println("New game");
            System.out.println("====================================");
            main(args);
        } else if (playAgain.equals("N")) {
            System.out.println("====================================");
            System.out.println("Goodbye!");
        } else {
            System.out.println("Invalid input");
        }

        // close the scanner
        input.close();
        System.out.println();
        System.out.println("====================================");
        System.out.println("Thank you for playing Blackjack!");
    }

    static int dealerTurn(int dealerScore, String dealerHand, String[] cards) {
        while (dealerScore < 17) {
            String newCard = getRandomCard(cards);
            dealerScore += parseCard(newCard);
            dealerHand += " and " + newCard;
            System.out.println("The dealer draws " + dealerHand +
                    " and the dealer have a total of " + dealerScore + " points");
        }
        System.out.println("The dealer stay with " + dealerHand + " for a total of " + dealerScore);
        return dealerScore;
    }

    static String checkWhoWin(boolean isBlackjack ,int playerScore, int dealerScore,String playerName){
        if (isBlackjack) {
            return playerName + " have Blackjack! You win!";
        } else if (playerScore == 21) {
            return playerName + " have BlackJack! You win!";
        } else if (dealerScore == 21) {
            return "The dealer have BlackJack! You lose!";
        } else if (playerScore > 21) {
            return playerName + " bust! You lose! " +
                    "The dealer have a total of " + dealerScore + " points";
        } else if (dealerScore > 21) {
            return "The dealer bust! You win! " +
                    playerName + " have a total of " + playerScore + " points";
        } else if (playerScore > dealerScore) {
            return playerName + " have " + playerScore + " and the dealer have " + dealerScore + ". You win!";
        } else if (playerScore < dealerScore) {
            return playerName + " have " + playerScore + " and the dealer have " + dealerScore + ". You lose!";
        } else {
            return playerName + " have " + playerScore + " and the dealer have " + dealerScore + ". It's a tie!";
        }
    }
    public static int parseCard(String card) {
        card = card.toLowerCase();
        return switch (card) {
            case "ace" -> 11;
            case "two" -> 2;
            case "three" -> 3;
            case "four" -> 4;
            case "five" -> 5;
            case "six" -> 6;
            case "seven" -> 7;
            case "eight" -> 8;
            case "nine" -> 9;
            case "ten", "jack", "queen", "king" -> 10;
            default -> 0;
        };
    }


    public static String getRandomCard(String[] cards) {
        Random random = new Random();
        int randomIndex = random.nextInt(cards.length);
        return cards[randomIndex];
    }

    public static boolean isBlackjack(String card1, String card2) {
        return (parseCard(card1) + parseCard(card2) == 21);
    }

    // Category: Large Hand
    //  If you have a pair of aces you must always split them return Split (P)
    //  If you have a Blackjack (two cards that sum up to a value of 21),
    // and the dealer does not have an ace, a figure or a ten then you automatically win (W).
    // If the dealer does have any of those cards then you'll have to stand (s) and wait for the reveal of the other card.
    public static String largeHand(boolean isBlackjack, int dealerScore, String[] cards, String card1, String card2) {
        getRandomCard(cards);
        String result = "";
        if (isBlackjack && dealerScore != 11 || dealerScore == 10) {
            result = "W";
        } else if (dealerScore == 11) {
            result = "S";
        } else if (Objects.equals(card1, "ace") && Objects.equals(card2, "ace")) {
            result = "P";
        } else {
            result = "S";
        }
        return result;
    }

    //Category: Small Hand
    //  If your cards sum up to 17 or higher you should always stand.
    //  If your cards sum up to 11 or lower you should always hit.
    //  If your cards sum up to a value within the range [12, 16]
    //  you should always stand unless the dealer has a 7 or higher,
    //  in which case you should always hit.
    public static String smallHand(int handScore, int dealerScore) {
        String result = "";
        if (handScore >= 17) {
            result = "S";
        } else if (handScore <= 11) {
            result = "H";
        } else {
            if (dealerScore >= 7) {
                result = "H";
            } else {
                result = "S";
            }
        }
        return result;
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public static String firstTurn(String card1, String card2, String dealerCard, String[] cards) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);
        getRandomCard(cards);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore, cards, card1, card2);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}

