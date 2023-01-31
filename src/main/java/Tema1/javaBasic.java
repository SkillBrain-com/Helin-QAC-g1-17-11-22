import java.util.Scanner;
public class javaBasic {
    public static void main(String[] args) {
        exercitiul1();
        exercitiul2();
        exercitiul3(24,6);
        exercitiul4();
        exercitiul5();
        exercitiul6();
        exercitiul7();
    }
    static void  exercitiul1() {
        System.out.println("Imi place Java!");
    }
    static void exercitiul2() {
        System.out.println("Cursul acesta este foarte fain.");
        System.out.println("Cursul acesta este foarte fain.");
        System.out.println("Cursul acesta este foarte fain.");
        System.out.println("Cursul acesta este foarte fain.");
        System.out.println("Cursul acesta este foarte fain.");
        System.out.println("Cursul acesta este foarte fain.");
    }
    static void exercitiul3(int varsta, int diferenta) {
        int varstadaniel = varsta - diferenta;
        System.out.println(varstadaniel);
    }
    static void exercitiul4() {
        System.out.println("Scrie o propozitie");

        Scanner scaneaza = new Scanner(System.in);
        String text = scaneaza.nextLine();
        System.out.println(text);
    }
    static void exercitiul5() {
        int a=5;
        String b = "Salut";
        boolean c = true;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
    static void exercitiul6(){
        System.out.println("Introdu un numar intreg");
        Scanner numar = new Scanner(System.in);
        int nr1 = numar.nextInt();

        System.out.println("Mai introdu un numar intreg");
        int nr2 = numar.nextInt();
        System.out.println("The Outputs:"+nr1+" "+nr2);

    }
    static void exercitiul7() {
        System.out.println("Introdu un numar intreg");
        Scanner numar = new Scanner(System.in);
        Double numar1 = numar.nextDouble();
        System.out.println(adaugare(numar1));
        System.out.println(scadere(numar1));
        System.out.println(inmultire(numar1));
        System.out.println(impartire(numar1));
    }
    public static int afiseaza(int nr1, int nr2){
        int rezultat = nr1;
        return rezultat;

    }
    public static double adaugare(double numar1){
        double rezultat = numar1 + 5;
        return rezultat;
    }
    public static double scadere(double numar1) {
        double rezultat = numar1 - 12.3;
        return rezultat;
    }
    public static double inmultire(double numar1) {
        double rezultat = numar1 * -3.2;
        return rezultat;
    }
    public static double impartire(double numar1) {
        double rezultat = numar1 / 4;
        return rezultat;
    }

}