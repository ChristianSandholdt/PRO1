package Project1.simple;

import java.util.Scanner;

public class SimpleGame {

    /**
     * Simulates playing one game of Simple.
     */
    public void play() {
        Scanner scanner = new Scanner(System.in);
        DiceThrower thrower = new DiceThrower();

        boolean finished = false;
        while (!finished) {
            // TODO: Roll dice, print roll description.
            thrower.roll();
            System.out.println(thrower.rollDescription());

            System.out.println("Roll again? (Y/n) ");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("n")) {
                finished = true;
            }
        }
        scanner.close();

        System.out.printf("\nResults:\n");
        System.out.printf("---------\n");
        System.out.printf("Roll: %13d%n", thrower.getRollCount());
        System.out.printf("Total Sum: %9d%n", thrower.getTotalSum());
        System.out.printf("Average: %13.2f%n", (double) thrower.getTotalSum()/thrower.getRollCount());
        System.out.printf("Sixes rolled: %5d%n", thrower.getSixCount());
        System.out.printf("Same value: %7d%n", thrower.getSameValueCount());
        System.out.printf("Max roll value: %4d%n", thrower.getMaxValueRolled());
    }

    /**
     * Prints the rules of Simple.
     */
    public void printRules() {
        System.out.println("=====================================================");
        System.out.println("Rules of Simple:");
        System.out.println("The player throws the 2 dice as long as he/she wants.");
        System.out.println("=====================================================");
    }

}
