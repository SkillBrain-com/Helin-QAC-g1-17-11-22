package org.skillbrain.radulescuTeodor.temaExtra;

import java.util.*;

public class tema1{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2,1,5,2, 3, 3, 4, 5, 5));
        System.out.println("Lista inaite de a elimina elementele care se repeta: " + list);

        Set<Integer> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);

        System.out.println("Lista dupa ce am eliminat elementele care se repeta: " +list);
    }

}
