package org.skillbrain.panaitStelian;

import java.util.Random;
import java.util.Scanner;

/* Cititi un caracter si doua numere de la tastatura, si stocati-le in variabile.
 Folosind structura switch, daca sa introdus un caracter anume, realizati operatia
 respectiva cu cele doua numere,si afisati rezultatul pe ecran:

 -'a': adunare
 -'s': scadere
 -'i': inmultire
 -'p': impartire
 -'m': modul
 Daca nu sa introdus un caracter valid, afisati un mesaj de eroare.
*/
public class Exercitiul2 {
    public static void main(String[] args) {

        int nr1;
        int nr2;
        Scanner intnr1 = new Scanner(System.in);
        System.out.println("Introduceti un numar de la tastatura si apasati tasta Enter:");

        nr1 = intnr1.nextInt();
        Random rand1 = new Random();
        nr2 = rand1.nextInt(100);
        nr2 = nr2 + 1;
        System.out.println("Numarul generat este:" + nr2);

        double suma = 0;
        double scadere = 0;
        double inmultire = 0;
        double impartire = 0;
        double modulo = 0;

        int numar1 = 0;
        int numar2 = 0;
        System.out.println("Introduceti litera corespunzatoare operatiei: a+, s-, i*, p:, m% si apassati tasta Enter");
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("");
        while (scanner.hasNext()) {
            char operatie = scanner.next().charAt(0);
            if (operatie == '\n') {
                return;
            }
            System.out.println("Introduceti primul numar de la tastatura si apasati Enter");
            System.out.println("Introduceti al doilea numar de la tastatura si apasati Enter ");
        }
        char operatie = scanner.next().charAt(0);

        switch (operatie) {
            case 'a':
                suma = numar1 + numar2;
                System.out.println("Rezultatul adunari este:" + suma);
                break;
            case 's':
                scadere = numar1 - numar2;
                System.out.println("Rezultatul scaderi este:" + scadere);
                break;
            case 'i':
                inmultire = numar1 * numar2;
                break;
            case 'p':
                impartire = numar1 / numar2;
                System.out.println("Rezultatul impartiri este:" + impartire);
            case 'm':
                modulo = numar1 % numar2;
                System.out.println("Clasa modulo este:" + modulo);
                break;
            default:
                System.out.println("Introduceti numai litera corespunzatoare operatiei: a+, s-, i*, p/, m%");
                break;
        }


    }


}



















