package org.skillbrain.danielIrimia.Tema1;

import java.util.Scanner;

public class Tema1 {

    public static void main(String[] args) {

        exercitiu1(); // OK
        exercitiu2(); // OK
        exercitiu3(24, 6); // OK
        exercitiu4();  // OK
        myVariables(); // OK
        exercitiu6(); // 0K
        exercitiu7(); // OK
        exercitiu8(); // OK
    }

    // 1. Scrieti un program care afiseaza “Imi place Java”.
    static void exercitiu1() {
        System.out.println("Imi place Java!");
    }

    // 2. Scrieti un program care afiseaza de 6 ori propozitia “Cursul acesta este foarte fain!”
    static void exercitiu2() {
        for (int i = 1; i < 7; i++) {
            System.out.println(i + " Cursul acesta este foarte fain!");
        }
    }

    // 3. Ana are 24 de ani. Fratele ei, David, e cu 6 ani mai mic. Scrieti un program care afiseaza varsta lui David.
    static void exercitiu3(int ageOfAna, int diffAge) {
        int ageOfDavid = ageOfAna - diffAge;
        System.out.println(ageOfDavid);
    }

    // 4. Scrieti un program in care cititi o propozitie de la tastatura
    static void exercitiu4() {
        System.out.println("Please type a sentence of your choice on keyboard:");

        Scanner userSentence = new Scanner(System.in);
        String sentence = userSentence.nextLine();

        System.out.println("The sentence typed on the keyboard: " + sentence);
    }

    /* 5. Scrieti un program in care definiti 3 variabile in metoda “myVariables”, un int, un
          String si un boolean, apoi apelati metoda din metoda “main” */
    static void myVariables() {
        int age = 35;
        String name = "Daniel";
        boolean isAdult = true;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("It is adult ? " + isAdult);
    }

    /* 6. Scrieti un program in care creati o metoda unde cititi 2 numere de la tastatura, le
          stocati in variabile, si dupa ce le-ati citit, afisati-le pe ecran. */
    static void exercitiu6() {

        System.out.println("Please put the first number");
        Scanner number = new Scanner(System.in);
        double firsNr = number.nextDouble();

        System.out.println("Please put the second number");
        double secondNr = number.nextDouble();

        System.out.println("First number type is: " + firsNr);
        System.out.println("Second number type is: " + secondNr);
    }

    /* 7. Scrieti un program incare cititi de la tastatura un numar, si
    calculati:
        - rezultatul sumei cu 5

        - rezultatul scaderii cu 12.3

        - rezultatul inmultirii cu -3.2

        - rezultatul impartirii cu 4

        - rezultatul modulului cu 6
     */
    static void exercitiu7() {
        System.out.println("Please type a number of your choice:");
        Scanner number = new Scanner(System.in);
        double nr = number.nextDouble();

        double resultSum = nr + 5;
        double resultDecrease = nr - 12.3;
        double resultMultiply = nr * -3.2;
        double resultDivide = nr / 4;
        double resultModule = nr % 6;

        System.out.println("The result of the sum is: " + resultSum);
        System.out.println("The result of the decrease is: " + resultDecrease);
        System.out.println("The result of the multiply is: " + resultMultiply);
        System.out.println("The result of the divide is: " + resultDivide);
        System.out.println("The result of the module is: " + resultModule);
    }

    /* 8. Stergeti un singur comment din programul acesta in asa fel incat rezultatul afisat sa
    fie 12 si 2 */
    static void exercitiu8() {
        int x = 2;
        int y = 12;

        // y = x * y;
        y = x + y;

        x = y - x;
        y = y - x;

        System.out.println("The result of the exercise x is: " + x);
        System.out.println("The result of the exercise y is: " + y);
    }
}

