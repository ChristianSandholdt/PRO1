package Exercise02;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int values[] = {10,10,10,10,10,11};
        sum(values);
        System.out.println(sum(values));

        int values1[] = { 15,12,5,5,5,5,5};
        sum(values1);
        System.out.println(sum(values1));
        System.out.println("Exercise 2" + Arrays.toString(sumArrays(values, values1)));

        System.out.println("Exercise 3" + Arrays.toString(sumArraysUnequal(values1, values)));
        hasUneven(values1);

        System.out.println("Exercise 4 " + (hasUneven(values)));

    }
    //Exercise02
    public static int sum(int[] t){
        int sum = 0;
        for (int i = 0; i < t.length; i++){
            sum += t[i];
        }
        return sum;
    }
    public static double sum(double[] t){
        double sum = 0;
        for (int i = 0; i <t.length; i++){
            sum += t[i];
        }
        return sum;
    }
    //Exercise03
    public static int[] sumArrays(int[] a, int[] b){
            int sumArrays = 0;
            int[] c = new int[a.length];
            for (int i = 0; i < a.length; i++){
                c[i] = a[i] + b[i];
            }
            return c;
    }

    public static int[] sumArraysUnequal(int[] a, int[] b){
        int sumArraysUnequal = 0;
        int[] largeArray;
        if (a.length > b.length){
            largeArray = a;
        } else{
            largeArray = b;
        }
        int[] d = new int[largeArray.length];

        for (int i = 0; i < a.length; i++){
            d[i] += a[i];
        }
        for (int i = 0; i < b.length; i++){
            d[i] += b[i];
        }
        return d;
    }
    //Exercise04
    public static boolean hasUneven(int[] t){
        boolean hasUneven = true;
        for (int i = 0; i < t.length; i++)
        if (t[i]%2 != 0){
            hasUneven = true;
        }else if (t[i]%2 == 0){
            hasUneven = false;
        }
        return hasUneven;
    }


}
