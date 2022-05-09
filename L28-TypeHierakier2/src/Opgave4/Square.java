package Opgave4;

public class Square extends Figur{

    private int sideLength;

    public Square(int xPos, int yPos, int sideLength) {
        super(xPos, yPos);
        this.sideLength = sideLength;
    }

    @Override
    public double Area() {
        return sideLength*sideLength;
    }

    @Override
    public String toString() {
        String str = String.format("Square %s sidelength %d",super.toString(),sideLength);
        return str;
    }
}
