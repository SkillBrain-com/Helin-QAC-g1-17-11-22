package org.skillbrain.cristianLuca.Tema1;

public class Tema1ex1 {
    public static void main(String[] args) {
        exercitiul1();
        exercitiul2();
        System.out.println(exercitiul3());
        myVariables(); //este vorba despre exercitiul5
        exercitiul8();
    }

    public static void exercitiul1() {
        //1. Scrieti un program care afiseaza “Imi place Java”
        System.out.println("Imi place Java");
    }

    public static void exercitiul2() {
        //2. Scrieti un program care afiseaza de 6 ori propozitia “Cursul acesta este foarte fain!”
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
    }

    public static int exercitiul3() {
        //3. Ana are 24 de ani. Fratele ei, David, e cu 6 ani mai mic.
        // Scrieti un program care afiseaza varsta lui David.
        int varstaAna = 24;
        return varstaAna - 6;
    }

    public static void myVariables() {
        //5. Scrieti un program in care definiti 3 variabile in metoda “myVariables”, un int, un
        //String si un boolean, apoi apelati metoda din metoda “main”
        int varstaCristi = 46;
        System.out.println(varstaCristi);
        String nume = "Cristi";
        System.out.println(nume);
        boolean esteCursantSkillBrain = true;
        System.out.println(esteCursantSkillBrain);
    }

    public static void exercitiul8() {
        //8. Stergeti un singur comment din programul acesta in asa
        // fel incat rezultatul afisat sa
        //fie 12 si 2;

        int x = 2;
        int y = 12;

        // y = x * y;
        y = x + y; //aici am sters comment-ul
        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);
    }
}

