package org.skillbrain.panaitStelian;

/*
Definiti un array de double, cu valori zecimale.
Iterati array-ul folosind structura for, si daca
un element este cu valaorea 4.5, afisati-l pe ecran.
Daca un elemen este mai mare decat 5 afisati mesajul
"Element peste 5"
*/
public class Exercitiul5 {
    public static void main(String[] args) {
        double[] arr = {2.4, 8.0, 4.5, 5.0, 10.5};
        for (int i = 0; i < arr.length; i++) ;
        int i = 0;
        if (arr[i] == 4.5) {
            System.out.println("Am gasit peste 4.5");
        }
        if (arr[i] > 5) {

            System.out.println(arr[i]+ "este element peste 5.");
        }

        System.out.println(arr[i]);
    }

}
