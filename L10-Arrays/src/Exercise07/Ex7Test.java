package Exercise07;

import java.util.Arrays;

public class Ex7Test {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {50, 14, 43, 62, 91};
        int[] array4 = {1,2,3,4,5};

        //1
        swap(array);
        System.out.println(Arrays.toString(array));
        //2
        replaceWithZero((array2));
        System.out.println(Arrays.toString(array2));
        //3
        System.out.println(getSecondHighest(array3, array3.length));
        //4
        System.out.println(shiftRight(array4));



    }

    //1
    public static void swap(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
    }

    //2
    public static void replaceWithZero(int[] array) {
        int zero = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = zero;
            }
        }
    }

    //3
    public static int getSecondHighest(int[] array, int total){
        int largestValue = 0;
        int secondLargesValue = 0;
        int temp;
        for (int i = 0; i < array.length; i++)
        {
            for (int j = i + 1; j < array.length; j++)
            {
                if (array[i] > array[j])
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array[total-2];

    }
    //4
    public static boolean isSorted(int[] array){
        for (int i = 1; i < array.length; i++){
            if (array[i-1] > array[i]){
                return false;
            }
        }
        return true;
    }
    public static String shiftRight(int[] array){
        int last = array[array.length-1];
        for (int i = 1; i < array.length-2; i--){
            array[i+1] = array[i];
        }
        array[0] = last;
        return Arrays.toString(array);
    }
}
