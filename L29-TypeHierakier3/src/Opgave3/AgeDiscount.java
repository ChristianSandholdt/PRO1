package Opgave3;

public class AgeDiscount implements Discount{
    private final double age;

    public AgeDiscount(double age){
        this.age = age;
    }


    @Override
    public double getDiscount(double price) {
        return price - (age/100*price);
    }
}
