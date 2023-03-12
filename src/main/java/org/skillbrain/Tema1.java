package org.skillbrain;

import java.util.Scanner;

public class Tema1 {
    public static void main(String[] args) {

       exercitiul1();
       exercitiul2();
       exercitiul3(24);
       exercitiul4();
       exercitiul5();
       exercitiul6();
       exercitiul7();
       exercitiul8();
    }
         static void exercitiul1 () {
            System.out.println("Imi place java");
        }
        static void exercitiul2 () {


            System.out.println("Cursul acesta este foarte fain");
            System.out.println("Cursul acesta este foarte fain");
            System.out.println("Cursul acesta este foarte fain");
            System.out.println("Cursul acesta este foarte fain");
            System.out.println("Cursul acesta este foarte fain");
            System.out.println("Cursul acesta este foarte fain");
        }
        static void exercitiul3 ( int varstra_Ana){
            int varsta_Ana = 24;
            int varsta_David = varsta_Ana - 6;
            System.out.println("Varsta lui David este " + varsta_David);
        }
        static void exercitiul4 () {
            Scanner propozitie = new Scanner(System.in);
            System.out.println("Introdu o propozitie:");
            String text = propozitie.nextLine();
            System.out.println("Propozitia introdusa de la tastatura este: " + text);
        }

        static void exercitiul5 () {
            int myInt;
            String myString;
            boolean myBoolean;
        }
        static void exercitiul6 () {
            Scanner numar = new Scanner(System.in);
            System.out.println("introdu numar1:");
            int numar1 = numar.nextInt();
            System.out.println("introdu numar2:");
            int numar2 = numar.nextInt();
            System.out.println("numerele sunt " + numar1 + " si " + numar2);
        }
        static void exercitiul7 () {
            Scanner citire = new Scanner(System.in);
            System.out.println("introdu numar:");
            double numar = citire.nextDouble();
            double sum = numar + 5;
            double scadere = numar - 12.3;
            double inmultire = numar * -3.2;
            double impartire = numar / 4;
            double modul = numar % 6;
            System.out.println("Rezultatul sumei este " + sum);
            System.out.println("Rezultatul scaderii este " + scadere);
            System.out.println("Rezultatul inmultirii este " + inmultire);
            System.out.println("Rezultatul impartirii este " + impartire);
            System.out.println("Rezultatul modulului este " + modul);
        }
        static void exercitiul8 () {
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












