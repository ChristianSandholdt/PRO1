package Opgave4;

public class Rectangle extends Figur{
    private int sideLength1;
    private int sideLength2;


    public Rectangle(int xPos, int yPos, int sideLength1, int sideLength2) {
        super(xPos, yPos);
        this.sideLength1 = sideLength1;
        this.sideLength2 = sideLength2;
    }

    @Override
    public double Area() {
        return 0;
    }
}
