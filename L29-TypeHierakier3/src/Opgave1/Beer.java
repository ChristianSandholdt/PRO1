package Opgave1;

public class Beer implements Measurable{
    private String name;
    private double alcoholPercentage;

    public Beer(String name, double alcoholPercentage) {
        this.name = name;
        this.alcoholPercentage = alcoholPercentage;
    }

    @Override
    public double getMeasure() {
        return alcoholPercentage;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Percentage: " + alcoholPercentage;
    }
}
