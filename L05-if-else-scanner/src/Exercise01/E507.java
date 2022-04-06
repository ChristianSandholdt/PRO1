package Exercise01;
import java.util.Scanner;

public class E507 {
    public static void main(String[] args) {
        System.out.println("Write first number: ");
        Scanner scan = new Scanner(System.in);
        int første = scan.nextInt();
        System.out.println("Write second number: ");
        int anden = scan.nextInt();
        System.out.println("Write third number: ");
        int tredje = scan.nextInt();

        if (første > anden && anden > tredje){
            System.out.println("Decreasing");
        }
        else if (første < anden &&  anden < tredje){
            System.out.println("Increasing");
        }
        else {
            System.out.println("Neither increasing or decreasing");
        }


    }
}
