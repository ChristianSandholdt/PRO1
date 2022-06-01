package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Job {
    private String kode;
    private String beskrivelse;
    private LocalDate dato;
    private int timeHonorar;
    private int antalTimer;

    private final ArrayList<Vagt> vagter = new ArrayList<>();

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

    public ArrayList<Vagt> getVagter() {
        return new ArrayList<>(vagter);
    }

    public Job(String kode, String beskrivelse, LocalDate dato, int timeHonorar, int antalTimer) {
        this.kode = kode;
        this.beskrivelse = beskrivelse;
        this.dato = dato;
        this.timeHonorar = timeHonorar;
        this.antalTimer = antalTimer;
    }

    public Vagt createVagt(int timer){
        Vagt vagt = new Vagt(timer);
        vagter.add(vagt);
        return vagt;
    }

    public int ikkeBesatteTimer(){
        int sum = 0;
        for (Vagt v: vagter) {
            if (v.getTimer()>0){
                sum += v.getTimer();
            }
        }
        return sum;
    }
}
