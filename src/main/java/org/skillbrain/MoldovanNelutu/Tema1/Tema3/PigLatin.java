package org.skillbrain.MoldovanNelutu.Tema1.Tema3;

public class PigLatin {
    public static void main(String[] args) {
        System.out.println(PigLatin.pigLatin("DAY"));
    }

    static boolean isVowel(char ch) {
        return (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e'
                || ch == 'I' || ch == 'i' || ch == 'O'
                || ch == 'o' || ch == 'U' || ch == 'u');
    }

    public static String pigLatin(String input) {
        int size = input.length();
        String raspuns = " ";
        for (int i = 0; i < size ; i++) {
            if (isVowel(input.charAt(i))){
                raspuns = input.substring(i);
                break;

            }

        }
        int i = 0;
        if (i == size){
            return "";
        }
        raspuns = raspuns + input.substring(0 , i) + "ay";
        return raspuns;
    }
}

