package Opgave3;

public abstract class Employee {
    private String name;
    private String address;
    private int hourlySalary;

    public Employee(String name, String address, int hourlySalary){
        this.name = name;
        this.address = address;
        this.hourlySalary = hourlySalary;
    }

    public String getName(){
        return name;
    }

    public int weeklySalary(){
        return hourlySalary*37;
    }
    public int getHourlySalary(){
        return hourlySalary;
    }
}
