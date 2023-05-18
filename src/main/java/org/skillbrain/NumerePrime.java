package org.skillbrain;

import utils.Utils;

public class NumerePrime {

    public static void main(String[] args) {
        NumerePrime primeNumber = new NumerePrime();
        System.out.println("Adaugati o valoare de la tastatura: ");
        primeNumber.primeNumber(Utils.scanner().nextInt());
    }
    public void primeNumber(int n){
        for(int i=2; i<=n; i++){
            int counter = 0;
            for( int j=1; j<=i; j++){
                if( i%j==0){
                    counter++;
                }
            }
            if(counter==2){
                System.out.println("Numarul este prim " + i );
            }
        }
    }
}


