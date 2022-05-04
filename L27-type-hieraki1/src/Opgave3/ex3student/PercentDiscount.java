package Opgave3.ex3student;

public class PercentDiscount extends Discount {
    private int discountPercentage;

    public PercentDiscount(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
    @Override
    public double getDiscount(double price){
        double sum = 0;
        sum = price - (price * discountPercentage / 100);
        return sum;
    }
}
