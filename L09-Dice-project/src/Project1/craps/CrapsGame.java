package Project1.craps;
import java.util.Scanner;
public class CrapsGame {

    /**
     * Simulates playing one game of craps.
     */
    public void play() {
        DiceThrower Thrower = new DiceThrower();
        int point = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press enter to play!");
        boolean finished = false;
        while (!finished) {

            String answer = scanner.nextLine();
            if (answer.equals("")) {
                Thrower.roll();
                System.out.println("You got " + Thrower.rollDescription() + " Which is equal to " + Thrower.sum());
                if (Thrower.getRollCount() == 1){
                    if (Thrower.sum() == 7 || Thrower.sum() == 11){
                        printGameWon();
                        finished = true;
                    }else if (Thrower.sum() == 2 || Thrower.sum() == 3 || Thrower.sum() == 12){
                        printGameLost();
                        finished = true;
                    }else {
                        point = Thrower.sum();
                    }
                } else {
                    if (Thrower.sum() == point){
                        printGameWon();
                        finished = true;
                    }else if (Thrower.sum() == 7){
                        printGameLost();
                        finished = true;}
                }
            }

        }
    }

    /**
     * Prints a 'You have won' message.
     */
    public void printGameWon() {
        System.out.println("Congratulations, you won!");

    }

    /**
     * Prints a 'You have lost' message.
     */
    public void printGameLost() {
        System.out.println("You lost!");
    }

    /**
     * Prints the rules of craps.
     */
    public void printRules() {
        System.out.println("In the game a player throws 2 dice. The first throw is called 'the come out roll'. The player wins, if\n" +
                "the sum of the dice in the come out roll is 7 or 11. The player loses, if the sum is 2, 3 or 12. If the\n" +
                "sum is something else (that is, 4, 5, 6, 8, 9 or 10), the sum is set as the player's 'point'. The player\n" +
                "will now continue throwing the dice until he has lost or won. A sum equal his 'point' is a win, and a\n" +
                "sum equal 7 is a loss.");
    }

}
