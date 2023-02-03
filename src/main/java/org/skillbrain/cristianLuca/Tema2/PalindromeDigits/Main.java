package org.skillbrain.cristianLuca.Tema2.PalindromeDigits;

import java.util.Scanner;

class Main {
    public static void main(String arg[]) {
        int n, t, s;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = input.nextInt();
        t = n;
        s = palindromeDigitsOrNot(n);
        if (s == t) {
            System.out.println(t + " is a palindrome number.");
        } else {
            System.out.println(t + " is not a palindrome number.");
        }
    }

    public static int palindromeDigitsOrNot(int num) {
        int sum = 0, r;
        while (num > 0) {
            r = num % 10;
            sum = (sum * 10) + r;
            num /= 10;
        }
        return sum;
    }
}