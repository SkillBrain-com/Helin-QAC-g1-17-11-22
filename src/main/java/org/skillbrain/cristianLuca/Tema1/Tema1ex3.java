package org.skillbrain.cristianLuca.Tema1;//6. Scrieti un program in care creati o metoda unde cititi 2 numere de la tastatura, le
//stocati in variabile, si dupa ce le-ati citit, afisati-le pe ecran.

import java.util.Scanner;


class Tema1ex3 {
    public static void main(String[] args) {
        // Enter data using Scanner
        Scanner reader = new Scanner(System.in);

        // Reading two integer numbers from the console
        int a = Integer.parseInt(reader.nextLine());
        int b = Integer.parseInt(reader.nextLine());

        // Printing the numbers
        System.out.println(a);
        System.out.println(b);
    }
}