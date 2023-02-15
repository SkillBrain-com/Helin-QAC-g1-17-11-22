package Tema1;

import java.util.Scanner;

public class Tema1_Exercitii {
    public static void main(String[] args) {
      exercitiu1();
      exercitiu2();
      exercitiu3();
      exercitiu4();
      myVariables();
      exercitiu6();
      exercitiu7();
      exercitiu8();
    }

    static void exercitiu1(){
        System.out.println("Imi place Java");
    }
    static void exercitiu2(){
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
    }


    static void exercitiu3(){
        int Ana, David;
        Ana=24;
        David=Ana-6;
        System.out.println(David);
    }


    static void exercitiu4(){
        Scanner scanner=new Scanner(System.in);
        String propozitie = scanner.nextLine();
        System.out.println(propozitie);
    }

    static void myVariables(){
        int x;
        String s;
        Boolean test;
    }


    static void exercitiu6(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a+" "+b);
    }

    static void exercitiu7(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int suma = a+5;
        System.out.println(suma);
        double scadere = a-12.3;
        System.out.println(scadere);
        double inmultire = a*(-3.2);
        System.out.println(inmultire);
        double impartire = a/4.0;
        System.out.println(impartire);
        int modul = a%6;
        System.out.println(modul);
    }


    static void exercitiu8(){

        int x = 2;
        int y = 12;

        y = x + y;

        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);

    }
}
