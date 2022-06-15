package storage;

import model.Forestilling;
import model.Kunde;

import java.util.ArrayList;

public class Storage {
    //S6 4 point

    private static final ArrayList<Forestilling> forestillinger = new ArrayList<>();

    private static final ArrayList<Kunde> kunder = new ArrayList<>();

    public static ArrayList<Forestilling> getForestillinger(){
        return new ArrayList<>(forestillinger);
    }

    public static ArrayList<Kunde> getKunder(){
        return new ArrayList<>(kunder);
    }

    public static void gemForestilling(Forestilling forestilling){
        forestillinger.add(forestilling);
    }

    public static void gemKunde(Kunde kunde){
        kunder.add(kunde);
    }
}
