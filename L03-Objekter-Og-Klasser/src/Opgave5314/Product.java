package Opgave5314;

public class Product {

    String name;
    double price;
    double rabat;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void reducePrice(double rabat) {
        price = price - rabat;
    }

}

//De her mundbind er ikke gode at kysse med
//def trist kæreste;
//
//altså der er ingen ballade med dem her på
//hvis man var liderlig før, så har de gjort et rimeligt godt job med at fjerne det iegen
