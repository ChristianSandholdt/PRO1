package Exercise04;

import java.util.ArrayList;
import java.util.List;

public class EX04 {

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(List.of(1, 5, 2, 6, 2, 7, 2, 5, 3));

        //1
        swap(arr1);
        //2
        replaceWithZero(arr1);
        //3
        System.out.println(getSecondHighest(arr1));
        //4


    }


    //1
//        public static void swap(int[] array) {
//            int temp = array[0];
//            array[0] = array[array.length - 1];
//            array[array.length - 1] = temp;
//        }
    public static void swap(ArrayList<Integer> list) {
        int temp = list.get(0);
        list.set(0, list.get(list.size() - 1));
        list.set(list.size() - 1, temp);
        System.out.println(list);

    }


    //2
    public static void replaceWithZero(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) % 2 == 0){
                list.remove(i);
                list.add(i,0);
            }
        }
        System.out.println(list);
    }

        //3
        public static int getSecondHighest(ArrayList<Integer> list) {
            int highest = list.get(0);
            int secondHighest = list.get(1);
            if (highest > secondHighest){
                int temp = highest;
                highest = secondHighest;
                secondHighest = temp;
            }
            for (int i = 2; i < list.size(); i++) {
                if (list.get(i) > highest){
                    secondHighest = highest;
                    highest = list.get(i);
                }
            }
            return secondHighest;
        }
        //4 shift right. Definer indeks length - 1 som en temp der sættes ind på plads 0 og dermed rykker
        // hele listen et indeks mod højre



}

