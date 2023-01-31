package Tema2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Tema 2");
        System.out.println("Introdu un numar intreg");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        Random rand = new Random();
        int rand1 = rand.nextInt(100);

        if (i < rand1) {
            System.out.println("Numarul introdus este mai mic decat " + rand1);
        } else {
            System.out.println("Numarul ales este mai mare decat " + rand1);

        }
        System.out.println("Introdu doua numere intregi");
        System.out.println("Introdu primul numar intreg");
        int a = sc.nextInt();
        System.out.println("Introdu al doilea numar intreg");
        int b = sc.nextInt();
        System.out.println("Ati introdus numerele " + a + " si " + b);
        System.out.println("Introduceti unul din caracterele de mai jos :");
        System.out.println("a - pentru adunare");
        System.out.println("s - pentru scadere");
        System.out.println("x - pentru inmultire");
        System.out.println("i - pentru inpartire");
        System.out.println("m - pentru modul");

        String imput = sc.nextLine();
        while (!imput.equals("a") && (!imput.equals("s") && (!imput.equals("x") && (!imput.equals("i") && (!imput.equals("m")))))) {
            System.out.println("Comanda invalida");
            imput = sc.nextLine();
        }
        switch (imput) {
            case "a": {
                System.out.println("Rezultatul adunarii numerelor este " + (a + b));
                break;
            }
            case "s": {
                System.out.println("Rezultatul scaderii numerelor este " + (a - b));
                break;
            }
            case "x": {
                System.out.println("Rezultatul inmultirii numerelor este " + (a * b));
                break;
            }
            case "i": {
                System.out.println("Rezultatul impartirii numerelor este " + (a / b));
                break;
            }
            case "m": {
                System.out.println("Modulul numerelor este " + (a % b));
                break;

            }
        }

        String[][] masini = new String[3][5];
        masini[0][0] = "Dacia";
        masini[1][0] = "Skoda";
        masini[0][4] = "Logan";
        masini[1][4] = "Fabia";
        System.out.println(masini[0][0]);
        System.out.println(masini[1][0]);
        System.out.println(masini[0][4]);
        System.out.println(masini[1][4]);

        exercitiulb4();
        exercitiulb5();
        exercitiulb6();
        exercitiulb7();


    }

    static void exercitiulb4() {
        char[] litere = new char[10];
        litere[0] = 'a';
        litere[1] = 'b';
        litere[2] = 'c';
        litere[3] = 'd';
        litere[4] = 'e';
        litere[5] = 'f';
        litere[6] = 'g';
        litere[7] = 'h';
        litere[8] = 'i';
        litere[9] = 'j';
        for (char i = 0; i < litere.length; i += 2) {
            System.out.print(litere[i]);
        }
    }

    static void exercitiulb5() {
        double[] duble = new double[5];
        duble[0] = 3.5;
        duble[1] = 4.5;
        duble[2] = 5.5;
        duble[3] = 6.5;
        duble[4] = 7.5;
        for (int i = 0; i < duble.length; i++) {
            if (duble[i] == 4.5) {
                System.out.println(duble[i]);
            } else if (duble[i] > 5) {
                System.out.print("Numarul este mai mare de 5 ");
            }
        }
    }

    static void exercitiulb6() {
        Integer[] numere = {11, 22, 33, 45, 89, 45, 86, 7, 4};
        for (int i = 0; i < numere.length; i++) {
            if (i == 2) {
                continue;
            } else if (i > 7) {
                break;

            } else {
                System.out.println("index valid " + numere[i]);
            }
        }
    }

    static void exercitiulb7() {
        Integer[] listanumere = {2, 4, 6, 8, 5};
        int sum = 0;
        for (int i = 0; i < listanumere.length; i++) {
            sum += listanumere[i];
        }
        System.out.println(sum);


    }
}



