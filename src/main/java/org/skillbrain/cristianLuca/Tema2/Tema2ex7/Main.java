package org.skillbrain.cristianLuca.Tema2.Tema2ex7;

import java.util.ArrayList;
import java.util.List;

/*
Definiti o lista de Integer,
de 5 elemente. Calculati suma
tuturor elementelor.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(100);
        numberList.add(2023);

        int sum = 0;
        for (int element : numberList) {
            sum += element;
        }

        System.out.println("The sum of the list's elements is " + sum + ".");

    }
}
