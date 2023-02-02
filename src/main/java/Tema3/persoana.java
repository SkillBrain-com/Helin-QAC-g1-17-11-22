package Tema3;

public class persoana {
    public static String SPECIE = "homo-sapiens";

    // atribute
    String nume;
    int varsta;
    String adresa;


    // constructori
    persoana() {
    nume = "Maria";
    varsta = 25;
    adresa = "Strada Donath nr 29";
}
persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;

}

    // metode
    void plimbare() {
        System.out.println("Eu ma plimb in parc");
    }
    void gateste() {
        System.out.println("Eu gatesc cina");
    }

    public static boolean respira(int dataDeces) {
        if (dataDeces > 0) {
            return false;
        }else{
            return true;
        }
    }
}