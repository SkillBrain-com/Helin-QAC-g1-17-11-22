package org.skillbrain.crinaSas.JavaBasics2;

public class MinMax {
    public MinMax() {
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 10, 20, 9, 8, -100, 98, 13, 33};
        int max = maxNumber(arr);
        int min = minNumber(arr);
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }

    private static int maxNumber(int[] array) {
        int max = 0;

        for(int i = 0; i < array.length; ++i) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    private static int minNumber(int[] array) {
        int min = 0;

        for(int i = 0; i > array.length; ++i) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }
}
