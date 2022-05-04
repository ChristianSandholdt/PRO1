package Opgave1;

public class Survoyer extends Mechanic{
    private int amountOfChecks;

    public Survoyer(String name, String address, int yearOfEducation, int hourlyWage, int amountOfChecks){
        super (name, address, yearOfEducation, hourlyWage);
        this.amountOfChecks = amountOfChecks;
    }

    public int weeklySalary(){
        int sum = 0;
        sum = (getHourlyWage() * 37) + (amountOfChecks*29);
        return sum;
    }

}
