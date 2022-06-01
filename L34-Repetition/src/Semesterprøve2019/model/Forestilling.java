package Semesterprøve2019.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Forestilling {

    private String navn;
    private LocalDate startDato;
    private LocalDate slutDato;

    private final ArrayList<Bestilling> bestillinger = new ArrayList<>();

    public Forestilling(String navn, LocalDate startDato, LocalDate slutDato){
        this.navn = navn;
        this.startDato = startDato;
        this.slutDato = slutDato;
    }

    public ArrayList<Bestilling> getBestillinger(){
        return new ArrayList<>(bestillinger);
    }

    public Bestilling createBestilling(LocalDate dato){
        Bestilling bestilling = new Bestilling(dato);
        bestillinger.add(bestilling);
        bestilling.forestilling = this;
        return bestilling;
    }

    public LocalDate getStartDato(){
        return startDato;
    }

    public int antalBestiltePladserPåDag(LocalDate dato){
        ArrayList<Bestilling> bestillingerPåDagen = new ArrayList<>();
        for (Bestilling b : bestillinger) {
            if (b.getDato() == dato){
                bestillingerPåDagen.add(b);
            }
        }
        return bestillingerPåDagen.size();
    }

    public LocalDate succesDato(){
        LocalDate biggest = bestillinger.get(0).getDato();
        int temp = 0;
        for (Bestilling b : bestillinger){
            if (b.getPladser().size() > temp){
                temp = b.getPladser().size();
                biggest = b.getDato();
            }
        }
        return biggest;
    }

}
