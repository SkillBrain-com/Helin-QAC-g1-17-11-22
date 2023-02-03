package org.skillbrain.cristianLuca.Tema2.Tema2ex6;

/*
Definiti un array cu 9 elemente si parcugeti-l
cu structura for (tipul de date este la alegere).
Daca iteratia este la indexul 2, sa se sara peste.
Daca iteratia este la indexul 7,
sa se opreasca iteratia. Altfel,
sa se afiseze mesajul “Index valid” pe ecran.
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 9, 10, 11, 78, 8, 3};
        for (int i = 0; i < arr.length; i++) {
            if (i == 2) {
                continue;
            }
            //System.out.println(arr[i]);
            else if (i == 7) {
                break;
            }
            System.out.println(arr[i]); //am folosit-o ca sa ma conving ca se indeplinesc cerintele task-ului
        }
    }
}
