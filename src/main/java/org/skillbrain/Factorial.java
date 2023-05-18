package org.skillbrain;

import utils.Utils;

public class Factorial {

    public static void main(String[] args) {

        Factorial fact = new Factorial();
        System.out.println("Introduceti numarul: ");
        fact.metodaFactorial(Utils.scanner().nextInt());
    }


    public void metodaFactorial(int n){

        int factorial =1;
        for(int i=1; i<=n; i++){

            factorial*=i;

        }
        System.out.println("Factorial pentru " + n + " este: " + factorial);



    }

}
