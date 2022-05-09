package Opgave3;

public class Survoyer extends Mechanic{
    private int amountOfChecks;

    public Survoyer(String name, String address, int yearOfEducation, int hourlyWage, int amountOfChecks){
        super (name, address, yearOfEducation, hourlyWage);
        this.amountOfChecks = amountOfChecks;
    }

    public int weeklySalary(){
        return super.weeklySalary() + amountOfChecks*29;
    }

}
