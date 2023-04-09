package org.skillbrain.crinaSas.JavaBasics2;

public class ReverseNumber {
    public ReverseNumber() {
    }

    public static void main(String[] args) {
    }

    static boolean isPalindromMath(int number) {
        int reverse = 0;

        int original;
        for(original = number; number > 0; number /= 10) {
            int digit = number % 10;
            reverse += digit + reverse * 10;
        }

        return original == reverse;
    }
}
