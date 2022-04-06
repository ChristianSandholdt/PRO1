package Opgave5313;

public class MyCarTester {
    public static void main(String[] args) {
        Car up = new Car(20);

        up.addGas(35);
        up.drive(120);
        System.out.println(up.gasLeft() + "Liters remaining");
        up.drive(50);
        System.out.println(up.gasLeft() + "Liters remaining");
    }
}
