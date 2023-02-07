package org.skillbrain.andaDarjan;

import java.util.Scanner;

public class Tema1 {
    public static void main(String[] args) {

        exercitiul1();
        exercitiul2();
        exercitiul3();
        exercitiul4();
        myVariables();
        exercitiul6();
        exercitiul7();
        exercitiul8();

    }

    static void exercitiul1() {
        System.out.println("Imi place Java");
    }

    static void exercitiul2() {
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
    }

    static void exercitiul3() {
        int varstaAna = 24;
        int varstaDavid = varstaAna - 6;
        System.out.println("varstaDavid =" + varstaDavid);
    }

    static void exercitiul4() {
        Scanner scanner = new Scanner(System.in);
        String mesajTastatura = scanner.nextLine();
        System.out.println("mesajul de la tastatura este" + mesajTastatura);
    }

    static void myVariables() {
        int myInt;
        String myStryng;
        boolean myBoolean; 
    }

    static void exercitiul6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introdu un numar intreg");
        int a = scanner.nextInt();
        System.out.println("introdu un numar fractionar");
        double i = scanner.nextDouble();

        System.out.println("a=" + a + "i=" + i);
    }

    static void exercitiul7() {
        Scanner scanner = new Scanner(System.in);
        int numarTasta = scanner.nextInt();
        int suma = numarTasta + 5;
        double scadere = numarTasta - 12.3;
        double inmultire = numarTasta * -3.2;
        double impartire = numarTasta / 4;
        int modul = numarTasta % 6;

        System.out.println("suma =" + suma);
        System.out.println("scadere =" + scadere);
        System.out.println("inmultire =" + inmultire);
        System.out.println("impartire =" + impartire);
        System.out.println("modul =" + modul);
    }

    static void exercitiul8() {
        int x = 2;
        int y = 12;
        // y = x * y;
        y = x + y;
        x = y - x;
        y = y - x;
        System.out.println(x);
        System.out.println(y);
    }

}