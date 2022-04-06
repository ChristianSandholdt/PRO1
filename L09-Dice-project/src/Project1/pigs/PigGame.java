package Project1.pigs;

import java.util.Random;
import java.util.Scanner;

public class PigGame {
    Player player1 = new Player("Player 1");
    Player player2 = new Player("Player 2");

    /**
     * Simulates playing one game of craps.
     */
    public void play()
    {
        Scanner scanner = new Scanner(System.in);
        DiceThrower Thrower = new DiceThrower();
        Random rd = new Random();
        int currentPoints = 0;
        int win = 20;
        boolean turn;
        boolean finished = false;

        if (rd.nextInt(2) == 0){
            turn = true; //Player 1 starts
        }else {
            turn = false; // Player 2 starts
        }

        while (!finished){
            if (turn){
                Thrower.roll();
                System.out.println(player1.getPlayerName() + " Rolled: " + Thrower.sum());
                if (Thrower.sum() > 1){
                    currentPoints += Thrower.sum();
                    System.out.println("Current points: " + currentPoints);
                    if (currentPoints + player1.getPoint() >= win){
                        finished = true;
                        printGameWon(player1.getPlayerName());
                    }
                } else {
                turn = false;
                currentPoints = 0;
                getScore();
                }
            }else {
                Thrower.roll();
                System.out.println(player2.getPlayerName() + " Rolled: " + Thrower.sum());
                if (Thrower.sum() > 1){
                    currentPoints += Thrower.sum();
                    System.out.println("Current points: " + currentPoints);
                    if (currentPoints + player2.getPoint() >= win){
                        finished = true;
                        printGameWon(player2.getPlayerName());
                    }
                } else {
                    turn = true;
                    currentPoints = 0;
                    getScore();
                }
            }

            if (!finished){
                if (Thrower.sum() > 1) {
                    System.out.println("Roll again Y/n");
                }
                String answer = scanner.nextLine();
                if (answer.equalsIgnoreCase("n")) {
                    if (turn){
                        player1.updatePoint(currentPoints);
                    }
                    else {
                        player2.updatePoint(currentPoints);
                    }
                    getScore();
                    turn = !turn;
                    currentPoints = 0;
                }
            }
        }


    }


    public void getScore(){
        System.out.println();
        System.out.println(player1.getPlayerName() + ": " + player1.getPoint());
        System.out.println(player2.getPlayerName() + ": " + player2.getPoint());
    }

    /**
     * Prints a 'You have won' message.
     */
    public void printGameWon(String playerName) {
        System.out.println("Congratulations, " + playerName + " you have won!");

    }


    /**
     * Prints the rules of pigs.
     */
    public void printRules() {
        System.out.println("The game is played by two players. The players take turns, throwing one die until he/she throws 1, \n" +
                "or until he/she decides to stop throwing. The player accumulates points (the face value of the die) \n" +
                "on each throw, but if he/she throws 1, all points in this turn is lost. If the player stops before \n" +
                "throwing a 1, the points of this turn is added to the points of earlier turns. The player that reaches \n" +
                "100 points after a turn, is the winner.");
    }
}
