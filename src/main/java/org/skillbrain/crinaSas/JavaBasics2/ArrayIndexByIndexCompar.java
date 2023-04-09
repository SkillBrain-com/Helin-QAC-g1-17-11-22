package org.skillbrain.crinaSas.JavaBasics2;



import java.util.ArrayList;
import java.util.List;

    public class ArrayIndexByIndexCompar {
        public ArrayIndexByIndexCompar() {
        }

        public static void main(String[] args) {
            int[] a = new int[]{1, 4, 5, 7};
            int[] b = new int[]{6, 4, 3, 7};
            List<Integer> arrayList = new ArrayList();

            for(int i = 0; i < a.length; ++i) {
                if (a[i] == b[i]) {
                    arrayList.add(a[i]);
                }
            }

            System.out.println(arrayList);
            Object[] c = arrayList.toArray();
            Object[] var5 = c;
            int var6 = c.length;

            for(int var7 = 0; var7 < var6; ++var7) {
                Object numar = var5[var7];
                System.out.println(String.valueOf(numar) + " ");
            }

        }
    }


