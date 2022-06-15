package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Bestilling {

    private LocalDate dato;

    public Bestilling(LocalDate dato) {
        this.dato = dato;
    }

    public LocalDate getDato() {
        return dato;
    }

    public Forestilling getForestilling() {
        return forestilling;
    }
    //-------------------------------------------------------------

    Forestilling forestilling; //Package visible

    //-------------------------------------------------------------
    Kunde kunde; //Package visible
    //-------------------------------------------------------------


    private final ArrayList<Plads> pladser = new ArrayList<>();

    public ArrayList<Plads> getPladser() {
        return new ArrayList<>(pladser);
    }

    //S2 5 point
    public int samletPris(){
        int sum = 0;
        for (Plads p : pladser) {
            sum += p.getPris();
        }
        return sum;
    }

}
