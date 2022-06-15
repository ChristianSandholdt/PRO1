package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Forestilling {

    private String navn;
    private LocalDate startDato;
    private LocalDate slutDato;

    public Forestilling(String navn, LocalDate startDato, LocalDate slutDato) {
        this.navn = navn;
        this.startDato = startDato;
        this.slutDato = slutDato;
    }

    public String getNavn() {
        return navn;
    }

    public LocalDate getStartDato() {
        return startDato;
    }

    public LocalDate getSlutDato() {
        return slutDato;
    }

    //-------------------------------------------------------------

    private final ArrayList<Bestilling> bestillinger = new ArrayList<>();

    public ArrayList<Bestilling> getBestillinger() {
        return new ArrayList<>(bestillinger);
    }

    public Bestilling opretBestilling(LocalDate dato){
        Bestilling bestilling = new Bestilling(dato);
        bestillinger.add(bestilling);
        bestilling.forestilling = this;
        return bestilling;
    }

    //S3 5 point
    public int antalBestiltePladserPåDag(LocalDate dato){
        int i = 0;
        for (Bestilling b : bestillinger) {
            if (b.getDato() == dato){
                i++;
            }
        }
        return i;
    }
    //S4 7 point
    public LocalDate succesDato(){
        LocalDate temp = bestillinger.get(0).getDato();
        int temp1 = 0;
        for (int i = 0; i < bestillinger.size(); i++){
            if (bestillinger.get(i).getPladser().size() > temp1){
                temp1 = bestillinger.get(i).getPladser().size();
            }
            temp = bestillinger.get(i).getDato();
        }
        return temp;
    }

//    public boolean erPladsLedig(int række, int nr, LocalDate dato){
//        boolean ledig = true;
//        for (Bestilling b : bestillinger) {
//            if (b.getDato() == dato && b.getPladser().get().get)
//        }
//    }
}
