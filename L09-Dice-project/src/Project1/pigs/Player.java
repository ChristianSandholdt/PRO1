package Project1.pigs;

public class Player {
    private String playerName;
    private int point;

    public Player(String playerName){
        this.playerName = playerName;
        point = 0;
    }

    public String getPlayerName() {
        return playerName;
    }
    public int getPoint() {
        return point;
    }

    public void updatePoint(int point) {
        this.point += point;
    }
}
