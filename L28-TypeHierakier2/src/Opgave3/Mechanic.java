package Opgave3;

import java.util.ArrayList;

public class Mechanic extends Employee {
    private int yearOfEducation;
    private int hourlyWage;

    public ArrayList<Mechanic> mechanics = new ArrayList<Mechanic>();

    public Mechanic(String name, String address, int yearOfEducation, int hourlyWage) {
        super(name, address, hourlyWage);
        this.yearOfEducation = yearOfEducation;
        this.hourlyWage = hourlyWage;
    }

    public int getHourlyWage(){
        return hourlyWage;
    }

    public int weeklySalary(){
        return hourlyWage*37;
    }


}
