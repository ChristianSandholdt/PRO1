package Opgave5;


public class Fødevare extends Vare{
    private int durability;

    public Fødevare(String name, double price, String description) {
        super(name, price, description);
    }

    @Override
    public double priceWithTax(Vare vare) {
        return vare.getPrice()*1.05;
    }
}
