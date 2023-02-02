package org.skillbrain.cristianLuca.Tema3;

public class PigLatin {
    public static Boolean isVowel(char c) {
        return c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' ||
                c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U';
    }

    public static String findPigLatin(String inp) {
        String pigL;
        int i;

        for (i = 0; i < inp.length(); i++) {
            if (isVowel(inp.charAt(i))) {
                break;
            }
        }

        if (i == inp.length()) {
            return "";
        }

        pigL = inp.substring(i);
        pigL += inp.substring(0, i);
        pigL = pigL + "ay";

        return pigL;
    }

}
