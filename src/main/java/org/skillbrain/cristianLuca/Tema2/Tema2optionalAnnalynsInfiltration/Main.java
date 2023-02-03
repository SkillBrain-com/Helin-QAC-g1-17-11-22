package org.skillbrain.cristianLuca.Tema2.Tema2optionalAnnalynsInfiltration;

public class Main {
    public static void main(String[] args) {
        //boolean knightIsAwake = true;
        //System.out.println(AnnalynsInfiltration.canFastAttack(knightIsAwake));
        // Am testat si returneaza false

        //boolean knightIsAwake = false;
        //boolean archerIsAwake = true;
        //boolean prisonerIsAwake = false;
        //System.out.println(AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));
        // Am testat si terurneaza true

        //boolean archerIsAwake = false;
        //boolean prisonerIsAwake = true;
        // System.out.println(AnnalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake));
        // Am testat si returneaza true

        boolean knightIsAwake = false;
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = false;
        boolean petDogIsPresent = false;
        System.out.println(AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent));
        //Am testat si returneaza false

    }
}