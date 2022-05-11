package Opgaver2;

import java.util.Arrays;

public class TestApp {
    public static void main(String[] args) {
        Customer[] customer = {new Customer("Martin", "Hansen", 69),
                               new Customer("Martin","Brygmann",69),
                               new Customer("Pia", "Hansen", 32),
                               new Customer("Nehtin", "Iashar", 30),
                               new Customer("Thorsthein","Gudmundsson", 12)
        };



        System.out.println(biggestCustomer(customer));

        System.out.println(Arrays.toString(biggerThanCustomer(customer, customer[1])));

    }

    // Method for finding the biggest customer
    public static Customer biggestCustomer(Customer[] customers){
        Customer max = customers[0];
        for (Customer c : customers){
            if (c.compareTo(max) > 0){
                max = c;
            }
        }
        return max;
    }
    // Method for finding customers bigger than given customer
    public static Customer[] biggerThanCustomer(Customer[] customers, Customer customer){
        Customer[] biggestCustomer = new Customer[customers.length];
        int i = 0;
        for (Customer c : customers){
            if (c.compareTo(customer) > 0){
                biggestCustomer[i] = c;
                i++;
            }
        }
        return Arrays.copyOf(biggestCustomer, i);
    }
}
