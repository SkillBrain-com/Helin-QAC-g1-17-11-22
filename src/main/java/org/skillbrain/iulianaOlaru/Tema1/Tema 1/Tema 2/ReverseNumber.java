package org.skillbrain.iulianaOlaru.Tema1.Tema

public class ReverseNumber {
    // inversare numar + verificare palindrom

    public static void main(String[] args) {

        System.out.println(isPalindromMath(55));

    }

    // casting = transformare
    static boolean isPalindromMath(int numer) {
        int reverse = 0;
        int original = numer;

        while (numer > 0) {
            int digit = numer % 10;
            reverse = digit + reverse*10;
            numer /= 10;
        }
        return original == reverse;

    }




}
