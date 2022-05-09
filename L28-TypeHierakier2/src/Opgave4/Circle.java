package Opgave4;

public class Circle extends Figur {

    private int radius;

    public Circle(int xPos, int yPos, int radius){
        super(xPos, yPos);
        this.radius = radius;

    }

    @Override
    public double Area() {
        return Math.PI * (radius*radius);
    }

    @Override
    public String toString() {
        String str = String.format("Circle %s radius %d",super.toString(),radius);
        return str;
    }
}
