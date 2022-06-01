package model;

import java.util.ArrayList;

public class Frivillig implements Comparable<Frivillig>{
    private String navn;
    private String mobil;
    private int maksAntalTimer;

    private final ArrayList<Vagt> vagter = new ArrayList<>();

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

    public ArrayList<Vagt> getVagter() {
        return new ArrayList<>(vagter);
    }

    public void setMaksAntalTimer(int timer){
        this.maksAntalTimer = maksAntalTimer-timer;
    }

    public int ledigeTimer(Frivillig frivillig){
        int timerTilbage = maksAntalTimer;
        for (Vagt v: vagter) {
            timerTilbage -= v.getTimer();
        }
        return timerTilbage;
    }



    @Override
    public String toString() {
        return navn;
    }

    @Override
    public int compareTo(Frivillig o) {
        return this.navn.compareTo(o.navn);
    }
}
}
