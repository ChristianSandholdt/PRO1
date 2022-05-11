package Opgave3;

public class PercentDiscount implements Discount {
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
