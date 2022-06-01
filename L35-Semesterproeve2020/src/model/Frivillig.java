package model;

import java.util.ArrayList;

public class Frivillig {
    private final String navn;
    private final String mobil;
    private final int maksAntalTimer;

    final ArrayList<Vagt> vagter = new ArrayList<>(); //package visible

    public Frivillig(String navn, String mobil, int maksAntalTimer) {
        this.navn = navn;
        this.mobil = mobil;
        this.maksAntalTimer = maksAntalTimer;
    }

    public String getNavn() {
        return navn;
    }

    public String getMobil() {
        return mobil;
    }

    public int getMaksAntalTimer() {
        return maksAntalTimer;
    }

    //-------------------------------------------------------------------------

    public ArrayList<Vagt> getVagter() {
        return new ArrayList<>(vagter);
    }

    //-------------------------------------------------------------------------

    public int ledigeTimer(){
        int timerTilbage = maksAntalTimer;
        for (Vagt v: vagter) {
            timerTilbage -= v.getTimer();
        }
        return timerTilbage;
    }

    public String gaveBeskrivelse(){
        if (vagter.size() > 0){
            return navn + "\t" + "1";
        } else return navn + "\t" + 0;
    }

}
