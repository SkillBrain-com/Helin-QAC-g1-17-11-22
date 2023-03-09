package org.skillbrain.andaDarjan.Tema2;

public class AnnalynsInfiltration {
    public static void main(String[] args) {

        //1. Check if a fast attack can be made
        boolean knightIsAwake = true;
        System.out.println(canFastAttack(knightIsAwake));

        //2. Check if the group can be spied upon
        knightIsAwake = false;
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = false;
        System.out.println(canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));

        //3.Check if the prisoner can be signalled
        archerIsAwake = false;
        prisonerIsAwake = true;
        System.out.println(canSignalPrisoner(archerIsAwake, prisonerIsAwake));

        //4. Check if the prisoner can be free
        knightIsAwake = false;
        archerIsAwake = true;
        prisonerIsAwake = false;
        boolean petDogIsPresent = false;
        System.out.println(canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent));
    }

    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake ) {
        return !knightIsAwake || archerIsAwake && !prisonerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake){
        return !archerIsAwake && prisonerIsAwake;
    }

    public static boolean canFreePrisoner( boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        return knightIsAwake && !archerIsAwake && prisonerIsAwake || !archerIsAwake && petDogIsPresent;
    }

}
