package Semesterprøve2015;

import java.util.ArrayList;

public class Storage {

    private static final ArrayList<Spiller> spillere = new ArrayList<>();
    private static final ArrayList<Kamp> kampe = new ArrayList<>();
    // -------------------------------------------------------------------------

    public static ArrayList<Spiller> getSpillere(){
        return new ArrayList<>(spillere);
    }
    public static void gemSpiller(Spiller spiller){
        spillere.add(spiller);
    }

    // -------------------------------------------------------------------------

    public static ArrayList<Kamp> getKampe(){
        return new ArrayList<>(kampe);
    }

    public static void gemKamp(Kamp kamp){
        kampe.add(kamp);
    }

    // -------------------------------------------------------------------------


}
