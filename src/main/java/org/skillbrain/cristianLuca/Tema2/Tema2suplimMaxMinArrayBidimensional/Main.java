package org.skillbrain.cristianLuca.Tema2.Tema2suplimMaxMinArrayBidimensional;

// Calculez max si min pentru arrayul bidimensional
class Main {

    public static void main(String[] args) {
        int[][] input = {
                {1, 2},
                {1, 15, 6},
                {9, 0, -2, 3},
                {5, 4, 7, 3, 0, -10}
        };

        System.out.println("Max Number of BiDimensional array is: " + getMaxNumber(input));
        System.out.println("Min Number of BiDimensional array is: " + getMinNumber(input));
    }

    public static int getMaxNumber(int[][] array) {
        int maxNumber = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                if (array[i][k] > maxNumber) {
                    maxNumber = array[i][k];
                }
            }
        }
        return maxNumber;
    }

    public static int getMinNumber(int[][] array) {
        int minNumber = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                if (array[i][k] < minNumber) {
                    minNumber = array[i][k];
                }
            }
        }
        return minNumber;
    }

}