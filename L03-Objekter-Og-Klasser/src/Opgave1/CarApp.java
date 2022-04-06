package Opgave1;

public class CarApp {

    public static void main(String[] args) {
        Car myCar = new Car("VW UP", "White", "AB 12.345");
        System.out.println(myCar.getBrand() + ", " + myCar.getColor());
        System.out.println(myCar.getKm());
        System.out.println();

        myCar.setKm(5000);
        System.out.println(myCar.getKm());

        System.out.println("***************");
        Car MinBil = new Car("VW Tiguan","Black", "BZ 42056");
        System.out.println("*"+MinBil.getBrand() + ", " + MinBil.getColor());
        MinBil.setKm(140000);
        System.out.println("*"+MinBil.getRegistrationNumber());
        System.out.println("*"+MinBil.getKm());
        System.out.println("***************");

    }
}
