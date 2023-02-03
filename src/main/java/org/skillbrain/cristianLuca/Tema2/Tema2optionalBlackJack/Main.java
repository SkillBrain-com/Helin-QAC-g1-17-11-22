package org.skillbrain.cristianLuca.Tema2.Tema2optionalBlackJack;

public class Main {
    public static void main(String[] args) {
        System.out.println(Blackjack.parseCard("ace")); //return 11
        System.out.println(Blackjack.isBlackjack("queen", "ace")); //return true
        System.out.println(Blackjack.largeHand(true, 7)); //return "W"
        System.out.println(Blackjack.smallHand(15, 12)); //return "H"
    }
}