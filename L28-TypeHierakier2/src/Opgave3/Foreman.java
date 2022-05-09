package Opgave3;

public class Foreman extends Employee {
    private int yeorOfAppointment;
    private int weeklyBonus;
    private int yearOfEducation;
    private int hourlyWage;

    public Foreman(String name, String address, int yearOfEducation, int hourlyWage, int yeorOfAppointment, int weeklyBonus) {
        super(name, address, hourlyWage);
        this.yeorOfAppointment = yeorOfAppointment;
        this.hourlyWage = hourlyWage;
        this.yearOfEducation = yearOfEducation;
        this.weeklyBonus = weeklyBonus;
    }



    public int weeklySalary(){
       return super.weeklySalary()+weeklyBonus;
    }
}
