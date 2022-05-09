package Opgave4;

public abstract class Figur {
    private int xPos;
    private int yPos;

    public Figur(int xPos, int yPos){
        this.xPos = xPos;
        this.yPos = yPos;
    }
    public abstract double Area();


    @Override
    public String toString() {
        String s = String.format("(%d, %d)", xPos, yPos);
        return s;
    }

    public void movexPos(int movexPos) {
        this.xPos += xPos;
    }

    public void moveyPos(int moveyPos) {
        this.yPos += yPos;
    }
}
