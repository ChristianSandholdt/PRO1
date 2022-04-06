package Opgave3;

public class Person {

    // Navn
    private final String name;
    // Adresse
    private String address;
    // Månedlig indkomst
    private int monthlySalary;
    //Årlig indkomst
    private double yearlysalary;

    public Person(String name, String address, int monthlySalary) {
        this.name = name;
        this.address = address;
        this.monthlySalary = monthlySalary;
        this.yearlysalary = (monthlySalary * 12);
    }

    public String getname() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public int getMonthlySalary() {
        return this.monthlySalary;
    }

    public double getYearlySalary() {
        return this.yearlysalary;

    }

    public void printPerson() {
        System.out.println("Navn: " + getname());
        System.out.println("Adresse: " + getAddress());
        System.out.println("Månedlig indkomst: " + getMonthlySalary());
        System.out.println("Årlig indkomst + renter 2.5%: " + getYearlySalary() * 1.025);
    }
}
