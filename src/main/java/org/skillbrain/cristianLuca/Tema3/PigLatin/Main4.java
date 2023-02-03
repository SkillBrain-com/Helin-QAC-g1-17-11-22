package org.skillbrain.cristianLuca.Tema3.PigLatin;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        String str;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        str = input.nextLine();

        String ans = PigLatin.findPigLatin(str);

        if (ans.equals("")) {
            System.out.println("The Pig Latin version of the string " + str + " isn't possible.");
        } else {
            System.out.println("The Pig Latin version of the string " + str + " is " + ans + ".");
        }
    }
}