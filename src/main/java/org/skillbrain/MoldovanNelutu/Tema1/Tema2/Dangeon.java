package org.skillbrain.MoldovanNelutu.Tema1.Tema2;

import java.util.Random;
import java.util.Scanner;

public class Dangeon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        // variabile de jucator
        int sanatate = 100;
        int atacDeteriorare = 50;
        int potiune = 3;
        int valoareRegenerarePotiune = 30;
        int sansaPotiune = 50;    //procentaj

        // variabile de inamic
        String[] inamici = {"Zombie", "Schelet", "Warrior", "Assasin"};
        int maxSanatateinamic = 75;
        int atacDeterorareinamic = 25;

        boolean running = true;
        System.out.println("Bine ai venit in temnita");
        GAME:
        while (running) {
            System.out.println("======================");
            int sanatateinamic = rand.nextInt(maxSanatateinamic);
            String inamic = inamici[rand.nextInt(inamici.length)];

            System.out.println("/# " + inamic + " a aparut! #");

            while (sanatateinamic > 0) {
                System.out.println(" /t Sanatatea ta este " + sanatate);
                System.out.println(" /t Sanatatea inamicului " + inamic + " este " + sanatateinamic);
                System.out.println("======================");
                System.out.println("/t/n Ce ai vra sa faci? ");
                System.out.println("/t1. Ataca");
                System.out.println("/t2. Bea potiunea");
                System.out.println("/t3. Fugi");

                String input = in.nextLine();
                if (input.equals("1")) {
                    //cod pentru acctiunea de atac
                    int deteriorareProdusa = rand.nextInt(atacDeteriorare);
                    int deteriorarePrimita = rand.nextInt(atacDeterorareinamic);

                    sanatateinamic -= deteriorareProdusa;
                    sanatate -= deteriorarePrimita;
                    System.out.println("*/ l-ai lovit pe " + inamic + " cu " + deteriorareProdusa + atacDeteriorare);
                    System.out.println("*/ Ai primit " + deteriorarePrimita + atacDeteriorare);
                    if (sanatate < 1) {
                        System.out.println("*/ Ai fost lovit prea tare ca sa mai contiunui");
                        break;
                    }

                } else if (input.equals("2")) {
                    //cod pentru actiunea de  bea potiunea
                    if (potiune > 0) {
                        sanatate += valoareRegenerarePotiune;
                        potiune--;
                        System.out.println("/t Ai baut o potiune , te-ai vindecat cu " + valoareRegenerarePotiune +
                                "/n/t Acum ai " + sanatate + " sanatate " + "/n/t ti-au ramas " + potiune + " potiune ");
                    } else {
                        System.out.println(" /t nu mai ai potiuni! Invinge un inamic ca sa mai castigi potiuni /n");
                    }
                } else if (input.equals("3")) {
                    //cod pentru actiunea de a fugi
                    System.out.println("/t Ai fugit de inamic " + inamic);
                    continue GAME;
                } else {
                    System.out.println("/t Comanda invalida ");
                    //cod pentru optiune invalida
                }


            }

            if (sanatate < 1) {
                System.out.println(" Te-am batut crunt in Temnita , esti prea slab. ");
                break;


            }
            System.out.println("======================");
            System.out.println(" # inamic " + inamic + " a fost invins # ");
            System.out.println(" # Ai sanatate " + sanatate + " sanatate # ");

        }
    }
}