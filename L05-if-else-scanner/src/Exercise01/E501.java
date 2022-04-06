package Exercise01;
import java.util.Scanner;
public class E501 {
    public static void main(String[] args) {

        System.out.print("Write an int: ");
        Scanner input = new Scanner(System.in);
        int skrev = input.nextInt();
        if (skrev < 0) {
            System.out.println("Integer is negative");
        } else if (skrev > 0) {
            System.out.println("Integer is positive");
        } else {
            System.out.println("Integer is 0");
        }


    }
}
