package org.skillbrain.danaCatavei.JavaBasics2;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        // instructiunea if

        int a =30;
        int b =20;

        if(a<b){
            System.out.println(a + " este < " +b);
        }
        else if(b>a){
            System.out.println(a + " este > " +b);
        }else{
            System.out.println("Niciuna din conditii nu e adevarata!");

        }



        int x =3;
        switch(x) {
            case 1,3,5,7,9:
                System.out.println("x este impar!");
                break;
            case 2,4,6,8,10:
                System.out.println("x este par!");
                break;
            default:
                System.out.println("Nu este in interval!");
                break;

        }
        if(x%2 == 0){
            System.out.println("x este par!");
        }

        char[] letter = new char[3];
        letter[0]='A'; //ASCII -'A' ->65
        letter[1]='B';
        letter[2]='C';

        System.out.println(letter);

        //array anonim
        String[] nume = {"Popescu", "Ionescu", "Constantinescu"};
        System.out.println(nume); // afiseaza adresa de memorie

        for (int i = 0; i<nume.length ; i++) {

            System.out.println(nume[i]);
        }

        int[] myArray = {1,3,5,7,9,11,13};
        //for-each
        for(int numar : myArray){
            System.out.println(numar);
        }

        int [] arr = {2,1,0};
        for (int i :arr) System.out.println(arr[i]);

//        int arr = {3,2,1}; //eroare out of bounds
//        for (int a :arr) {
//            System.out.println(arr[a]);
//        }

    }
}