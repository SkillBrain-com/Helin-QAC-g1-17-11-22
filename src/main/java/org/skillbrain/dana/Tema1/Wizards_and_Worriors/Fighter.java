package org.skillbrain.dana.Tema1.Wizards_and_Worriors;

abstract class Fighter {

    boolean isVulnerable() {
        {
            return false;
        }
    }

    abstract int damagePoints(Fighter fighter);

}

class Warrior extends Fighter {

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    int damagePoints(Fighter wizard) {
        return wizard.isVulnerable() ? 10 : 6;
    }
}

class Wizard extends Fighter {
    private int spells;
    @Override
    boolean isVulnerable() {
        return spells == 0;
    }

    @Override
    int damagePoints(Fighter warrior) {
        if (spells == 0) {
            return 3;
        }
        spells -= 1;
        return 12;
    }

    void prepareSpell() {
        spells += 1;
    }

}

class Main {
    public static void main(String[] args) {
        //Override the toString() method on the Fighter class to return a description of the fighter, formatted as "Fighter is a <FIGHTER_TYPE>".
        Fighter warrior = new Warrior();
        System.out.println(warrior.toString());
        // => "Fighter is a Warrior"

        //Ensure that the Fighter.isVulnerable() method always returns false.

        System.out.println(warrior.isVulnerable());
        // => false
        //Implement the Wizard.prepareSpell() method to allow a Wizard to prepare a spell in advance.

        Wizard wizard = new Wizard();
        wizard.prepareSpell();
        //Ensure that the isVulnerable() method returns true if the wizard did not prepare a spell; otherwise, return false.

        System.out.println(wizard.isVulnerable());
        // => true

        //Implement the Wizard.damagePoints() method to return the damage points dealt: 12 damage points when a spell has been prepared, 3 damage points when not.
        Warrior warrior1 = new Warrior();

        wizard.prepareSpell();
        System.out.println(wizard.damagePoints(warrior1));


        System.out.println(warrior.damagePoints(wizard));
// => 10

    }
}