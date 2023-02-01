package Tema1/*
7. Scrieti un program incare cititi de la tastatura un numar, si
calculati:
        - rezultatul sumei cu 5
        - rezultatul scaderii cu 12.3
        - rezultatul inmultirii cu -3.2
        - rezultatul impartirii cu 4
        - rezultatul modulului cu 6
 */


import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a = Integer.parseInt(reader.nextLine());
        System.out.println(a + 5);
        System.out.println(a - 12.3);
        System.out.println(a * (-3.2));
        System.out.println(a / 4);
        System.out.println(a % 6);
    }
}
