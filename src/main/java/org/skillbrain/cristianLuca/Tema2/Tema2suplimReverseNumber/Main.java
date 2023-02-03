package org.skillbrain.cristianLuca.Tema2.Tema2suplimReverseNumber;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int number, reminder;
        int reverseNumber = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the number to revers: ");
        number = input.nextInt();
        System.out.println();

        while (number > 0) {
            reminder = number % 10;
            reverseNumber = reverseNumber * 10 + reminder;
            number = number / 10;
        }
        System.out.format("\nReverse of your number is: %d", reverseNumber);

    }
}