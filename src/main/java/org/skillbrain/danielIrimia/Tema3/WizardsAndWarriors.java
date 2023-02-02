package org.skillbrain.danielIrimia.Tema3;
// Instructions
//In this exercise you're playing a role-playing game named "Wizards and Warriors,"
// which allows you to play as either a Wizard or a Warrior.
//There are different rules for Warriors and Wizards to determine how much damage points they deal.
//For a Warrior, these are the rules:
//Deal 6 points of damage if the fighter they are attacking is not vulnerable
//Deal 10 points of damage if the fighter they are attacking is vulnerable
//For a Wizard, these are the rules:
//Deal 12 points of damage if the Wizard prepared a spell in advance
//Deal 3 points of damage if the Wizard did not prepare a spell in advance
//In general, fighters are never vulnerable. However, Wizards are vulnerable if they haven't prepared a spell.
//You have six tasks, each of which will work with fighter instances.

public class WizardsAndWarriors {
    public static void main(String[] args) {

        // 1. Describe a fighter
        // Override the toString() method on the Fighter class to return a description of the fighter,
        // formatted as "Fighter is a <FIGHTER_TYPE>".
        // For example, if the fighter is a Warrior, the description should be "Fighter is a Warrior".
        // If the fighter is a Wizard, the description should be "Fighter is a Wizard".

        Warrior warrior = new Warrior();
        Wizard wizard = new Wizard();
        System.out.println("1.=====================================");
        System.out.println(warrior);
        System.out.println(wizard);

        // 2. Make fighters not vulnerable by default
        // Ensure that the Fighter.isVulnerable() method always returns false.

        System.out.println("2.=====================================");
        System.out.println("Warrior is vulnerable: " + warrior.isVulnerable());

        // 3. Allow Wizards to prepare a spell
        // Implement the Wizard.prepareSpell() method to allow a Wizard to prepare a spell in advance.

        System.out.println("3.=====================================");
        System.out.println("Wizard has prepared a spell: " + (wizard.spells > 0));
        System.out.println("Wizard spells: " + wizard.spells);

        // 4. Make Wizards vulnerable when not having prepared a spell
        // Ensure that the isVulnerable() method returns true if the wizard did not prepare a spell;
        // otherwise, return false.
        wizard.prepareSpell();
        System.out.println("4.=====================================");
        System.out.println("Wizard is vulnerable: " + wizard.isVulnerable());

        // Calculate the damage points for a Wizard
        // Implement the Wizard.damagePoints() method to return the damage points dealt: 12 damage points when a spell
        // has been prepared, 3 damage points when not.
        System.out.println("5.=====================================");
        System.out.println("Wizard damage points: " + wizard.damagePoints(warrior));
        System.out.println("Wizard spells: " + wizard.spells);

        // 6. Calculate the damage points for a Warrior
        // Implement the Warrior.damagePoints() method to return the damage points dealt: 10 damage points
        // when the target is vulnerable, 6 damage points when not.
        System.out.println("6.=====================================");
        System.out.println("Warrior damage points: " + warrior.damagePoints(wizard));
        System.out.println("Wizard spells: " + wizard.spells);



    }
}

abstract class Fighter {

    int spells = 0;

    boolean isVulnerable() {
        return false;
    }

    abstract int damagePoints(Fighter fighter);

    @Override
    public String toString() {
        return "Fighter is " + this.getClass().getSimpleName();
    }

}

class Warrior extends Fighter {


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    int damagePoints(Fighter wizard) {
        return wizard.isVulnerable() ? 10 : 6;
    }
}

class Wizard extends Fighter {

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    boolean isVulnerable() {
        return spells == 0;
    }

    @Override
    int damagePoints(Fighter warrior) {
        if (spells == 0) {
            return 3;
        } else {
            spells -= 1;
            return 12;
        }
    }

    void prepareSpell() {
        spells += 1;
    }
}


