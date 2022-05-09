package Opgave1;

public class Foreman extends Mechanic {
    private int yeorOfAppointment;
    private int weeklyBonus;

    public Foreman(String name, String address, int yearOfEducation, int hourlyWage, int yeorOfAppointment, int weeklyBonus) {
        super(name, address, yearOfEducation, hourlyWage);
        this.yeorOfAppointment = yeorOfAppointment;
        this.weeklyBonus = weeklyBonus;
    }



    public int weeklySalary(){
       return super.weeklySalary()+weeklyBonus;
    }
}
