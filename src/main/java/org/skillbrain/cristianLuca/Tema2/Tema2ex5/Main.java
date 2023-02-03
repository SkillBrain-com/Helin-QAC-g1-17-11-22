package org.skillbrain.cristianLuca.Tema2.Tema2ex5;/*
Definiti un array de double,
cu valori zecimale. Iterati array-ul
folosind strutura for, si daca un element
este egal cu valoarea 4.5,
 afisati-l pe ecran. Daca un element este
 mai mare decat 5, afisati mesajul “Element peste 5”
 */

public class Main {
    public static void main(String[] args) {
        // double[] arr = {2.4, 8.0, 4.5, 5.0, 10.5};
        double[] arr = {2.4, 5.0, 4.6, 5.0, 1.5};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4.5) {
                System.out.println("Am gasit pe 4.5.");
            }
            if (arr[i] > 5) {
                System.out.println(arr[i] + " este element peste 5.");
            }
        }
    }
}
