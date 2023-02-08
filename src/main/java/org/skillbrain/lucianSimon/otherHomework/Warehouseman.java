package org.skillbrain.lucianSimon.otherHomework;

public class Warehouseman extends Employee {

    @Override
    public double calculateSalary() {
        return 2.5*reference;
    }

    @Override
    public String getName() {
        return "Angajatul care gestioneaza marfuri se numeste: "+firstName+" "+lastName;
    }

    public Warehouseman(String firstName, String lastName, int age, String employmentDate, int reference) {
        super(firstName, lastName, age, employmentDate);
        this.reference=reference;
    }
}
