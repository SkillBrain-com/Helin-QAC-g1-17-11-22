package Tema3;

import java.util.Scanner;
public class PigLatin {
    String cuvant;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PigLatin text = new PigLatin();
        text.cuvant = scanner.nextLine();

       System.out.println(text.traducere());
    }
    public String traducere (){
        if (this.cuvant.length() == 2 && this.cuvant.charAt(1) == 'y' && !this.vocala(0)){
            this.cuvant = "y" + this.cuvant.charAt(0) + "ay";
        } else if (this.incepe_cu_vocala()){
            this.cuvant += "ay";
        } else {
            int pozitie = 0;
            while (pozitie + 1 < this.cuvant.length() && !this.vocala(pozitie + 1)) {
                if (pozitie > 0 && this.cuvant.charAt(pozitie + 1) == 'y'){
                    break;
                }
                pozitie ++;
            }

            if (pozitie >= 1 && pozitie + 1 < this.cuvant.length() && this.cuvant.charAt(pozitie) == 'q' && this.cuvant.charAt(pozitie + 1) == 'u'){
                this.cuvant = this.cuvant.substring(pozitie + 2, this.cuvant.length()) + this.cuvant.substring(0, pozitie + 2) + "ay";
            } else this.cuvant = this.cuvant.substring(pozitie + 1, this.cuvant.length()) + this.cuvant.substring(0, pozitie + 1) + "ay";
        }

        return this.cuvant;

    }
    boolean vocala(int poz){
        String vocale = "aeiou";
        for (int i = 0; i <= 4; i ++)
            if (this.cuvant.charAt(poz) == vocale.charAt(i))
                return true;
        return false;
    }
    boolean incepe_cu_vocala (){

        if (this.vocala(0))
            return true;
        if (this.cuvant.length() > 1){
            String inceput = new String();
            inceput = inceput + cuvant.charAt(0) + cuvant.charAt(1);
            if (inceput.equals("xr") || inceput.equals("yt"))
                return true;
        }
        return false;
    }
}
