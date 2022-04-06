package Exercise03;

public class PlayerTeser {
    public static void main(String[] args) {
        Team tst = new Team("TST");
        Player Martin = new Player("Martin", 15, 43);
        Player Hans = new Player("Hans", 14, 32);
        Player Adrian = new Player("Adrian",15,30);
        Player Sofus = new Player("Sofus", 16, 12);

        System.out.println(Sofus.getAge());
        System.out.println(Sofus.getScore());
        System.out.println(Sofus.getName());

        Sofus.addScore(6);
        System.out.println(Sofus.getScore());

        tst.addPlayer(Martin);
        tst.addPlayer(Hans);
        tst.addPlayer(Adrian);
        tst.addPlayer(Sofus);

        System.out.println("TST information");
        System.out.println(tst.getName());
        tst.printPlayer();
        System.out.println();
        System.out.println("Average age is: " + tst.calcAverageAge());
        System.out.println();
        System.out.println(tst.calcTotalScore());
        System.out.println();
        System.out.println(tst.calcOldPlayersScore(14));
        System.out.println();
        System.out.println(tst.maxScore());
        System.out.println();
        System.out.println(tst.bestPlayerNames());


    }
}
