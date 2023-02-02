package org.skillbrain.danielIrimia.Tema3;
// Instructions
// Implement a program that translates from English to Pig Latin.
// Pig Latin is a made-up children's language that's intended to be confusing. It obeys a few simple rules (below),
// but when it's spoken quickly it's really difficult for non-children (and non-native speakers) to understand.
// Rule 1: If a word begins with a vowel sound, add an "ay" sound to the end of the word. Please note that "xr"
// and "yt" at the beginning of a word make vowel sounds (e.g. "xray" -> "xrayay", "yttria" -> "yttriaay").
// Rule 2: If a word begins with a consonant sound, move it to the end of the word and then add an "ay" sound to the
// end of the word. Consonant sounds can be made up of multiple consonants, a.k.a. a consonant cluster (e.g. "chair" ->
// "airchay").
// Rule 3: If a word starts with a consonant sound followed by "qu", move it to the end of the word, and then add
// an "ay" sound to the end of the word (e.g. "square" -> "aresquay").
// Rule 4: If a word contains a "y" after a consonant cluster or as the second letter in a two-letter word it makes a
// vowel sound (e.g. "rhythm" -> "ythmrhay", "my" -> "ymay").
// There are a few more rules for edge cases, and there are regional variants too.
// See http://en.wikipedia.org/wiki/Pig_Latin for more details.

public class PigLatin {

    public static void main(String[] args) {
        String input = "apple";
        System.out.println("The pig latin of " + input + " is " + pigLatin(input));
        input = "eat";
        System.out.println("The pig latin of " + input + " is " + pigLatin(input));
        input = "chair";
        System.out.println("The pig latin of " + input + " is " + pigLatin(input));
        input = "square";
        System.out.println("The pig latin of " + input + " is " + pigLatin(input));
        input = "rhythm";
        System.out.println("The pig latin of " + input + " is " + pigLatin(input));
        input = "my";
        System.out.println("The pig latin of " + input + " is " + pigLatin(input));
        input = "the";
        System.out.println("The pig latin of " + input + " is " + pigLatin(input));
        input = "What is this?";
    }


    static boolean isVowel(char ch) {
        return (ch == 'A' || ch == 'a' || ch == 'E'
                || ch == 'e' || ch == 'I' || ch == 'i'
                || ch == 'O' || ch == 'o'
                || ch == 'U' || ch == 'u');
    }

    public static String pigLatin(String input) {
        int size = input.length();
        String output = "";
        int i;
        for (i = 0; i < size; i++) {
            if (isVowel(input.charAt(i))) {
                break;
            }
        }
        if (i == 0) {
            output = input + "ay";
        } else {
            output = input.substring(i) + input.substring(0, i) + "ay";
        }
        return output;
    }
}









