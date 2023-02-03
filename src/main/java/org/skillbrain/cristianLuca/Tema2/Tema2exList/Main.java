package org.skillbrain.cristianLuca.Tema2.Tema2exList;//Defineste o lista. Determinati daca ea este goala sau nu.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> languages = new ArrayList<>();
        System.out.println("The brand new ArrayList: " + languages);

        boolean result = languages.isEmpty();
        System.out.println("Is the ArrayList empty? " + result);

        languages.add("Python");
        languages.add("Java");
        languages.add("JavaScript");
        System.out.println("ArrayList has some elements: " + languages);

        result = languages.isEmpty();
        System.out.println("Is the ArrayList empty? " + result);
    }
}
