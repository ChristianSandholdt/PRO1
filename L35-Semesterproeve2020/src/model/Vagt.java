package model;

import java.util.ArrayList;

public class Vagt {
    private final int timer;

    //Package visible
    Job job;

    private Frivillig frivillig;

    Vagt(int timer, Frivillig frivillig) {
        this.timer = timer;
        this.setFrivillig(frivillig);
    }
    //-------------------------------------------------------------------------

    public int getTimer() {
        return timer;
    }

    public Job getJob() {
        return job;
    }

    //-------------------------------------------------------------------------


    public Frivillig getFrivillig() {
        return frivillig;
    }

    /** Pre: Denne vagt er ikke knyttet til en anden frivillig. */
    public void setFrivillig(Frivillig frivillig){
        this.frivillig = frivillig;
        frivillig.vagter.add(this);
    }

}
