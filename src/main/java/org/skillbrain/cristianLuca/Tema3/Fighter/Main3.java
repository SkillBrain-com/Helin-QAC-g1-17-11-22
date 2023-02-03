package org.skillbrain.cristianLuca.Tema3.Fighter;

public class Main {
    public static void main(String[] args) {

        Fighter warrior = new Warrior();

        System.out.println(warrior.toString());             // => "Fighter is a Warrior"

        System.out.println(warrior.isVulnerable());         // => false

        Wizard wizard = new Wizard();

        wizard.prepareSpell();

        System.out.println(wizard.isVulnerable());          // => false; daca nu am fi apelat
                                                            // inainte metoda prepareSpell()
                                                            // rezultatul ar fi fost true

        System.out.println(wizard.damagePoints(warrior));   // => 12; daca nu am fi apelat
                                                            // inainte metoda prepareSpell()
                                                            // rezultatul ar fi 3

        System.out.println(warrior.damagePoints(wizard));   // => 6; daca fighter-ul ar fi fost vulnerabil
                                                            // rezultatul ar fi fost 10
    }
}