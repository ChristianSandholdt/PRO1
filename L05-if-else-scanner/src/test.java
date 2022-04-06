import java.util.Scanner;

public class test {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input: ");
        String input = in.next();
        int penge = Integer.parseInt(input);
        System.out.println("Du har: " + penge + "$");
    }
}
