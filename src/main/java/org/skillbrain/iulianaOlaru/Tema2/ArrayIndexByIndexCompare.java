package org.skillbrain.iulianaOlaru.Tema2;

import java.util.ArrayList;
import java.util.List;

public class ArrayIndexByIndexCompare {


    public static void main(String[] args) {

        int[] a = {1, 4, 5, 7};
        int[] b = {6, 4, 3, 7};

        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) {
                arrayList.add(a[i]);
            }
        }
        System.out.println(arrayList);

        // convertire intr-un array

        Object[] c = arrayList.toArray();
        for (Object numar : c) {
            System.out.print(numar + " ");
        }

    }



}
