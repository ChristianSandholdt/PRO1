package model;

import java.util.ArrayList;

public class Vagt {
    private int timer;

    //Package visible
    Job job;

    Frivillig frivillig;

    public int getTimer() {
        return timer;
    }

    public Job getJob() {
        return job;
    }

    public Frivillig getFrivillig() {
        return frivillig;
    }

    Vagt(int timer) {
        this.timer = timer;
    }
}
