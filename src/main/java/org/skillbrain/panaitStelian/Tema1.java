package org.skillbrain.panaitStelian;

import java.util.Scanner;

public class Tema1 {
    //psvm

    public static void main(String[] args) {

//ex1();   OK
//ex2();   OK
//ex3(70);  OK
//ex4();  OK
// myVariables(); OK
//ex6(); OK
//exe7(); OK

int x = 2;
int y =12;
// y = x * y;
 y = x + y; // sau  mai poti scrie y += x; <=> y = y + x;
x = y - x;// <=> x -= y ;
y = y - x ; // x /= y;
        System.out.println(x);
        System.out.println(y);








    }
    static void ex1(){
        System.out.println("Imi place java!");



    }
    static void ex2(){
        System.out.println("Cursul asta este fain!");
        System.out.println("cursul asta este fain!");
        System.out.println("cursul asta este fain!");
        System.out.println("Cursul asta este fain!");
        System.out.println("Cursul asta este fain!");
        System.out.println("Cursul asta este fain!");
    }
    static void ex3(int varstaAna){
     int varstaDavid = varstaAna - 6;
     // int varstaDavid = 18 hard coding
        System.out.println("Varsta David =" + varstaDavid);
    }
    static void ex4(){
        Scanner sc = new Scanner(System.in);{
            System.out.println("Scrie un mesaj la tastatura");
            String mesajTastatura = sc.nextLine();
            System.out.println("Mesajul de la tastatura este" + mesajTastatura);
        }







    }

    static void myVariables(){
        int myInt;
        String myString = "text nou";
        boolean myBoolean ;

        myInt =10;
        myBoolean = true;


    }

    static void  ex6(){
 Scanner sc = new Scanner(System.in);
        System.out.println("Introdu un numar intreg");
 int n1 = sc.nextInt();
        System.out.println("Introdu un numar cu virgula");
 double n2 = sc.nextDouble();
 float myFloat = 10.5f;

        System.out.println("n1 =" + n1 +  "n2 =" + n1);


    }

static void exe7(){
        Scanner sc = new Scanner(System.in);
int numarTastatura = sc.nextInt();
int suma = numarTastatura + 5;
float scadere = numarTastatura - 12.3f;
double inmultire = numarTastatura * -3.2;
double impartire = numarTastatura / 4;
int restImpartire = numarTastatura % 6;

    System.out.println("suma =" + suma);
    System.out.println("inmultire =" + inmultire);
    System.out.println("scadere =" + scadere);
    System.out.println("impartire =" +impartire);
    System.out.println("rest impartire =" + restImpartire);


}







}