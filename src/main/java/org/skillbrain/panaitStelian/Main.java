package org.skillbrain.panaitStelian;

import java.util.Random;
import java.util.Scanner;

/* 1. cititi un numar de la tastatura si stocati valoarea lui intro variabila .
 Generati un numar random intr 1 si 100 si stocati acel numar intr-o variabila.
 Daca numarul introdus de la tastatura este mai mic decat numarul random generat,
 afisati mesajul "Numarul introdus este mai mic decat <numar random>".
 ( Inserati valoarea numarului random generat in textul afisat)
 */
 public class Main {
    public static void main(String[] args) {
         int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer number :");
        number = input.nextInt();

        System.out.println("The calculator will generate a random integer number betwen 1 to 100,");
        Random randomNum = new Random();
        int showMe =  randomNum.nextInt(100);

        System.out.println(showMe);

         if (number < showMe) {
             System.out.println("Numarul introdus este mai mic decat "  + showMe + ".");

         }
    }
}