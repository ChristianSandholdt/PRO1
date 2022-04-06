package Opgave5316;

public class Bug {
    int initialPos;
    boolean turn = true;
    public Bug(int initialPos){
        this.initialPos = initialPos;
    }
    public void move(){
        if (turn){
            initialPos++;
        }else {
            initialPos--;
        }
    }
    public void turn(boolean turn){
        this.turn = turn;
    }

    public int getInitialPos(){
        return initialPos;
    }
}
