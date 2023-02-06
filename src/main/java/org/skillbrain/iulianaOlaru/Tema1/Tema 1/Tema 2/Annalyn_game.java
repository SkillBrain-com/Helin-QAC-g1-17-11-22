package org.skillbrain.iulianaOlaru.Tema1.Tema

public class Annalyn_game {


    // declaram variabile globale

    static boolean knightIsAwake = false;
    static boolean archerIsAwake = false;
    static boolean prisonerIsAwake = true;
    static boolean petDogIsPresent = true;

    public static void main(String[] args) {

        System.out.println(canFastAttack(knightIsAwake));
        System.out.println(canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));
        System.out.println(canSignalPrisoner(archerIsAwake, prisonerIsAwake));
        System.out.println(canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent));

    }

    static boolean canFastAttack (boolean knightIsAwake) {
        return !knightIsAwake;
    }

    static boolean canSpy (boolean knight, boolean archer, boolean prisoner) {
        return (!knight || archer || prisoner);
    }

    static boolean canSignalPrisoner (boolean archer, boolean prisoner) {
        return (!archer && prisoner);
    }

    static boolean canFreePrisoner (boolean knight, boolean archer, boolean prisoner, boolean dog) {
        return (!knight && !archer && prisoner && dog);
    }



}
















