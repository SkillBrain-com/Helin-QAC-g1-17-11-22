package org.skillbrain.lucianSimon.otherHomework1;

public abstract class Employee {

    protected String firstName;
    protected String lastName;
    protected int age;
    protected String employmentDate;
    protected int reference;
    protected double fixPart;

    abstract double calculateSalary();

    abstract String getName();

    Employee(String firstName, String lastName, int age, String employmentDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.employmentDate = employmentDate;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getEmploymentDate() {
        return employmentDate;
    }

    public int getReference() {
        return reference;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmploymentDate(String employmentDate) {
        this.employmentDate = employmentDate;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }
}
