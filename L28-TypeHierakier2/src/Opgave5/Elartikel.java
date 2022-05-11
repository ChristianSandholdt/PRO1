package Opgave5;

public class Elartikel extends Vare{
    private double energyUsedPerHour;

    public Elartikel(String name, double price, String description) {
        super(name, price, description);
    }

    @Override
    public double priceWithTax(Vare vare) {
        double sum = 0;
        sum = vare.getPrice()*1.30;
        if(sum<3){
            sum = 3;
        }
        return sum;
    }
}
