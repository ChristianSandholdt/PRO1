package Exercise01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestApp {

    public static void main(String[] args) {
        //Exc 01
        int[] Exc1 = {1,2,3};
        System.out.println("Excercise 01: " + Exercises.searchForUneven(Exc1));

        //Exc 02
        int[] Exc2 = {1,5,7,13,14,16};
        System.out.println("Exercise 02: " + Exercises.findInInterval(Exc2));

        //Exc 03.1
        int[] Exc3 = {2,6,7,3,3,1};
        System.out.println("Exercise 03: " + Exercises.adjacentNumbers(Exc3));

        //Exc 03.2
        System.out.println("Exercise 03.2: ");

        //Exc 05
        ArrayList<String> Exc5 = new ArrayList<>(List.of(
                "Kat","Hund", "Hund","Ko","Mus","Rotte","Hund"));
        System.out.println(Exercises.findAllIndices(Exc5, "Hund"));

        //Exc 08
        int[] Exc8 = {5,4,3,2,1};
        System.out.println(Arrays.toString(Exc8));
        System.out.println(Exercises.searchAndReplace(Exc8,1));
        System.out.println(Arrays.toString(Exc8));

    }

}
