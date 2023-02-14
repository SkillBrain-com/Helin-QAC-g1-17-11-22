package java.org.skillbrain.radulescuTeodor.temaJava2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        exercitiul1();
        exercitiul2();
        exercitiul3();
        exercitiul4();
        exercitiul5();
        exercitiul6();
        exercitiul7();
    }


    public static void exercitiul1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti un numar: ");
        int numarIntrodus = scanner.nextInt();

        Random rand = new Random();
        int numarRandom = rand.nextInt(100) + 1;

        if (numarIntrodus < numarRandom) {
            System.out.println("Numarul introdus este mai mic decat " + numarRandom);
        }
    }

    public static void exercitiul2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti un caracter: ");
        char caracter = scanner.next().charAt(0);
        System.out.print("Introduceti primul numar: ");
        int numar1 = scanner.nextInt();
        System.out.print("Introduceti al doilea numar: ");
        int numar2 = scanner.nextInt();

        double rezultatOperatie = operatie(caracter, numar1, numar2);
        System.out.println("Rezultatul operatiei este " + rezultatOperatie);

        scanner.close();
    }

    public static double operatie(char caracter, int numar1, int numar2) {
        switch (caracter) {
            case 'a':
                return numar1 + numar2;
            case 's':
                return numar1 - numar2;
            case 'i':
                return numar1 * numar2;
            case 'p':
                if (numar2 == 0) {
                    System.out.println("Impartirea la zero este imposibila!");
                    return Double.NaN;
                } else {
                    return (double) numar1 / numar2;
                }
            case 'm':
                return numar1 % numar2;
            default:
                System.out.println("Caracter invalid!");
                return Double.NaN;

        }
    }

    public static void exercitiul3() {
        char[] sir = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};

        for (int i = 1; i < 3; i += 2) {
            System.out.println("Al doilea caracter din sir este: " + sir[2]);
        }
    }

    public static void exercitiul4() {
        double[] array = {1.5, 2.3, 3.7, 4.5, 5.2, 6.9};

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 4.5) {
                System.out.println("Elementul este egal cu 4.5: " + array[i]);
            } else if (array[i] > 5) {
                System.out.println("Element peste 5: " + array[i]);
            }
        }
    }

    public static void exercitiul5() {
        int[] array = new int[9];

        for (int i = 0; i < array.length; i++) {
            if (i == 2) {
            } else if (i == 7) {
                break;
            } else {
                System.out.println("Index valid: " + i);
            }
        }
    }

    public static void exercitiul6() {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);

        int suma = 0;
        for (int element : lista) {
            suma += element;
        }

        System.out.println("Suma tuturor elementelor este: " + suma);
    }

    public static void exercitiul7() {
        int[] array = new int[5];
        List<String> lista = new ArrayList<>();

        if (array.length == 0) {
            System.out.println("Array-ul este gol");
        } else {
            System.out.println("Array-ul nu este gol");
        }

        if (lista.isEmpty()) {
            System.out.println("Lista este goala");
        } else {
            System.out.println("Lista nu este goala");
        }
    }



}
