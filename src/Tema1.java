import java.util.Scanner;

public class Tema1 {

    public static void main(String[] args) {

        exercitiul1();
        exercitiul2();
        exercitiul3(24, 6);
        exercitiul4("Hello world!");
        exercitiul5();
        exercitiul6(1,2);
        exercitiul7(12);
        exercitiul8();
        exercitiul9();
        exercitiul10();
        exercitiul11();

    }

    static void exercitiul1() {
        System.out.println("Imi place Java! ");
    }

    static void exercitiul2() {
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
    }


    static void exercitiul3(int varstaAna, int difVarsta) {
        int varstaDaniel = varstaAna - difVarsta;
        System.out.println(varstaDaniel);
    }

    static void exercitiul4(String propozitie){
        System.out.println(propozitie);
    }

    static void exercitiul5(){
        int varsta = 23;
        String nume = "Iuliana";
        boolean om = true;
        System.out.println(varsta);
        System.out.println(nume);
        System.out.println(om);
    }

    static void exercitiul6(int a, int b){
        int primulNrAfis = a;
        int doileaNrAfis = b;
        System.out.println(primulNrAfis);
        System.out.println(doileaNrAfis);
    }

    static void exercitiul7(int n){
        int suma = n + 5;
        float scadere = n - 12.3f;
        float inmultire = n * (-3.2f);
        int impartire = n / 4;
        int modul = n % 6;
        System.out.println(suma);
        System.out.println(scadere);
        System.out.println(inmultire);
        System.out.println(impartire);
        System.out.println(modul);
    }

    static void exercitiul8(){
        int x = 2;
        int y = 12;
        y = x + y; // <=> y += x
        x = y - x;
        y = y - x;
        System.out.println(x);
        System.out.println(y);
    }

    //exercitiul9 va reprezenta exercitiul 4 adaptat cu metoda scanner
    static void exercitiul9(){
        System.out.println("Introduceti textul dorit:");
        Scanner scanner = new Scanner(System.in);
        String propozitie1 = scanner.next();
    }

    //exercitiul10 va reprezenta exercitiul 6 adaptat cu metoda scanner
    static void exercitiul10(){
        System.out.println("Introduceți două numere întregi:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
    }

    //exercitiul11 va reprezenta exercitiul 7 adaptat cu metoda scanner
    static void exercitiul11(){
        System.out.println("Introduceti un numar intreg si apoi calculati:");
        System.out.println("n =");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println("n + 5 =");
        System.out.println(n + 5);
        System.out.println("n - 12.3 =");
        System.out.println(n - 12.3);
        System.out.println("n * (-3.2) =");
        System.out.println(n * (-3.2));
        System.out.println("n / 4 =");
        System.out.println(n / 4);
        System.out.println("n % 6 =");
        System.out.println(n % 6);
    }
}
