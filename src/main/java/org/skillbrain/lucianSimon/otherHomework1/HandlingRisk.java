package org.skillbrain.lucianSimon.otherHomework1;

public class HandlingRisk extends Warehouseman implements EmployeeRisk{

    @Override
    public void handleRisk() {
        System.out.println("Gestionez marfuri care implica un cu risk inalt si beneficiez de un spor extra.");
    }

    public HandlingRisk(String firstName, String lastName, int age, String employmentDate, int reference) {
        super(firstName, lastName, age, employmentDate, reference);
    }

    @Override
    public double calculateSalary() {
        return 3*reference+monthlyPremium;
    }
}
