package org.skillbrain.panaitStelian;
// Defineste o lista. Determinati daca este goala sau nu.

import java.util.ArrayList;

public class Exercitiul8 {

    public static void main(String[] args) {

        ArrayList<String> languages = new ArrayList<>();
        System.out.println("Thr brand new ArrayList:" + languages);

        boolean result = languages.isEmpty();
        languages.add("Python");
        languages.add("Java");
        languages.add("Javascript");
        System.out.println("ArrayList has some elemnts:" + languages);

        result = languages.isEmpty();
        System.out.println("Is the ArrayList empty ?" + result);

    }


}
