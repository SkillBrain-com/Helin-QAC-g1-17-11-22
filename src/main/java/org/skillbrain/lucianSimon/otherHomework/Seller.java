package org.skillbrain.lucianSimon.otherHomework;

public class Seller extends Employee {
public double fixPart=0.2*150;


    @Override
    double calculateSalary() {
        return fixPart+reference;
    }

    @Override
    String getName() {
        return "Vanzatorul se numeste "+ firstName+" "+lastName;
    }
    Seller (String firstName, String lastName, int age, String employmentDate,int reference) {
        super(firstName, lastName, age, employmentDate);
        this.reference = reference;
    }
}
