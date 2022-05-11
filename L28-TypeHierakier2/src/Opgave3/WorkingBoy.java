package Opgave3;

public class WorkingBoy extends Employee {


    public WorkingBoy(String name, String address, int hourlyWage) {
        super(name, address, hourlyWage);
    }

    public int weeklySalary(){
        return getHourlySalary()*25;
    }

}
