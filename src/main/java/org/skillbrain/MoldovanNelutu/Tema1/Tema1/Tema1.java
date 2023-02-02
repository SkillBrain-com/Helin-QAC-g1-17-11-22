package org.skillbrain.MoldovanNelutu.Tema1.Tema1;

import java.util.Scanner;

public class Tema1 {

    public static void main(String [] args) {

 //       ex1();  ok
 //       ex2();  ok
 //       ex3();  ok
 //       ex4();  ok
 //       myVariablesex5();  ok
 //       ex6();  ok
 //       ex7();  ok
 //       ex8();  ok
    }

            static void ex1() {

        System.out.println("Imi place Java!");

            }
            static void ex2(){
                System.out.println("Cursul acesta este foarte fain!");
                System.out.println("Cursul acesta este foarte fain!");
                System.out.println("Cursul acesta este foarte fain!");
                System.out.println("Cursul acesta este foarte fain!");
                System.out.println("Cursul acesta este foarte fain!");
                System.out.println("Cursul acesta este foarte fain!");
            }
            static void ex3(){
            int varstaAna = 24;
            int varstaDavid = varstaAna - 6;
                System.out.println("varstaDavid =" +varstaDavid);

            }
            static void ex4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Scrie un mesaj de la tastatura Nelutu!");
        String mesajTastatura = sc.nextLine();
        System.out.println("mesajul de la tastatura este" + mesajTastatura);
            }
            static void myVariablesex5(){
        int myint;
        String myString = "un text oarecare scris de mine";
        boolean myBoolean = false;
        myint = 33;
            }
            static void ex6(){
                Scanner sc = new Scanner(System.in);
                System.out.println("introdu un numar intreg;");
                int n1 = sc.nextInt();
                System.out.println("introdu un numar cu virgula;");
                double n2 = sc.nextDouble();
                System.out.println("n1 =" +n1 + "n2 = " +n2);

            }
            static void ex7(){
            Scanner sc = new Scanner(System.in);
            int numarTasta = sc.nextInt();

            int suma = numarTasta + 5;
            double scadere = numarTasta - 12.3;
            double inmultire = numarTasta * -3.2;
            double impartire = numarTasta / 4;
            int restImpartire = numarTasta % 6;
            System.out.println("sum = " + suma);
            System.out.println("scadere = " + scadere);
            System.out.println("inmultire = " + inmultire);
            System.out.println("impartire = " + impartire);
            System.out.println("restImpartire = " + restImpartire);
            }
            static void ex8(){
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
