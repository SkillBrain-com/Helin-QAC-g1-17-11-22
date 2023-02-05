import java.util.Scanner;

public class RezolvareTema {

    // daca variabilele se declara la nivelul clase atunci se numesc "variabile globale" si se aplica
    // tuturor metodelor din clasa

    // ex: Scanner scanner;
    // folosesc "static" ca sa nu fac copie



    public static void main(String[] args) {
        // scanner-ul citeste de la tastatura
        // System.in -> parametru de intrare = citeste de la tastatura
        // scanner = obiect de referinta (poate avea orice nume dorim noi)
        // metoda Scanner este o variabila locala, adica functioneaza doar in interiorul unei singure metode

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti mesajul dorit:");
        String mesajTastatura = scanner.nextLine();
        System.out.println("Mesajul de la tastatura este " + mesajTastatura);

        // daca scriu scanner = null; -> inseamna ca nu mai am nevie de metoda/variabila

        // y += x <=> y = y + x
        // cand definim o metoda, exista o conventie in java cand primul cuvant al numelui este cu litera mica si mai departe cu litera mare
        // ex: myVariables

        // variabila "final" inseamna ca nu mai putem modifica variabila pe parcurs
        // final static void String OAMENI= "Homo-Sapiens"; ->
        // variabilele finale se scriu mereu cu litere mari de tipar (numele)
        // *, &, ^, %, #, ? -> wild characters;

        final String OAMENI = "Homo-Sapiens";
    }
}
