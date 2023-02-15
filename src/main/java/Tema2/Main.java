package Tema2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exercitiu1();
        exercitiu2();
        exercitiu3();
        exercitiu4();
        exercitiu5();
        exercitiu6();
        exercitiu7();
        exercitiu8();
    }

    static void exercitiu1(){
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();
        int val_random = (int)(Math.random() * 100.0 + 1);

        if (val < val_random)
            System.out.println("Numarul introdus este mai mic decat " + val_random);
    }


    static void exercitiu2(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        char semn = scanner.next().charAt(0);

        switch (semn) {
            case 'a':
                System.out.println(a + b);
                break;
            case 's':
                System.out.println(a - b);
                break;
            case 'i':
                System.out.println(a * b);
                break;
            case 'p':
                System.out.println(a / b);
                break;
            case 'm':
                System.out.println(a % b);
                break;
            default:
                System.out.println("Input invalid");
        }
    }
    static void exercitiu3() {
        int[][] array = new int [3][5];
        int val = 1;

        for (int i = 0; i <= 2; i ++)
            for (int j = 0; j <= 4; j ++) {
                array[i][j] = val;
                val ++;
            }

        for (int i = 0; i <= 2; i ++)
            System.out.println(array[i][0] + " " + array[i][4]);
    }

    static void exercitiu4 (){
        int dimensiune = 26;
        char [] array = new char[dimensiune];
        for (char i = 'a'; i <= 'z'; i ++) {
            array[i - 'a'] = i;
        }

        for (int i = 1; i < dimensiune; i += 2)
            System.out.println(array[i]);
    }

    static void exercitiu5(){
        int dimensiune = 15;
        double [] array = new double[dimensiune];

        for (int i = 0; i < dimensiune; i ++)
            array[i] = 0.5 * i;

        for (int i = 0; i < dimensiune; i ++)
            if (array[i] == 4.5)
                System.out.println(4.5);
            else if (array[i] > 5)
                System.out.println("Element peste 5");
    }

    static void exercitiu6 (){
        int dimensiune = 9;
        int []array = new int[dimensiune];

        for (int i = 0; i < dimensiune; i ++)
            if (i != 2){
                if (i == 7)
                    break;
                else System.out.println("Index valid");
        }
    }

    static void exercitiu7 (){
        ArrayList <Integer> array = new ArrayList<>();
        int suma = 0;

        for (int i = 1; i <= 5; i ++)
            array.add(i);

        for (int val: array)
            suma = suma + val;

        System.out.println(suma);
    }

    static void exercitiu8 () {
        int [] sir = new int[0];

        if (sir.length == 0)
            System.out.println("Array-ul este gol");

        ArrayList <Integer> array = new ArrayList<>();

        if (array.isEmpty())
            System.out.println("Lista este goala");

    }
}
