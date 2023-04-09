package org.skillbrain.crinaSas.JavaBasics2;

public class ContorizareCaractere {
    public ContorizareCaractere() {
    }

    public static void main(String[] args) {
        System.out.println(countChar("Ananas", 'a'));
    }

    private static int countChar(String text, char charText) {
        int count = 0;

        for(int i = 0; i < text.length(); ++i) {
            if (text.toLowerCase().charAt(i) == charText) {
                ++count;
            }
        }

        return count;
    }
}

