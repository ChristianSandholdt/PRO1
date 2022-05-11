package Opgave5;

public class Vare {
    private String name;
    private double price;
    private String description;

    public Vare(String name, double price, String description){
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public double getPrice(){
        return price;
    }

    public double priceWithTax(Vare vare){
        double sum = 0;
        sum = vare.getPrice()*1.25;
        return sum;
    }

    @Override
    public String toString() {
        return  "Name:" + name +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';

    }
}
