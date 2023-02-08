package org.skillbrain.lucianSimon.otherHomework;

public class Technician extends Employee{
    @Override
    double calculateSalary() {
        return 2*reference;
    }

    @Override
    String getName() {
        return "Vanzatorul se numeste "+ firstName+" "+lastName;
    }
        Technician(String firstName, String lastName, int age, String employmentDate,int reference){
            super(firstName,lastName,age,employmentDate);
            this.reference=reference;

    }
}
