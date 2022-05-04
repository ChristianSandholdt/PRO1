package Opgave3.ex3student;

import java.time.LocalDate;

public class Test {

    public static void main(String[] args) {

        Product p1 = new Product(1, "Bog", 129.95);
        Product p2 = new Product(2, "Seng", 3199.95);
        Product p3 = new Product(3, "Taske", 650);
        Product p4 = new Product(4, "Sandwich", 30);
        Product p5 = new Product(5,"Penalhus", 100);

        Customer c1 = new Customer("Nehtin", LocalDate.of(1990,12,7));
        Customer c2 = new Customer("Martin", LocalDate.of(1969,6,9));

        Order o1 = new Order(1);
        Order o2 = new Order(2);
        Order o3 = new Order(3);
        Order o4 = new Order(4);
        Order o5 = new Order(5);
        Order o6 = new Order(6);

       o1.createOrderLine(1,p1);
       o1.createOrderLine(1,p5);

       o2.createOrderLine(2,p2);
       o2.createOrderLine(1,p4);

       o3.createOrderLine(1,p2);
       o3.createOrderLine(1,p3);

       o4.createOrderLine(1,p4);
       o4.createOrderLine(2,p3);

       o5.createOrderLine(4,p5);
       o5.createOrderLine(3,p4);

       o6.createOrderLine(1,p1);
       o6.createOrderLine(1,p4);

       c1.addOrder(o1);
       c1.addOrder(o2);

       c2.addOrder(o3);
       c2.addOrder(o4);
       c2.addOrder(o5);
       c2.addOrder(o6);







    }

}
