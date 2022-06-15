package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Kunde {

    private String navn;
    private String mobil;

    public Kunde(String navn, String mobil) {
        this.navn = navn;
        this.mobil = mobil;
    }

    public String getNavn() {
        return navn;
    }

    public String getMobil() {
        return mobil;
    }
    //-------------------------------------------------------------

    private final ArrayList<Bestilling> bestillinger = new ArrayList<>();

    public ArrayList<Bestilling> getBestillinger() {
        return new ArrayList<>(bestillinger);
    }

    public void addBestilling(Bestilling bestilling){
        bestillinger.add(bestilling);
        bestilling.kunde = this;
    }

    public ArrayList<Plads> bestiltePladserTilForestillingPådag(Forestilling forestilling, LocalDate dato){
        ArrayList<Plads> kundensBestillinger = new ArrayList<>();
        for (Bestilling b : bestillinger) {
            if (b.getForestilling() == forestilling && b.getDato() == dato){
                kundensBestillinger.addAll(b.getPladser());
            }
        }
        return kundensBestillinger;
    }

    @Override
    public String toString() {
        return getNavn() + ", " + getMobil();
    }

}
