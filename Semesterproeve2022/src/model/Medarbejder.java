package model;

import java.time.LocalTime;
import java.util.ArrayList;

public class Medarbejder {

    private String navn;
    private int antalTimerPrDag;
    private LocalTime typiskMødeTid;

    public Medarbejder(String navn, int antalTimerPrDag, LocalTime typiskMødeTid) {
        this.navn = navn;
        this.antalTimerPrDag = antalTimerPrDag;
        this.typiskMødeTid = typiskMødeTid;
    }

    public String getNavn() {
        return navn;
    }

    public int getAntalTimerPrDag() {
        return antalTimerPrDag;
    }

    public LocalTime getTypiskMødeTid() {
        return typiskMødeTid;
    }

    //---------------------------------------------------

    //Medarbejder har ansvaret for at opretholde forbindelsen mellem medarbejder og vagt.
    //Forbindelse til vagt
    private final ArrayList<Vagt> vagter = new ArrayList<>();

    public ArrayList<Vagt> getVagter() {
        return new ArrayList<>(vagter);
    }

    //Opgave S7 8 point
//    public void addVagt(Vagt vagt){
//        vagter.add(vagt);
//    }
    public void addVagt(Vagt vagt){
        for (Vagt v : getVagter()) {
            if(vagt.getTidFra().isAfter(v.getTidFra()) && vagt.getTidTil().isBefore(v.getTidTil())){
                if (vagt.getTidTil().isBefore(v.getTidTil()) && vagt.getTidFra().isAfter(v.getTidFra())){
                    if (vagt.getTidFra().isBefore(v.getTidTil()) && vagt.getTidTil().isBefore(v.getTidTil()) )
                        throw new RuntimeException(getNavn() + "Har allerede en vagt i det tidsrum ved navn" + v.getNavn());
                }
            } else
                vagter.add(vagt);
        }
    }

    public void removeVagt(Vagt vagt){
        vagter.remove(vagt);
    }

    //Forbindelse til funktion

    private final ArrayList<Funktion> funktioner = new ArrayList<>();

    public ArrayList<Funktion> getFunktioner() {
        return new ArrayList<>(funktioner);
    }

    public void addFunktion(Funktion funktion){
        funktioner.add(funktion);
    }

    public void removeFunktion(Funktion funktion){
        funktioner.remove(funktion);
    }
    //--------------------------------------------------------


    //Til brug i gui
    @Override
    public String toString() {
        return getNavn() + ", Typisk mødetid: " + getTypiskMødeTid();
    }
}
