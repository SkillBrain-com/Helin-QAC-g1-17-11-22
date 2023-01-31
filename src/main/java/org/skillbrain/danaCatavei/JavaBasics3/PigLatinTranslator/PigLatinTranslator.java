package org.skillbrain.danaCatavei.JavaBasics3.PigLatinTranslator;

import java.util.Scanner;

public class PigLatinTranslator {

        private String pigLatinTranslator;
        private String[] vocale = {"a","e","i","o","u","xt","yt"};


    public PigLatinTranslator(String pigLatinTranslator) {
        this.pigLatinTranslator = pigLatinTranslator;
    }

    String translate(String pigLatinTranslator)  {
        String sirtranslatat="";
        if (beginsWithVowel(pigLatinTranslator)) {
            sirtranslatat = pigLatinTranslator + "ay";
        }
        else {
            if (!beginsWithBlend(pigLatinTranslator)) {
                sirtranslatat = pigLatinTranslator.substring(1) + pigLatinTranslator.charAt(0) + "ay";
            } else {
                sirtranslatat = pigLatinTranslator.substring(2) + pigLatinTranslator.substring(0,2) + "ay";
            }
        }
        return sirtranslatat;
    }

    public String getPigLatinTranslator() {
        return pigLatinTranslator;
    }

    boolean beginsWithVowel (String word)
    {
        boolean estevocala = false;

        for (String v : vocale) {
            int i = word.indexOf(v);
            if (i==0) estevocala = true;
        }
        return estevocala;
    }
    boolean beginsWithBlend (String word)
    {
        return ( word.startsWith ("bl") || word.startsWith ("sc") ||
                word.startsWith ("br") || word.startsWith ("sh") ||
                word.startsWith ("ch") || word.startsWith ("sk") ||
                word.startsWith ("cl") || word.startsWith ("sl") ||
                word.startsWith ("cr") || word.startsWith ("sn") ||
                word.startsWith ("dr") || word.startsWith ("sm") ||
                word.startsWith ("dw") || word.startsWith ("sp") ||
                word.startsWith ("fl") || word.startsWith ("sq") ||
                word.startsWith ("fr") || word.startsWith ("st") ||
                word.startsWith ("gl") || word.startsWith ("sw") ||
                word.startsWith ("gr") || word.startsWith ("th") ||
                word.startsWith ("kl") || word.startsWith ("tr") ||
                word.startsWith ("ph") || word.startsWith ("tw") ||
                word.startsWith ("pl") || word.startsWith ("wh") ||
                word.startsWith ("pr") || word.startsWith ("wr") );
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduceti q pentru Quit");
        System.out.println();
        System.out.println("Introduceti un cuvant : ");

        //String cuvant = sc.next().toLowerCase();
        while(sc.hasNext()) {
            String cuvant = sc.next().toLowerCase();
            PigLatinTranslator plt = new PigLatinTranslator(cuvant);
            System.out.println(plt.translate(plt.getPigLatinTranslator()));

            if(cuvant.equals("q"))
                break;

        }
    }
}


