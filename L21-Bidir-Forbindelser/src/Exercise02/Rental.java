package Exercise02;

import java.util.ArrayList;

public class Rental {
    private int no;
    private String date;
    private int days; // Days of rental

    public Rental(int no, String date,int days){
        this.days = days;
        this.date = date;
        this.no = no;
    }

    public void setDays(int days){
        this.days = days;
    }

    public int getNo(){
        return no;
    }

    public String getDate(){
        return date;
    }

    public int getDays(){
        return days;
    }
    // association 0..* --> 0..* Car
    public ArrayList<Car> cars = new ArrayList<>();

    public ArrayList<Car>getCars(){
        return new ArrayList<>(cars);
    }

    public int getPrice(Car car){
        return car.getPricePerDay() * days;
    }

    public void addCar(Car car){
        cars.add(car);
        car.rentals.add(this);
    }
    public void removeCar(Car car){
        cars.remove(car);
        car.rentals.remove(this);
    }



}
