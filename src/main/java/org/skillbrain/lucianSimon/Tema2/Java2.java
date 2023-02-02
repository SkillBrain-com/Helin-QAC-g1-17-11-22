package org.skillbrain.lucianSimon.Tema2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Java2 {
    public static void main(String[] args) {
        // tema3
        Tema_2_b1();
        Tema_2_b2();
        Tema_2_b3();
        Tema_2_b4();
        Tema_2_b5();
        Tema_2_b6();
        Tema_2_b7();
        Tema_2_b8();

    }

    static void Tema_2_b1() {


        Scanner intnr1 = new Scanner(System.in);
        double nr1 = 0;

        System.out.println("Introduceti un numar de la tastatura si apasati tasta Enter: ");

        nr1 = intnr1.nextDouble();
        Random rand1 = new Random();
        double nr2 = 0;
        nr2 = rand1.nextInt(100);
        nr2 = nr2 + 1;
        System.out.println("Numarul generat este: " + nr2);
        String rezultat = nr1 <= nr2 ? "Numarul introdus este mai mic sau egal decat: " + nr2 : "Numarul introdus este mai mare decat: " + nr2;
        System.out.println(rezultat);

    }

    static void Tema_2_b2() {
        char operatie;
        double nr1, nr2;
        double rezultat;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti litera corespunzatoare operatiei:a+,s-,i*,p:,m% si apasati tasta Enter: ");
        operatie = scanner.next().charAt(0);
        System.out.println("Introduceti primul numar de la tastatura si apasati Enter: ");
        nr1 = scanner.nextDouble();
        System.out.println("Introduceti al doilea numar de la tastatura si apasati Enter: ");
        nr2 = scanner.nextDouble();
        scanner = null;
        switch (operatie) {

            case 'a':
                rezultat = nr1 + nr2;
                System.out.println("Rezultatul adunarii este: " + rezultat);
                break;
            case 's':
                rezultat = nr1 - nr2;
                System.out.println("Rezultatul scaderii este: " + rezultat);
                break;
            case 'i':
                rezultat = nr1 * nr2;
                System.out.println("Rezultatul inmultirii este: " + rezultat);
                break;
            case 'p':
                rezultat = nr1 / nr2;
                System.out.println("Rezultatul impartirii este: " + rezultat);
                break;
            case 'm':
                rezultat = nr1 % nr2;
                System.out.println("Clasa modulo este: " + rezultat);
                break;
            default:
                System.out.println("Introduceti numai litera corespunzatoare operatiei:a+,s-,i*,p:,m% si apasati tasta Enter: ");
                break;

        }


    }

    static void Tema_2_b3() {


        String[][] magazin = new String[3][5];
        magazin[0][0] = "pantofi";
        magazin[0][1] = "sandale";
        magazin[0][2] = "papuci";
        magazin[0][3] = "slapi";
        magazin[0][4] = "balerini";
        magazin[1][0] = "ciorapi";
        magazin[1][1] = "bretele";
        magazin[1][2] = "sepci";
        magazin[1][3] = "palarii";
        magazin[1][4] = "esarfe";
        magazin[2][0] = "paltoane";
        magazin[2][1] = "lodene";
        magazin[2][2] = "pardesie";
        magazin[2][3] = "geci";
        magazin[2][4] = "veste";
        System.out.println("Articolele cautate sunt: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(magazin[i][j] + " ");

            }
            for (int i1 = 2; i1 >= 1; i1--) {
                for (int j1 = 3; j1 < 5; j1++) {
                    System.out.println(magazin[i1][j1] + " ");

                }
                break;

            }


        }


    }

    static void Tema_2_b4() {

        char[] arrch = new char[10];
        arrch[0] = 'A';
        arrch[1] = 'B';
        arrch[2] = 'C';
        arrch[3] = 'D';
        arrch[4] = 'E';
        arrch[5] = 'F';
        arrch[6] = 'G';
        arrch[7] = 'H';
        arrch[8] = 'I';
        arrch[9] = 'J';

        for (int i = 0; i < arrch.length; i += 2) {
            System.out.println(arrch[i]);
        }

    }

    static void Tema_2_b5() {


        double[] arrdubl = new double[10];
        arrdubl[0] = 0.87;
        arrdubl[1] = 2.47;
        arrdubl[2] = 5.87;
        arrdubl[3] = 4.5;
        arrdubl[4] = 3.87;
        arrdubl[5] = 6.27;
        arrdubl[6] = 1.12;
        arrdubl[7] = 2.22;
        arrdubl[8] = 8.0;
        arrdubl[9] = 2.37;
        double degasit = 4.5;
        boolean gasit = false;

        for (double n : arrdubl) {
            if (n == degasit) {
                gasit = true;
                System.out.println("Elementul " + degasit + " s-a gasit.");
            } else if (n > 5) {
                System.out.println(n + " Element mai mare ca 5.");
            }

        }
    }

    static void Tema_2_b6() {
        double[] arrdubl = new double[9];
        arrdubl[0] = 0.87;
        arrdubl[1] = 2.47;
        arrdubl[2] = 5.87;
        arrdubl[3] = 4.5;
        arrdubl[4] = 3.87;
        arrdubl[5] = 6.27;
        arrdubl[6] = 1.12;
        arrdubl[7] = 2.22;
        arrdubl[8] = 8.0;

        for (int i = 0; i < 8; i++) {

            if (i < 1) {
                System.out.println("Primul element este: " + arrdubl[0]);

            } else if (i == 1) {
                System.out.println("Al doilea element este: " + arrdubl[1]);

            } else if (i == 7) {
                System.out.println("Index valid");
            }


        }

    }

    static void Tema_2_b7(){
        ArrayList<Double> arrdubl=new ArrayList<>();
        arrdubl.add(8.2);
        arrdubl.add(2.55);
        arrdubl.add(5.32);
        arrdubl.add(4.47) ;
        arrdubl.add(3.45);
        arrdubl.add(6.855);
        arrdubl.add(11.365);
        arrdubl.add(222.25);
        arrdubl.add(80.85) ;
        arrdubl.add(437.24);
        double sumlist=0;
        int i=0;
        do { sumlist=sumlist+arrdubl.get(i);
            i++;}
        while (i<arrdubl.size());
        System.out.println("Suma elementelor din lista este: "+sumlist);

    }

    static void Tema_2_b8(){
        ArrayList<Double> arrdubl=new ArrayList<>();
        boolean rasp = arrdubl.isEmpty();
        if (rasp == true)
            System.out.println("Lista este goala");
        else
            System.out.println("Lista nu este goala");


        int arr[] = null;

        if(arr == null) {
            System.out.println("Arr este goala");
        }else{
            System.out.println("Arr nu este goala");
        }



    }

}
