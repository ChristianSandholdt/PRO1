package semesterprøveJuni2015.model;

import java.time.LocalTime;

public class Invalideplads extends Parkeringsplads{

    private double areal;

    public Invalideplads(int nummer, LocalTime ankomst, double areal) {
        super(nummer, ankomst);
        this.areal = areal;
    }
    public double getAreal(){
        return areal;
    }
}
