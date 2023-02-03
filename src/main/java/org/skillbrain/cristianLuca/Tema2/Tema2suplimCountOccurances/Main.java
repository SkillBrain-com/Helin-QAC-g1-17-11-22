package org.skillbrain.cristianLuca.Tema2.Tema2suplimCountOccurances;

import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        String str;

        int counter[] = new int[256]; //256 mean ASCII size

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = scanner.nextLine();

        // loop through the string and count frequency of every character and store it in counter array

        for (int i = 0; i < str.length(); i++) {
            counter[(int) str.charAt(i)]++;
        }

        str = null;

        for (int i = 0; i < counter.length; i++) {
            if (counter[i] > 0) {
                //prints frequency of every character from initial string
                System.out.println((char) i + " has " + counter[i] + " occurances ");
            }
        }
    }
}