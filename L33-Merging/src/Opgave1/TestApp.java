package Opgave1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestApp {

    public static void main(String[] args) {

        //Opgave 1
        System.out.println("Opgave 1");
        ArrayList<Customer> bilkaKunder = new ArrayList<>(List.of(
                new Customer("Adam","Adamsen"),
                new Customer("Calle", "Callesen"),
                new Customer("Martin", "Martinsen"),
                new Customer("Ove", "Ovesen")
        ));
        ArrayList<Customer> foetexKunder = new ArrayList<>(List.of(
                new Customer("Adam", "Aaoesen"),
                new Customer("Bent", "Bentsen"),
                new Customer("Frederik", "Frederiksen"),
                new Customer("Jakob", "Jakobsen")
        ));
        System.out.println(mergeAllCustomers(bilkaKunder, foetexKunder));

        //Opgave 2
        System.out.println("Opgave 2");
        int[] l1 = {2,4,6,8,10,12,14};
        int[] l2 = {1,2,4,5,6,9,12,17};

        System.out.println(Arrays.toString(sharedNumbers(l1,l2)));

        //Opgave 3
        System.out.println("Opgave 3");

        Customer c1 = new Customer("Roberto", "Firmino");
        Customer c2 = new Customer("Mohamed", "Salah");
        Customer c3 = new Customer("Virgil", "Van Dijk");
        Customer c4 = new Customer("Diogo", "Jota");
        Customer[] lc1 = {c1,c4,c2,c3};

        ArrayList<Customer> lc2 = new ArrayList<>(List.of(
                new Customer("Alisson", "Becker"),
                new Customer("Roberto","Firmino"),
                new Customer("Diogo", "Jota"),
                new Customer("Andrew", "Robertson"),
                new Customer("Mohamed", "Salah"),
                new Customer("Virgil","Van Dijk")
        ));


        System.out.println("Customers: " + lc2);
        System.out.println("Bad payers: " + Arrays.toString(lc1));
        System.out.println(goodCustomers(lc2,lc1));



    }


    /**
     * Returnerer en sammenflettet arraylist af to lister med customerobjekter.
     */
    //Opgave 2
    public static ArrayList<Customer> mergeAllCustomers(ArrayList<Customer> l1, ArrayList<Customer> l2){
        ArrayList<Customer> result = new ArrayList<>();
        int i1 = 0;
        int i2 = 0;

        while(i1 < l1.size() && i2 < l2.size()){
            if (l1.get(i1).compareTo(l2.get(i2)) <= 0){
                //kunden i l1 er mindst
                result.add(l1.get(i1));
                i1++;
            } else {
                //kunden i l2 er mindst
                result.add(l2.get(i2));
                i2++;
            }
        }
        //Tøm listen som ikke er tømt
        while (i1 < l1.size()){
            result.add(l1.get(i1));
            i1++;
        }
        while (i2 < l2.size()){
            result.add(l2.get(i2));
            i2++;
        }
        return result;
    }


    /**
     * Return a sorted array containing all elements
     * shared by l1 and l2.
     * The returned array must have no empty entries.
     * Pre: l1 and l2 are sorted and have no empty entries.
     */
    //Opgave 2
    public static int[] sharedNumbers (int[] l1, int[] l2){
        int[] tempResult = new int[l1.length + l2.length];

        int i1 = 0;
        int i2 = 0;
        int j = 0;

        while (i1 < l1.length && i2 < l2.length){
            if (l1[i1] < l2[i2]){
                i1++;
            } else if (l1[i1] > l2[i2]){
                i2++;
            }else {
                tempResult[j] = l2[i2];
                j++;
                i1++;
                i2++;
            }

        }
        int[] result = new int[j];
        for (int i = 0; i < j; i++){
            result[i] = tempResult[i];
        }

        //return Arrays.copyOf(tempResult, j);
        return result;
    }

    /**
     * Return a sorted ArrayList containing all customers
     * from l1 that are not in l2.
     * Pre: l1 and l2 are sorted and l2 has no empty
     * entries.
     */
    //Opgave 3
    public static ArrayList<Customer> goodCustomers(
            ArrayList<Customer> l1, Customer[] l2) {
        ArrayList<Customer> goodPayers = new ArrayList<>();
        int i1 = 0;
        int i2 = 0;

        while (i1 < l1.size() && i2 < l2.length) {
            if (l1.get(i1).compareTo(l2[i2]) < 0) {
                goodPayers.add(l1.get(i1));
                i1++;
            } else if (l1.get(i1).compareTo(l2[i2]) > 0) {
                i2++;
            } else {
                i1++;
                i2++;
            }}
            while (i1 < l1.size()) {
                goodPayers.add(l1.get(i1));
                i1++;
            }
            return goodPayers;
        }






    }
