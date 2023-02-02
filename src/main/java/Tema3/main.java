package Tema3;

public class main {

   public static void main(String[] args) {
       Fighter warrior = new Warrior();
       warrior.toString();
       System.out.println(warrior);
       Wizard wizard = new Wizard();
       wizard.prepareSpell();
       System.out.println(wizard);
       wizard.isVulnerable();
       wizard.prepareSpell();
       wizard.damagePoints(warrior);
       warrior.damagePoints(wizard);
       System.out.println(warrior.damagePoints(wizard));
       System.out.println(wizard.damagePoints(warrior));
   }

}
