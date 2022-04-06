package Exercise3;

public class Car {
    public String no;
    public String year;
    public int pricePerDay;

    public Car(String no, String year){
        this.no = no;
        this.year = year;
        pricePerDay = 0;
    }

    public void setPricePerDay(int pricePerDay){
        this.pricePerDay = pricePerDay;
    }

    public int getPricePerDay(){
        return pricePerDay;
    }

    public String getNo(){
        return no;
    }

    public String getYear(){
        return year;
    }

}
