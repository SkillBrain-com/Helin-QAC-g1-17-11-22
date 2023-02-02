package org.skillbrain.panaitStelian;

/*
 Definiti un array de doua dimensiuni,
 fiecare dimensiune sa aiba cate 3 respectiv 5 elemente.
 Initializati array-ul.
 Afisati primele si ultimele elemente din fiecare dimensiune  pe ecran.
 */
public class Exercitul3 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5},{3, 4, 5, 6, 7},{8, 9, 10, 11, 12}};

        System.out.println(arr[0][0]);
        System.out.println(arr[0][4]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][4]);
        System.out.println(arr[2][4]);
        System.out.println(arr[2][4]);

    }
}
