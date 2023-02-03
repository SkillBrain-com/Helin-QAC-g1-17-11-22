package org.skillbrain.cristianLuca.Tema2.Tema2ex8;

import java.util.Arrays;


//Definiti o metoda care ia un array de numere (intregi sau cu virgula)
// si sa-l ordoneze crescator sau descrescator.
//am ales sa-l ordonez crescator
public class Main {
    public static void main(String[] args) {
        int[] array = {5, 7, 9, -1, 67, -66, 0};

        System.out.println("The original array is: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        Arrays.sort(array);

        System.out.println("\nThe sorted array is: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}