package Exercise02;

import DemoBidir.asso_group0m_0mperson.Group;

import java.util.ArrayList;

public class Car {
    private String no;
    private String year;
    private int pricePerDay;

    public Car(String no, String year, int pricePerDay) {
        this.no = no;
        this.year = year;
        this.pricePerDay = pricePerDay;
    }

    public void setPricePerDay(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    public String getNo() {
        return no;
    }

    public String getYear() {
        return year;
    }

    final ArrayList<Rental> rentals = new ArrayList<>();

    public ArrayList<Rental> getRentals() {
        return new ArrayList<>(rentals);
    }


    public int biggestRental() {
        int sum = 0;
        for (int i = 0; i < rentals.size(); i++) {
            if (rentals.get(i).getDays() > sum) {
                sum = rentals.get(i).getDays();
            }
        }
        return sum;
    }

}
