package Opgave1;

public class Chili implements Measurable{

    private String name;
    private int scoville;

    public Chili(String name, int scoville){
        this.name = name;
        this.scoville = scoville;
    }

    public String getName(){
        return name;
    }

    @Override
    public double getMeasure() {
        return scoville;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Scoville: " + scoville;
    }
}
