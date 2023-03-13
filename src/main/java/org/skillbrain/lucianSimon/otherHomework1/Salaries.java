package org.skillbrain.lucianSimon.otherHomework1;

import java.util.Scanner;

public class Salaries {
    public static void main(String[] args) {

        Staff staff=new Staff();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti salariul minim pe economie din tara dumneavoastra in lei: ");
        while (!scanner.hasNext()) {
            System.out.println("Valoarea introdusa nu este  un intreg.");
        }
        int salariuMinim=scanner.nextInt();

        System.out.println("Introduceti salariul mediu pe economie in tara dumneavoastra: ");
        while (!scanner.hasNext()) {
            System.out.println("Valoarea introdusa nu este  un intreg.");
        }
        int salariuMediu=scanner.nextInt();
        int salariuMinimPeOra=salariuMinim/160;
        int salariuMediuPeOra=salariuMediu /160;
        staff.addEmployee(new Seller("Alina", "Bostan",45, "1995",salariuMinim));
        staff.addEmployee(new Technician("Leonard", "Veres",28, "2010",salariuMediu));
        staff.addEmployee(new Warehouseman("Cosmin", "Ureche",35, "2015",salariuMinim));
        staff.addEmployee(new TechnicianRisk("Matilda", "Anastasia",30, "2009",salariuMinim));
        staff.addEmployee(new HandlingRisk("Marius", "Costin",42, "2004",salariuMinim));
        staff.showSalaries();
        System.out.println("Salariul mediu in companie este: " + staff.allSalary()+ "lei.");


    }
}