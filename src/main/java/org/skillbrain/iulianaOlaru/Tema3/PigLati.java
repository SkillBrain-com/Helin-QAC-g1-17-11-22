package org.skillbrain.iulianaOlaru.Tema3;

public class PigLati {

    public static void main(String[] args) {
//        System.out.println(isVowel('b'));
//        String word = "Triptray"; // T ? false; r ? false; i ? true -> iptray -> muta la inceput
        // iptray + -> Tri -> + ay = iptrayTriay

        /* "A l a b a l a" -> subString(0, 3) => A l a */

        System.out.println(PigLati.pigLatin("plx"));
    }

    static boolean isVowel(char ch)
    {
        return (ch == 'A'|| ch == 'a'|| ch == 'E'|| ch == 'e'
                || ch == 'I'|| ch == 'i'|| ch == 'O'|| ch == 'o'
                || ch == 'U'||ch == 'u');
    }
    public static String pigLatin(String input){
        int size = input.length();
        String respons = "";
        int i =0;
        for (i = 0; i <size; i++){
            if (isVowel(input.charAt(i))){
                respons = input.substring(i);
                break;
            }
        }
        if (i == size){
            return "Nu contine vocale";
        }
        respons = respons + input.substring(0, i) + "ay";
        return respons;
    }





}
