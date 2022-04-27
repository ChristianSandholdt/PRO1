package Exercise02;

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car("BZ42056", "2014", 50);
        Car c2 = new Car("XV21947", "2010", 100);
        Car c3 = new Car("TM09381", "2012", 150);

        Rental r1 = new Rental(1,"06/04/2022",12);
        Rental r2 = new Rental(2,"06/04/2022", 15);
        Rental r3 = new Rental(3,"06/04/2022",4);

        r1.addCar(c1);
        r3.addCar(c1);
        r2.addCar(c2);
        r3.addCar(c3);

        System.out.println(r3.getPrice(c3));
        System.out.println(r2.getPrice(c2));
        System.out.println(r1.getPrice(c1));


        System.out.println("Den periode hvor bilen C1 er lejet i længst tid er: " + c1.biggestRental());
        System.out.println("Den periode hvor bilen C2 er lejet i længst tid er: " + c2.biggestRental());
        System.out.println("Den periode hvor bilen C3 er lejet i længst tid er: " + c3.biggestRental());


    }
}
