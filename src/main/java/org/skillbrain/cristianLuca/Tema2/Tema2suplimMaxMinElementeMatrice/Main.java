package org.skillbrain.cristianLuca.Tema2.Tema2suplimMaxMinElementeMatrice;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int nrRrows;
        int nrColumns;
        Scanner input = new Scanner(System.in);
        //
        System.out.println("Introdu numarul de linii: ");
        nrRrows = input.nextInt();

        System.out.println("Introdu numarul de coloane: ");
        nrColumns = input.nextInt();

        int[][] matrice = new int[nrRrows][nrColumns];

        System.out.println("Introdu elementele matricei: ");
        for (int i = 0; i < nrRrows; i++) {
            System.out.println("Introdu elementele pentru randul nr." + (i + 1) + " si da enter");
            for (int j = 0; j < nrColumns; j++) {
                matrice[i][j] = input.nextInt();
            }
        }
        input = null;

        findMinMax(matrice);
    }

    private static void findMinMax(int[][] matrice) {
        int maxNum = matrice[0][0];
        int minNum = matrice[0][0];
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if (maxNum < matrice[i][j]) {
                    maxNum = matrice[i][j];
                } else if (minNum > matrice[i][j]) {
                    minNum = matrice[i][j];
                }
            }
        }
        System.out.println("*************************************************");
        System.out.println("Maximul elementelor matricei este: "
                + maxNum + " si minimul elementelor matricei este: " + minNum);
    }
}