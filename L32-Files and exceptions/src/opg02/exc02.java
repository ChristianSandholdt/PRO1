package opg02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exc02 {
    public static void main(String[] args) {
        String fileName = "L32-Files and exceptions/src/opg01/heltal";
        File in = new File(fileName);
        ArrayList<Integer> arrlist = new ArrayList<Integer>(6);
        try (Scanner scanner = new Scanner(in)) {
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                arrlist.add(number);
                int i;
                for (i = 1; i <= 100; i++){
                    if (i%2 == 0) {
                    }
                    else
                        System.out.println(i);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("Before Reverse ArrayList: ");
        System.out.println(arrlist);
        System.out.println();
        System.out.println("Reverse ArrayList: ");
        Collections.reverse(arrlist);
        System.out.println(arrlist);





    }
}
