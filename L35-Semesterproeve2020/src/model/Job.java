package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Job {
    private final String kode;
    private final String beskrivelse;
    private final LocalDate dato;
    private final int timeHonorar;
    private final int antalTimer;

    //-------------------------------------------------------------------------


    private final ArrayList<Vagt> vagter = new ArrayList<>();

    //-------------------------------------------------------------------------

    Job(String kode, String beskrivelse, LocalDate dato, int timeHonorar, int antalTimer) {
        this.kode = kode;
        this.beskrivelse = beskrivelse;
        this.dato = dato;
        this.timeHonorar = timeHonorar;
        this.antalTimer = antalTimer;
    }

    //-------------------------------------------------------------------------

    public String getKode() {
        return kode;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public LocalDate getDato() {
        return dato;
    }

    public int getTimeHonorar() {
        return timeHonorar;
    }

    public int getAntalTimer() {
        return antalTimer;
    }

    //-------------------------------------------------------------------------

    public ArrayList<Vagt> getVagter() {
        return new ArrayList<>(vagter);
    }

    public Vagt createVagt(int timer, Frivillig frivillig){
        Vagt vagt = new Vagt(timer, frivillig);
        vagter.add(vagt);
        vagt.job = this;
        return vagt;
    }

    public int ikkeBesatteTimer(){
        int sum = antalTimer;
        for (Vagt v: vagter) {
            sum -= v.getTimer();

        }
        return sum;
    }
}
