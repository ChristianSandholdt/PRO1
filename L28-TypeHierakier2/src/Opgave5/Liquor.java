package Opgave5;

public class Liquor extends Vare{
    private double percentageOfAlcohol;

    public Liquor(String name, double price, String description) {
        super(name, price, description);
    }

    @Override
    public double priceWithTax(Vare vare) {
        double sum = 0;
        sum = vare.getPrice();
        if(sum<90){
            sum = sum * 1.8;
        }else
            sum = sum * 2.2;
        return sum;
    }
}
