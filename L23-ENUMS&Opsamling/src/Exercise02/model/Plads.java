package Exercise02.model;

import java.util.ArrayList;

public class Plads {
    private int nr;
    private Område område;
    private static int standardTimePris = 50;

    private final ArrayList<Reservation> reservationer = new ArrayList<>();

    public Plads(int nr, Område område){
        this.nr = nr;
        this.område = område;
    }

    public static void setStandardTimePris(int pris){
        standardTimePris = pris;
    }

    public static int getStandardTimePris(){
        return standardTimePris;
    }

    public double pris(int timer){
        double sum = 0;
        if (område == Område.VIP){
            sum = (timer * standardTimePris) * 1.25;
        } else if (område == Område.BØRNE){
            sum = (timer * standardTimePris) * 0.80;
        } else if (område == Område.TURNERING) {
            sum = (timer * standardTimePris) * 1.10;
        } else
            sum = timer*standardTimePris;

        return sum;
    }

}
