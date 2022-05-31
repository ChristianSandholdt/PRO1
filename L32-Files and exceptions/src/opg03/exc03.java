package opg03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class exc03 {
    public static void main(String[] args) {
        String fileName = "L32-Files and exceptions/src/opg01/heltal";
        File in = new File(fileName);
        ArrayList<Integer> arrlist = new ArrayList<Integer>(6);
        try (Scanner scanner = new Scanner(in)) {
            int i;
                for (i = 1; i <= 100; i++) {
                    if (i % 2 == 0) {
                    } else
                        System.out.println(i);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
    }
}
