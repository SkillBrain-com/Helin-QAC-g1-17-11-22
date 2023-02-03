package org.skillbrain.cristianLuca.Tema2.Tema2ex3;/*
Definiti un array de 2 dimensiuni,
fiecare dimensiune sa aiba cate 3,
respectiv 5 elemente.
Initializati array-ul.
Afisati primele si ultimele elemente din fiecare dimensiune pe ecran.
 */
// Foarte bine! Te rog daca poti, sa-l faci folosing bucla for ;)

public class Tema2ex3 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5},
                {3, 4, 5, 6, 7},
                {8, 9, 10, 11, 12}
        };

      for (int i = 0; i < arr.length; i++) {
          for (int j = 0; j < arr[i].length; j++) {
              if (j == 1 || j == 2 || j == 3) {
                  continue;
              }
              System.out.println(arr[i][j]);
          }
      }

        /*System.out.println(arr[0][0]);
        System.out.println(arr[0][4]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][4]);
        System.out.println(arr[2][0]);
        System.out.println(arr[2][4]);*/
    }
}

