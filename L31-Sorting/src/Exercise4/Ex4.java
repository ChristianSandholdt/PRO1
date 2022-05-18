package Exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex4 {

    public static void main(String[] args) {

        //ex4
        ArrayList<Integer> list1 = new ArrayList<>(List.of(
                654, 432, 756, 897, 45, 354, 67, 567, 324, 475, 432
        ));
        ArrayList<Integer> list2 = new ArrayList<>(List.of(
                654, 432, 756, 897, 45, 354, 67, 567, 324, 475, 432
        ));
        ArrayList<Integer> list3 = new ArrayList<>(List.of(
                654, 432, 756, 897, 45, 354, 67, 567, 324, 475, 432
        ));
        long t1 = System.currentTimeMillis();
        integerBubbleSort(list1);
        long t2 = System.currentTimeMillis();
        long tid = t2 - t1;
        System.out.println(tid);

        Random r = new Random();
        int[] ints = r.ints(1000, 1, 10000).toArray();


        ArrayList<Integer> numbers = new ArrayList<>();
        for (int e : ints) {
            numbers.add(e);
        }
        long bubbleSortTidFoer = System.currentTimeMillis();
        integerBubbleSort(numbers);
        long bubbleSortTidEfter = System.currentTimeMillis();
        double bubbleSortTid = bubbleSortTidEfter - bubbleSortTidFoer;
        System.out.println("Tid for bubble sort: " + bubbleSortTid);


        ArrayList<Integer> numbers2 = new ArrayList<>(numbers);
        long selectionSortTidFoer = System.currentTimeMillis();
        selectionSortInteger(numbers2);
        System.out.println(numbers2);
        long selectionSortTidEfter = System.currentTimeMillis();
        double selectionSortTid = selectionSortTidEfter - selectionSortTidFoer;
        System.out.println("Tid for selection sort: " + selectionSortTid);


        ArrayList<Integer> numbers3 = new ArrayList<>(numbers);
        long insertionSortTidFoer = System.currentTimeMillis();
        insertionSortInteger(numbers3);
        System.out.println(numbers3);
        long insertionSortTidEfter = System.currentTimeMillis();
        double insertionSortTid = insertionSortTidEfter - insertionSortTidFoer;
        System.out.println("Tid for insertion sort: " + insertionSortTid);


    }

    //ex4 integer sorting with bubblesort
    public static void integerBubbleSort(ArrayList<Integer> arr) {
        for (int i = arr.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr.get(j).compareTo(arr.get(j + 1)) > 0) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
    }
    //ex4 integer sorting with selection sort
    public static ArrayList<Integer> selectionSortInteger(ArrayList<Integer> integers) {
        for (int i = 0; i < integers.size() - 1; i++) {
            int indexOfMin = i;
            for (int j = i + 1; j < integers.size(); j++) {
                if (integers.get(j) < integers.get(indexOfMin)) {
                    indexOfMin = j;
                }
            }
            if (indexOfMin != i) {
                int temp = integers.get(i);
                integers.set(i, integers.get(indexOfMin));
                integers.set(indexOfMin, temp);
            }
        }
        return integers;
    }
    //ex4 integer sorting with insertion sort
    public static ArrayList<Integer> insertionSortInteger(ArrayList<Integer> integers){
        for (int i = 1; i < integers.size(); i++){
            int temp = integers.get(i);
            int j = i;
            while (j > 0 && temp < integers.get(j-1)){
                integers.set(j,integers.get(j-1));
                j--;
            }
            integers.set(j,temp);
        }
        return integers;
    }

}
