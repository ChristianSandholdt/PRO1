package Semesterprøve2019.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Bestilling {

    private LocalDate dato;

    Forestilling forestilling;

    private Kunde kunde;

    private final ArrayList<Plads> pladser = new ArrayList<Plads>();

    public Bestilling(LocalDate dato) {
        this.dato = dato;
    }

    public Forestilling getForestilling(){
        return forestilling;
    }

    public Kunde getKunde(){
        return kunde;
    }

    public void setKunde(Kunde kunde){
        this.kunde = kunde;
    }

    public void removeKunde(){
        this.kunde = null;
    }

    public void addPlads(Plads plads){
        pladser.add(plads);
    }

    public ArrayList<Plads> getPladser() {
        return pladser;
    }

    public LocalDate getDato(){
        return dato;
    }

    public int samletPris(Bestilling bestilling){
        int sum = 0;
            bestilling.getPladser();
        for (Plads p : pladser) {
            sum += p.getPris();
        }
        return sum;
    }
}

