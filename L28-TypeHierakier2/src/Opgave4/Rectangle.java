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
        return sideLength2*sideLength1;
    }

    @Override
    public String toString() {
        String str = String.format("Rectangle %s sidelength1 %d sidelength2 %d", super.toString(),sideLength1,sideLength2);
        return str;
    }
}
