package Exercise3;

public class CarTester {
    public static void main(String[] args) {
        Car bil1 = new Car("BZ42056","2018");
        bil1.setPricePerDay(100);
        Car bil2 = new Car("XV21947","2010");
        bil2.setPricePerDay(150);

        Rental lån1 = new Rental(1,"05/04/2022", 10);
        Rental lån2 = new Rental( 1, "05/04/2022", 10);

        lån1.addCar(bil1);
        lån2.addCar(bil2);

        System.out.println(lån1.getPrice());
        System.out.println(lån2.getPrice());


    }
}
