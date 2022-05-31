package opg01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exc01 {
    public static void main(String[] args) {
        String fileName = "L32-Files and exceptions/src/opg01/heltal";
        File in = new File(fileName);
        try (Scanner scanner = new Scanner(in)) {
            while (scanner.hasNextDouble()) {
                double d = scanner.nextDouble();
                System.out.println(d * 2);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
    }
}
