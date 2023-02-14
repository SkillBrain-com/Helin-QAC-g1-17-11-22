package org.skillbrain.radulescuTeodor.temaExtra;

public class tema3 {
    public static void main(String[] args) {


    int[][] array = {{3, 2, 6}, {4, 5, 11}, {7, 8, 2}};
    int min = array[0][0];
    int max = array[0][0];

   for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) {
            if (array[i][j] < min) {
                min = array[i][j];
            }
            if (array[i][j] > max) {
                max = array[i][j];
            }
        }
    }

System.out.println("Min: " + min);
System.out.println("Max: " + max);

    }

}