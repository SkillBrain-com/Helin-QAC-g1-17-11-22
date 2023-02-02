package org.skillbrain.panaitStelian;

public class PigLatin {

    public static void main(String[] args) {
//        System.out.println(suntVocale('u'));

        PigLatin.pigLatin("Alabala");
        System.out.println(PigLatin.pigLatin("PLAX"));


        String word = "Triptray"; //T ? false; i ? true -> iptray-> muta la inceput


    }

// Verificam daca litera respectiva este o vocala;
// vocale sunt{a, e, i, o, u,, ă,  î/â }

    static boolean suntVocale(char ch) {
        return (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' ||
                ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u');
    }

    public static String pigLatin(String input) {
        int size = input.length();
        String raspuns = "";
        int i = 0;
        for ( i = 0; i <= size; i++) {
            if (suntVocale(input.charAt(i))) {
            raspuns = input.substring(i);
            break;
            }
        }
        if (i == size) {
            return "Nu contine vocale";
        }

        raspuns = raspuns + input.substring(0 , i) +"ay";
        return  raspuns;
    }

}






