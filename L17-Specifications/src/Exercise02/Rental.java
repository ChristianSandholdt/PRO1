package Exercise02;

import java.time.LocalDate;
import java.time.Period;

public class Rental {
    int number;
    Period days;
    static LocalDate startDate;
    double price;



    public Rental(int number, int days, LocalDate startDate, double price){
        this.number = number;

        this.price = price;
    }

    public double getPricePrDay() {
        return price;
    }

    public void setDays(int days){
        this.days = Period.ofYears(days);
    }

    public Period getDays(){
        return days;
    }
    public LocalDate startDate(){
        return startDate;
    }

    public LocalDate endDate(){
        return startDate.plus(days);
    }

    public double getTotalPrice(){
        return price;
    }

}