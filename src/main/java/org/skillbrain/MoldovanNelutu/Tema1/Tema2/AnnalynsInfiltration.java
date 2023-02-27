package org.skillbrain.MoldovanNelutu.Tema1.Tema2;

public class AnnalynsInfiltration {
    static boolean knigthIsAwake = true;
    static boolean archerIsAweak = false;
    static boolean prisonerIsAwake = true;
    static boolean petDogIsPresent = true;

    public static void main(String[] args) {

        {
            System.out.println(canFastAttack(knigthIsAwake));
            System.out.println(canSpy(knigthIsAwake, archerIsAweak, prisonerIsAwake));
            System.out.println(canSingalPrisoner(archerIsAweak, prisonerIsAwake));
            System.out.println(canFreePrisoner(knigthIsAwake, archerIsAweak, prisonerIsAwake, petDogIsPresent));
        }


    }

    static boolean canFastAttack(boolean knithIsAwake) {
        return !knithIsAwake;
    }

    static boolean canSpy(boolean knight, boolean archer, boolean prisoner) {
        return (knight || archer || prisoner);
    }

    static boolean canSingalPrisoner(boolean archer, boolean prisoner) {
        return (!archer && prisoner);
    }

    static boolean canFreePrisoner(boolean knight, boolean archer, boolean prisoner, boolean dog) {
        return (!knight && !archer && prisoner && dog);

    }
}
