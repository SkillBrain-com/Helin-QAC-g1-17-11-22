package org.skillbrain.cristianLuca.Tema3;

public class Main6 {
    public static void main(String[] args) {

        Game game = new Game();
        String userPick = game.getUserPick();
        String computerPick = game.getComputerPick();
        String result = game.getResult(userPick, computerPick);

        System.out.println("User Pick: " + userPick);
        System.out.println("Computer Pick: " + computerPick);
        System.out.println("You " + result);

    }
}