package org.skillbrain.panaitStelian;

public abstract class Fighter {

    abstract int damagePoints(Fighter fighter);
    boolean  isVulnerable(){
        return false;
    }

    @Override
    public String toString() {
        return " Fighter is "  + " "  + this.getClass().getSimpleName();
    }
}
class Warrior extends Fighter{
    @Override
    boolean isVulnerable(){
        return true;
    }


    @Override
    int damagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? 10:6;
    }

    public static void main(String[] args) {
        Fighter warrior = new Warrior();
        System.out.println(warrior);
        Fighter wizard = new Wizard();
        System.out.println(warrior.damagePoints(wizard));
        System.out.println(wizard.damagePoints(warrior));
        ((Wizard)wizard).prepareSpell();
       System.out.println(wizard);
       System.out.println(warrior.damagePoints(wizard));
         System.out.println(wizard.damagePoints(warrior));
       System.out.println("=========================================");
        System.out.println("############## Dupa vraja ############## ");
        ((Wizard)wizard).prepareSpell();
        System.out.println(wizard);
        System.out.println(warrior.damagePoints(wizard));
        System.out.println(wizard.damagePoints(warrior));
        System.out.println(warrior);
       System.out.println(warrior.damagePoints(wizard));
        System.out.println(wizard.damagePoints(warrior));


    }
}

class Wizard extends Fighter{
    private int spells;

    boolean isVulnerable(){
        return spells == 0;
    }
    public void prepareSpell(){
        spells ++;
    }

    public void PrepareSpell(){
        spells ++;

    }


    int damagePoints(Fighter fighter) {
       if(spells == 0){
           return 3;
       }
       spells --;
       return 12;

    }
}


