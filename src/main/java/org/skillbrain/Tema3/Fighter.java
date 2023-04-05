package org.skillbrain.Tema3;

public class Fighter {
    public void main(String[] args) {
        Fighter wizard = new Wizard();
        Fighter warrior = new Warrior();
        System.out.println("warrior.toString()");
        System.out.println("wizard.toString()");
        System.out.println("warrior.isVulnerable()");
        System.out.println("wizard.isVulnerable()");
        wizard.prepareSpell();
        System.out.println("wizard.isVulnerable()");
        System.out.println("warrior.damagePoints(wizard)");
        System.out.println("wizard.damagePoints(warrior)");
        System.out.println("wizard.damagePoints(warrior)");
        System.out.println("warrior.damagePoints(wizard)");
    }
    boolean isVulnerable() {
        return false;
    }

    void prepareSpell(){

    }

    int damagePoints (Fighter persoana){
        return 0;
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
    int spells;
    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    @Override
    int damagePoints(Fighter warrior) {
        if (spells == 0) {
            return 3;
        }
        spells -= 1;
        return 12;
    }
    @Override
    void prepareSpell() {
        spells += 1;
    }
}
}

