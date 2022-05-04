package Opgave1;

import java.util.ArrayList;
import java.util.List;

public class Mechanic extends Person {
    private int yearOfEducation;
    private int hourlyWage;

    public ArrayList<Mechanic> mechanics = new ArrayList<Mechanic>();

    public Mechanic(String name, String address, int yearOfEducation, int hourlyWage) {
        super(name, address);
        this.yearOfEducation = yearOfEducation;
        this.hourlyWage = hourlyWage;
    }

    public int getHourlyWage(){
        return hourlyWage;
    }

    public int weeklySalary(){
        int sum = 0;
        sum = getHourlyWage() * 37;
        return sum;
    }


}
