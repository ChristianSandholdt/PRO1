package Exercise123;

import Exercise123.Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TestApp {

    public static void main(String[] args) {

        //ex1
        ArrayList<String> alfabet = new ArrayList<>(List.of("d", "c", "b", "a"));
        System.out.println("Ex1");
        System.out.println(alfabet);
        stringSorter(alfabet);
        System.out.println(alfabet + "\n");

        //ex2.1
        String[] ex2 = {"d","c","b","a"};
        System.out.println("Ex2.1");
        System.out.println(Arrays.toString(ex2));
        selectionSorterString(ex2);
        System.out.println(Arrays.toString(ex2));
        System.out.println();

        //ex2.2
        ArrayList<Customer> ex21 = new ArrayList<>(List.of(
                new Customer("Tsimikas",21),
                new Customer("Jurgen Klopp", 50),
                new Customer("Firmino", 27)));
        System.out.println("Ex2.2");
        System.out.println(ex21);
        selectionSortCustomer(ex21);
        System.out.println(ex21);

        //ex3
        String[] ex3 = {"d","c","b","a"};
        System.out.println("Ex3.1");
        System.out.println(Arrays.toString(ex3));
        insertionSortString(ex3);
        System.out.println(Arrays.toString(ex3));
        System.out.println();

        System.out.println("Ex3.2");
        ArrayList<Customer> ex32 = new ArrayList<>(List.of(
                new Customer("Trent",26),
                new Customer("Salah", 28),
                new Customer("Mane", 25)));

        System.out.println(ex32);
        insertionSortCustomer(ex32);
        System.out.println(ex32);
        System.out.println();







    }

    //ex1
    //Sorter strings med bubblesort så den højeste værdi rykkes hen på indeks 0.
    public static void stringSorter(ArrayList<String> arr) {
        for (int i = arr.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr.get(j).compareTo(arr.get(j + 1)) > 0) {
                    String temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
    }

    //ex 21
    //Sorter strings med selectionsort så den laveste værdi kommer hen på indeks 0
    public static String[] selectionSorterString(String arr[]){
        for (int i = 0; i < arr.length - 1; i++){
            int indexOfMin = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j].compareTo(arr[indexOfMin]) < 0){
                    indexOfMin = j;
                }
            }
            if (indexOfMin != i){
                String temp = arr[i];
                arr[i] = arr[indexOfMin];
                arr[indexOfMin] = temp;
            }
        }
        return arr;
    }

    //Ex22
    //Sorter customer objekter efter deres alder. Sorteres ung til gammel så den yngste står på indeks 0
    public static ArrayList<Customer> selectionSortCustomer(ArrayList<Customer> customers){
        for ( int i = 0; i < customers.size() - 1; i++){
            int indexOfMin = i;
            for (int j = i + 1; j < customers.size(); j++){
                if (customers.get(j).compareTo(customers.get(indexOfMin)) < 0){
                    indexOfMin = j;
                }
            }
            if (indexOfMin != i){
                Customer temp = customers.get(i);
                customers.set(i, customers.get(indexOfMin));
                customers.set(indexOfMin, temp);
            }
        }
        return customers;
    }
    //Ex3.1
    //Sorter strings i et array vha. insertion sort så den mindste string kommer hen på indeks 1
    public static void insertionSortString(String[] arr){
        for (int i = 0; i < arr.length; i++){
            String temp = arr[i];
            int j = i;
            while (j > 0 && temp.compareTo(arr[j-1]) < 0){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
    }
    //Ex3.2
    //Sorter en arraylist af customers vha. insertion sort så den yngste kommer hen på indeks 1.
    public static ArrayList<Customer> insertionSortCustomer(ArrayList<Customer> customers){
        for (int i = 0; i < customers.size(); i++){
            Customer temp = customers.get(i);
            int j = i;
            while (j > 0 && temp.compareTo(customers.get(j-1)) < 0){
                customers.set(j,customers.get(j-1));
                j--;
            }
            customers.set(j,temp);
        }
        return customers;
    }





}
