package org.skillbrain.lucianSimon.Tema1;

import java.util.Scanner;

public class Java1 {

    public class Main {
        public static void main(String[] args) {

            exer1();
            exer2();
            exer3(24, 6);
            exer4();
            myVariables();
            exer6();
            exer7();
            exer8();

        }

        static void exer1() {
            System.out.println("Imi place Java");
        }

        static void exer2() {
            for (int i = 0; i < 6; i++)
                System.out.println("Cursul acesta este foarte fain!");
        }

        static void exer3(int valina, int difv) {
            int vDan = valina - difv;
            System.out.println(vDan);
        }

        static void exer4() {
            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine();  // aveti deja o referinta numita scanner, String-ul trebuie sa aiba alt nume; am redenumit String text = scanner.nextLine();
            System.out.println(text);   // variabila text trebuie printata in consola (String)
        }

        static void myVariables() {
            int intreg = 10;
            String sirul1 = "Buna ziua!";
            boolean bulian = true;
            System.out.println(intreg);
            System.out.println(sirul1);
            System.out.println(bulian);
        }

        static void exer6() {
            Scanner numere = new Scanner(System.in);
            System.out.println("Introdu doua numere: ");
            float a1 = numere.nextFloat();
            float b1 = numere.nextFloat();

        }

        static void exer7() {
            Scanner numar = new Scanner(System.in);
            System.out.println("Introdu numarul: ");
            double nr1 = numar.nextFloat();
            double adun = nr1 + 5;
            System.out.println("Rezultatul sumei: " + adun);
            double scad = nr1 - 12.3;
            System.out.println("Rezultatul scaderii: " + scad);
            double mult = nr1 * (-3.2);
            System.out.println("Rezultatul inmultirii: " + mult);
            double impart = nr1 / 4;
            System.out.println("Rezultatul impartirii: " + impart);
            double mod6 = nr1 % 6;
            System.out.println("Restul: " + mod6);
        }

        static void exer8() {

      /*  public class Solution {

            public static void main(String[] args) {*/

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



}
