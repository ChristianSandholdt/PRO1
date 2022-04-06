package Opgave5316;

public class BugTester {

    public static void main(String[] args) {
        Bug bugsy = new Bug(5);
        System.out.println(bugsy.getInitialPos());

        bugsy.move();
        System.out.println(bugsy.getInitialPos());
        bugsy.move();
        bugsy.turn(false);
        System.out.println(bugsy.getInitialPos());
        bugsy.move();
        System.out.println(bugsy.getInitialPos());
        bugsy.move();
        System.out.println(bugsy.getInitialPos());
        bugsy.move();
        bugsy.move();
        bugsy.move();
        bugsy.turn(true);
        bugsy.move();
        bugsy.move();
        bugsy.move();
        bugsy.move();
        bugsy.turn(false);
        bugsy.move();
        bugsy.move();
        bugsy.move();
        System.out.println(bugsy.getInitialPos());



    }
}
