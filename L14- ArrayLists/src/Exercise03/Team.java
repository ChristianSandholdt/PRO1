package Exercise03;

import java.util.ArrayList;

public class Team {
    public String name;
    public ArrayList<Player> players = new ArrayList<Player>();

    public Team(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public ArrayList<Player> getPlayers(){
        return players;
    }
    public void addPlayer(Player p){
        players.add(p);
    }
    public void printPlayer(){
        for (Player element : players){
            System.out.print("Name: " + element.getName());
            System.out.print(" Age: " + element.getAge());
            System.out.println(" Score: " + element.getScore());
        }
    }
    public double calcAverageAge(){
        double sum = 0;
        for (Player element : players){
            sum += element.getAge();
        }
        return sum / players.size();
    }
    public int calcTotalScore(){
        int sum = 0;
        for(Player element : players){
            sum += element.getScore();
        }
        return sum;
    }
    public int calcOldPlayersScore(int ageLimit){
        int sum = 0;
        for(Player element : players){
            if (element.getAge() > ageLimit){
                sum += element.getScore();
            }
        }
        return sum;
    }
    public int maxScore(){
        int sum = 0;
        for(Player element : players){
            if (element.getScore() > sum){
                sum = element.getScore();
            }
        }
        return sum;
    }
    public ArrayList<String> bestPlayerNames(){
        ArrayList<String> names = new ArrayList<>();
        for (Player element : players){
            if (element.getScore() >= maxScore()){
              names.add(element.getName());
            }
        }
        return names;
    }

}
