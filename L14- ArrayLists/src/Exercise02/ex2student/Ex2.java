package Exercise02.ex2student;

import java.util.ArrayList;

public class Ex2 {

    /**
     * Tests all the methods.
     */
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(12);
        ints.add(0);
        ints.add(45);
        ints.add(7);
        ints.add(-16);
        ints.add(0);
        ints.add(23);
        ints.add(-10);
//        ints.addAll(List.of(12, 0, 45, 7, -16, 0, 23, -10));
        System.out.println("ints: " + ints);
        System.out.println();

        // Test of sum1() method: correct sum is 61.
        int total = sum1(ints);
        System.out.println("Sum: " + total);

        // Test of sum() method: correct sum is 61.
        int total2 = sum2(ints);
        System.out.println("Sum: " + total2);

        // Test of minimum() method: correct minimum is -16.
        int min = min(ints);
        System.out.println("Minimum value is " + min);

        // Test of maximum() method: correct maximum is 45.
        int max = max(ints);
        System.out.println("Maximum value is " + max);

        // Test of average() method: correct average is 7.625.
        double average = average(ints);
        System.out.println("Average value is " + average(ints));


        // Test of zeroes() method: correct number of zeroes is 2.
        int zeroes = zeroes(ints);
        System.out.println("Amount of zeroes is: " + zeroes);

        // Test of evens() method: correct result is [12, 0, -16, 0, -10].
        ArrayList<Integer> evens = even(ints);
        System.out.println("Evens in the array are: " + evens);

    }


    // sum made with for statement
    public static int sum1(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            sum += number;
        }
        return sum;
    }
    public static int sum2(ArrayList<Integer> list){
        int sum = 0;
        for (int number : list){
            sum += number;
        }
        return sum;
    }
    public static int min(ArrayList<Integer> list){
        int min = list.get(0);
        for (int number : list){
            if (number < min){
                min = number;
            }
        }
        return min;
    }
    public static int max(ArrayList<Integer> list){
        int max = list.get(0);
        for (int number : list){
            if (number > max){
                max = number;
            }
        }
        return max;
    }
    public static double average(ArrayList<Integer> list) {
        double sum = 0;
        for (int number : list) {
            sum += number;
        }
        return sum/list.size();
    }
    public static int zeroes(ArrayList<Integer> list) {
        int sum = 0;
        int zero = 0;
        for (int number : list) {
            if (number == 0){
                zero++;
            }
        }
        return zero;
    }
    public static ArrayList<Integer> even(ArrayList<Integer> list) {
        ArrayList<Integer> listOfEven = new ArrayList<>();
        for (int number : list) {
            if (number % 2 == 0){
                listOfEven.add(number);
            }
        }
        return listOfEven;
    }

}
