package Exercise01;

import java.util.ArrayList;

public class Exercises {
    //Eksempel
    public int linearSearchList(ArrayList<String> list, String target){
        int index = -1;
        int i = 0;
        while (index == -1 && i < list.size()){
            String k = list.get(i);
            if (k.equals(target)){
                index = i;
            }
            else
                i++;
        }
        return index;
    }

    //Ex1
    public static boolean searchForUneven(int arr[]){
        boolean found = false;
        int i = 0;
        while (!found && i < arr.length){
            int k = arr[i];
            if (k %2 != 0){
                found = true;
            }
            else i++;
        }
        return found;
    }

    //Ex2
    public static int findInInterval(int arr[]){
        int index = -1;
        int i = 0;

        while (index == -1 && i < arr.length){
            int k = arr[i];
            if (k >= 10 && k <= 15){
                index = k;
            }else
                i++;
        }
        return index;
    }

    //Ex3a
    public static boolean adjacentNumbers(int arr[]){
        boolean adjacent = false;
        int i = 0;

        while (!adjacent && i < arr.length){
            if (arr[i] == arr[i+1]){
                adjacent = true;
            } else i++;
        }
        return adjacent;
    }

    //Ex3b
//    public static boolean nAdjacentNumbers(int arr[], int n){
//        boolean adjacent = false;
//        int i = 0;
//        while (!adjacent && i < arr.length-n){
//            if (match(n,arr, i)){
//                adjacent = true;
//            } else i++;
//        }
//        return adjacent;
//    }
//
//    private static boolean match(int m, int sm[], int i){
//        boolean foundDiff = false;
//        int j = 0;
//        while (!foundDiff && j < m{
//            int k = sm.;
//            if(k != m + j){
//                foundDiff = true;
//            }
//            else j++;
//        }
//        return !foundDiff;
//    }

    //ex5
    public static ArrayList<Integer> findAllIndices(ArrayList<String> list, String target){
        ArrayList indexes = new ArrayList<>();
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) == target){
                indexes.add(i);
            }}
        return indexes;
    }

    //ex6
/*    public boolean repeatedChars(String s, int k){

    }*/

    //ex7

    //ex 8
    public static int searchAndReplace(int arr[], int number){
        int index = -1;
        int i = 0;

        while (index == -1 && i < arr.length){
            if (arr[i] == number && arr[i] != arr[0]){
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
                index = i-1;
            } else if (arr[i] != number){
                i++;
            } else if (arr[i] == 0 && arr[i] == number) {
                index = -1;
            }else
                i++;

        }
        return index;
    }


}
