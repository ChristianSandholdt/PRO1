package Exercise03;


public class Player {
    public String name;
    public int age;
    public int score;

    public Player(String name, int age, int score){
        this.name = name;
        this.age = age;
        this.score = score;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getScore(){
        return score;
    }
    public void setScore(int score){
        this.score = score;
    }
    public void addScore(int score){
        this.score += score;
    }


}
