package org.skillbrain.radulescuTeodor.temaExtra;

public class tema5 {
    public static void main(String[] args) {
        String str = "Ananas";
        char c = 'a';
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(c)) {
                count++;
            }
        }

        System.out.println("Caracterul '" + c + "' apare de " + count + " ori in cuvantul " + str);
    }
}