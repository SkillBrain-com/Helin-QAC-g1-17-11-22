package org.skillbrain.cristianLuca.Tema2.Tema2ex1;/*
Cititi un numar de la tastatura si stocati valoarea lui
intr-o variabila. Generati un numar random intre 1 si 100
si stocati acel numar intr-o alta variabila. Daca numarul
introdus de la tastatura este mai mic decat numarul random
generat, afisati mesajul “Numarul introdus este mai mic
decat <numar_random>” (inserati valoarea numarului random generat in textul afisat).
 */

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);


        System.out.println("Enter an integer number: ");
        number = input.nextInt();

        System.out.println("The calculator will generate a random integer number between 1 to 100.");
        Random randomNum = new Random();
        int showMe = randomNum.nextInt(100);

        System.out.println(showMe);

        if (number < showMe) {
            System.out.println("Numarul introdus este mai mic decat " + showMe + ".");
        }
    }
}
