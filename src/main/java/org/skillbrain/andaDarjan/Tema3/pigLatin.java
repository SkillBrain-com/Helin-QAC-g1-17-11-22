package org.skillbrain.andaDarjan.Tema3;

public class pigLatin {
    public static void main(String[] args) {

    }
    static boolean isVowel(char ch)
    {
        return (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u');
    }
    static String pigLatinWord(String string)
    {
        int stringlength=string.length();
        int index=-1;
        for (int i=0; i<stringlength; i++)
        {
            if (isVowel(string.charAt(i)))
            {
                index=i;
                break;
            }
        }
        if(index==-1)
            return "-1";
        return string.substring(index) + string.substring(0, index) + "ay";
    }
}
