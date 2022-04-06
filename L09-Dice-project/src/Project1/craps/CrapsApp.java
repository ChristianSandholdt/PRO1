package Project1.craps;

public class CrapsApp {

    public static void main(String[] args) {
        CrapsGame game = new CrapsGame();
        System.out.println("Welcome to the game of Craps.");
        game.printRules();
        game.play();

        System.out.println("Thank you for playing craps.");
    }
}
