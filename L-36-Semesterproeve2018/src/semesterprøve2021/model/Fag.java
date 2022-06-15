package semesterprøve2021.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Fag {

    private final String navn;
    private final String klasse;

    private final ArrayList<Lektion> lektioner = new ArrayList<>();
    // -----------------------------------------------------


    public Fag(String navn, String klasse, Lektion lektion) {
        this.navn = navn;
        this.klasse = klasse;
        addLektion(lektion);
    }

    public String getKlasse() {
        return klasse;
    }

    public String getNavn() {
        return navn;
    }

    public ArrayList<Lektion> getLektioner() {
        return new ArrayList<>(lektioner);
    }

    public void addLektion(Lektion lektion){
        lektioner.add(lektion);
    }


    // -----------------------------------------------------

    public ArrayList<Studerende> sygdomPåDato(LocalDate dato) {
        ArrayList<Studerende> fraværende = new ArrayList<>();
        for (Lektion l : lektioner){
            if (l.getDato() == dato) {
                for (Deltagelse d : l.getDeltagelser()) {
                    if (d.getStatus() != DeltagerStatus.TILSTEDE) {
                        for (Studerende s : fraværende) {
                            if (d.getStuderende() == s) {
                            } else fraværende.add(d.getStuderende());
                        }
                    }
                }
            }
        }
        return fraværende;
    }

    @Override
    public String toString() {
        return navn + "" + klasse + "";
    }
}
