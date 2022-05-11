package Opgave3;

public class FixedDiscount implements Discount {
    private int fixedDiscount;
    private int discountLimit;

    public FixedDiscount(int fixedDiscount, int discountLimit) {
        this.fixedDiscount = fixedDiscount;
        this.discountLimit = discountLimit;
    }
    public double getDiscount(double price) {
        double sum = 0;
        if(price >= discountLimit){
            sum = price - fixedDiscount;
        }
        return sum;
    }
}
