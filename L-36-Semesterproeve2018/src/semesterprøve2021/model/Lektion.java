package semesterprøve2021.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Lektion {

    private LocalDate dato;
    private LocalTime startTid;
    private String lokale;

    private final ArrayList<Deltagelse> deltagelser = new ArrayList<>();

    // -----------------------------------------------------


    public Lektion(LocalDate dato, LocalTime startTid, String lokale) {
        this.dato = dato;
        this.startTid = startTid;
        this.lokale = lokale;

    }


    public LocalDate getDato() {
        return dato;
    }

    public LocalTime getStartTid() {
        return startTid;
    }

    public String getLokale() {
        return lokale;
    }

    public ArrayList<Deltagelse> getDeltagelser() {
        return deltagelser;
    }


    // -----------------------------------------------------

    public Deltagelse opretDeltagelse (boolean registreret, DeltagerStatus status, Lektion lektion, Studerende studerende) {
        Deltagelse deltagelse = new Deltagelse(registreret, status, studerende);
        deltagelser.add(deltagelse);
        deltagelse.lektion = this;
        return deltagelse;
    }

    // til brug i gui

    @Override
    public String toString() {
        return dato + " " + startTid + " " + lokale;
    }
}
