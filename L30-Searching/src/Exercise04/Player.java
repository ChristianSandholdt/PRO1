package Exercise04;

public class Player {
    private String name;
    private double height;
    private double weight;
    private int goalsScored;


    public Player(String name, int goalsScored, double height, double weight){
        this.name = name;
        this.goalsScored = goalsScored;
        this.height = height;
        this. weight = weight;
    }

    public String getName(){
        return name;
    }

    public int getGoalsScored(){
        return goalsScored;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Navn: " + name;
    }
}
