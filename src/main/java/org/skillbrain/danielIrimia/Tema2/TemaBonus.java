package org.skillbrain.danielIrimia.Tema2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class TemaBonus {
    public static void main(String[] args) {

        /*1. Citit un numar de la tastatura si stocati valoarea lui intr-o variabila.
            Generati un numar random intre 1 si 100 si stocati acel numar intr-o alta variabila.
            Daca numarul introdus de la tastatura este mai mic decat numarul random generat,
            afisati mesajul “Numarul introdus este mai mic decat <numar_random>”
            (inserati valoarea numarului random generat in textul afisat).*/

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number:");

        int numberIn = in.nextInt();
        Random random = new Random();
        int randomNr = random.nextInt(100) + 1;

        if (numberIn < randomNr) {
            System.out.println("The entered number is less than " + randomNr );
        } else {
            System.out.println("The entered number is greater than " + randomNr);
        }
        System.out.println("====================================");

        /*2. Citit un caracter si 2 numere de la tastatura, si stocati-le in variabile.
            Folosind structura switch, daca s-a introdus un caracter anume, realizati
            operatia respectiva cu cele 2 numere, si afisati rezultatul pe ecran:
                -‘a’: adaugare
                -‘s’: scadere
                -‘i’: inmultire
                -‘p’: impartire
                -‘m’: modul
            Daca nu s-a introdus un caracter valid, afisati un mesaj de eroare.*/

        // var for numbers and operator
        char operator;
        double firstNumber;
        double secondNumber;
        double result = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Please type the first number of your choice:");
        firstNumber = input.nextDouble();

        System.out.println("Please type the second number of your choice:");
        secondNumber = input.nextDouble();

        System.out.println("Choose an operator from the following selections: " +
                "'a': addition " +
                "'s': subtraction " +
                "'x': multiplication " +
                "'d': division " +
                "'m': modulus");
        operator = input.next().charAt(0);

        switch (operator) {
            case 'a': {
                result = firstNumber + secondNumber;
                System.out.println("The sum of the " + firstNumber +
                        " and " + secondNumber + " is: " + result);
                break;
            }
            case 's': {
                result = firstNumber - secondNumber;
                System.out.println("The subtraction of the " + firstNumber +
                        " with " + secondNumber + " is: " + result);
                break;
            }
            case 'x': {
                result = firstNumber * secondNumber;
                System.out.println("Multiplying " + firstNumber +
                        " with " + secondNumber + " is: " + result);
                break;
            }
            case 'd': {
                result = firstNumber / secondNumber;
                System.out.println("Dividing " + firstNumber +
                        " with " + secondNumber + " is: " + result);
                break;
            }
            case 'm': {
                result = firstNumber % secondNumber;
                System.out.println("The modulus of the " + firstNumber +
                        " with " + secondNumber + " is: " + result);
                break;
            }
            default: {
                System.out.println("Invalid input please put a valid character");
            }
        }
        System.out.println("====================================");

        /*3. Definiti un array de 2 dimensiuni, fiecare dimensiune sa aiba cate 3,
             respectiv 5 elemente. Initializati array-ul.
             Afisati primele si ultimele elemente din fiecare dimensiune pe ecran.*/

        int[][] arr = {
                {7, 43, 43, 345, 34},
                {6, 33, 44, 53, 8},
                {5, 23, 6, 23, 9}
        };

        for (int i = 0; i < arr.length; i++) {
            System.out.println("First element of dimension " + i + " is: " + arr[i][0]);
            System.out.println("Last element of dimension " + i + " is: " + arr[i][arr[i].length - 1]);
        }
        System.out.println("====================================");

        //4. Definiti un array de char-uri. Iterati array-ul folosind structura for,
        // si afisati pe ecran cate al doilea caracter din sir.

        char[] charArr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        for (int i = 0; i < charArr.length; i++) {
            if (i % 2 == 0) {
                System.out.println(charArr[i]);
            }
        }
        System.out.println("====================================");

        //5. Definiti un array de double, cu valori zecimale.
        // Iterati array-ul folosind strutura for, si daca un element este egal cu valoarea 4.5, afisati-l pe ecran.
        // Daca un element este mai mare decat 5, afisati mesajul “Element peste 5”

        double [] doubleArr = {22.5, 40.5 , 4.5, 6.7, 8.9, 10.11, 12.13, 14.15};
        for (int i = 0; i < doubleArr.length; i++) {
            if (doubleArr[i] == 4.5) {
                System.out.println("Element is equal with " + doubleArr[i]);
            } else if (doubleArr[i] > 5) {
                System.out.println("Element over 5");
            } else {
                System.out.println("Element under 5");
            }
        }
        System.out.println("====================================");

        //6. Definiti un array cu 9 elemente si parcugeti-l cu structura for (tipul de date este la alegere).
        //   Daca iteratia este la indexul 2, sa se sara peste. Daca iteratia este la indexul 7,
        //   sa se opreasca iteratia. Altfel, sa se afiseze mesajul “Index valid” pe ecran.

        int[] arr2 = {10, 2, 4, 50, 8, 6, 5, 87, 4};
        for (int i = 0; i < arr.length; i++) {
            if (arr2[i] == 2) {
                System.out.println("Index is " + i + " and value is " + arr2[i]);
                continue;
            } else if (arr2[i] == 7) {
                System.out.println("Index is " + i + " and value is " + arr2[i]);
                break;
            } else {
                System.out.println("Index valid " + i + " and value is " + arr2[i]);
            }
        }
        System.out.println("====================================");

        //7. Definiti o lista de Integer, de 5 elemente. Calculati suma tuturor elementelor.
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println("Sum of all elements is: " + sum);
        System.out.println("====================================");

        //8. Definiti un array si o lista. Determinati daca ele sunt goale sau nu.
        int[] array = new int[0];
        ArrayList<Integer> list2 = new ArrayList<>();
        boolean arrIsEmpty = array.length == 0;
        boolean listIsEmpty = list2.isEmpty();

        System.out.println("Is the array is empty? " + arrIsEmpty);
        System.out.println("Is the ArrayList is empty? " + listIsEmpty);
        System.out.println("====================================");

        array = new int[]{1, 2, 3, 4, 5};

        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);

        arrIsEmpty = array.length == 0;
        listIsEmpty = list2.isEmpty();
        System.out.println("Is the array is empty? " + arrIsEmpty);
        System.out.println("Is the ArrayList is empty? " + listIsEmpty);

        input.close();
        in.close();
    }
}

