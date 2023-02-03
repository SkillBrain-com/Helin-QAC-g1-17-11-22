package org.skillbrain.cristianLuca.Tema2.Tema2ex2;/*Cititi un caracter si 2 numere de la tastatura, si stocati-le in variabile.
 Folosind structura switch, daca s-a introdus un caracter anume,
  realizati operatia respectiva cu cele 2 numere, si afisati rezultatul pe ecran:
-‘a’: adaugare
-‘s’: scadere
-‘i’: inmultire
-‘p’: impartire
-‘m’: modul
Daca nu s-a introdus un caracter valid, afisati un mesaj de eroare.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char operator;
        double number1, number2;
        double result;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // ask users to enter operator
        System.out.println("Choose an operator: a, s, i, p or m");
        operator = input.next().charAt(0);

        // ask users to enter numbers
        System.out.println("Enter first number");
        number1 = input.nextDouble();

        System.out.println("Enter second number");
        number2 = input.nextDouble();

        input = null;

        switch (operator) {

            // performs addition between numbers
            case 'a':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            // performs subtraction between numbers
            case 's':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            // performs multiplication between numbers
            case 'i':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            // performs division between numbers
            case 'p':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            // performs remainder between numbers
            case 'm':
                int anotherResult = (int) Math.round(number1) % (int) Math.round(number2);
                System.out.println(number1 + " % " + number2 + " = " + anotherResult);
                break;

            default:
                System.out.println("Error! Invalid operator! Try again!");
        }

    }
}