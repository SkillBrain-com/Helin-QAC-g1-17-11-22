package org.skillbrain.crinaSas.JavaBasics2;

import java.util.ArrayList;
import java.util.List;

public class DuplicateElemente {
    public DuplicateElemente() {
    }

    public static void main(String[] args) {
        int[] a = new int[]{4, 5, 4, 6, 3, 1, 7, 9, 3, 4, 5};
        List<Integer> uniqueNumbers = new ArrayList();

        int j;
        for(int i = 0; i < a.length; ++i) {
            int counter = 0;
            if (!uniqueNumbers.contains(a[i])) {
                uniqueNumbers.add(a[i]);
                ++counter;

                for(j = i + 1; j < a.length; ++j) {
                    if (a[i] == a[j]) {
                        ++counter;
                    }
                }
            }

            System.out.println(a[i] + "is found" + counter + "times in the array.");
        }

        System.out.println(uniqueNumbers);
        Object[] uniqueArrayNumbers = uniqueNumbers.toArray();
        System.out.println(uniqueArrayNumbers);
        Object[] var9 = uniqueArrayNumbers;
        j = uniqueArrayNumbers.length;

        for(int var6 = 0; var6 < j; ++var6) {
            Object var10000 = var9[var6];
            System.out.print("0 ");
        }

    }
}
