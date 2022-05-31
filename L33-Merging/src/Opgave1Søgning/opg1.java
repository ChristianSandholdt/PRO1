package Opgave1Søgning;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class opg1 {
    public static void main(String[] args) {
                //Opgave 1
                System.out.println(linearSearchFile("heltal", 219));
                //Opgave 2
                System.out.println(linFileSearchPerson("personer", "Hansen"));

            }

    public static boolean linearSearchFile(String filein, int target){
    File file = new File("L33-Merging/src/Opgave1Søgning/" + filein);
        boolean found = false;
        try (Scanner scan = new Scanner(file)){
            while (!found && scan.hasNextInt()){
                int number = scan.nextInt();
                if (number == target){
                    found = true;
                }
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
        return found;
    }

    public static String linFileSearchPerson(String fileName, String target) {
        File file = new File("L33-Merging/src/Opgave1Søgning/" + fileName);
        boolean found = false;
        String k = null;
        try (Scanner scan = new Scanner(file)) {
            while (!found && scan.hasNext()) {
                k = scan.nextLine();
                if (k.equals(target)) {
                    found = true;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
        return k;
    }

}
