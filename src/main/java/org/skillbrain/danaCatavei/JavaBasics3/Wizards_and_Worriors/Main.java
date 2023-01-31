package org.skillbrain.danaCatavei.JavaBasics3.Wizards_and_Worriors;

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
