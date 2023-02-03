package org.skillbrain.cristianLuca.Tema2.Tema2suplimRemoveDuplicatesList;//Am reusit sa obtin duplicatele
//Nu am stiut cum sa le elimin din lista

import java.util.List;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "A", "B", "B", "C", "D", "D", "Z", "E", "E", "W", "W");
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    System.out.println(list.get(i));
                }
            }
        }
    }
}

