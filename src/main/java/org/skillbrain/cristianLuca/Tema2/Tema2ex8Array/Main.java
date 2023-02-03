package org.skillbrain.cristianLuca.Tema2.Tema2ex8Array;//Defineste un array. Determina daca array-ul este gol sau nu.
// Am vazut la aceasta adresa  https://www.codespeedy.com/how-to-check-whether-an-array-is-empty-or-not-in-java/
//ca treaba este mai complicata cu faptul ca un array is empty!

public class Main {
    public static void main(String[] args)  {
        int[] arr = {};
        System.out.println("The initial array.");
        if (arr.length == 0) {
            System.out.println("The initial array is empty.");
        } else {
            System.out.println("The initial array is not empty.");
        }

        int[] arrAnother = {0, 1, 2};
        System.out.println("This is another array.");
        if (arrAnother.length == 0) {
            System.out.println("This another array is empty.");
        } else {
            System.out.println("This another array is not empty.");
        }
    }
}

