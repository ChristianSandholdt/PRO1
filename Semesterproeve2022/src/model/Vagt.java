package model;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class Vagt {

    private String navn;
    private LocalDateTime tidFra;
    private LocalDateTime tidTil;

    public Vagt(String navn, LocalDateTime tidFra, LocalDateTime tidTil) {
        this.navn = navn;
        this.tidFra = tidFra;
        this.tidTil = tidTil;
    }

    public String getNavn() {
        return navn;
    }

    public LocalDateTime getTidFra() {
        return tidFra;
    }

    public LocalDateTime getTidTil() {
        return tidTil;
    }

    //--------------------------------------------------------

    //Forbindelse til medarbejder
    final ArrayList<Medarbejder> medarbejdere = new ArrayList<>(); //Package visible

    public ArrayList<Medarbejder> getMedarbejdere() {
        return new ArrayList<Medarbejder>(medarbejdere);
    }

    //Forbindelse til antal

    private final ArrayList<Antal> antals = new ArrayList<>();

    public ArrayList<Antal> getAntals() {
        return new ArrayList<>(antals);
    }

    public Antal opretAntal(int antal, Funktion funktion){
        Antal a1 = new Antal(antal, funktion);
        antals.add(a1);
        return a1;
    }
    //--------------------------------------------------------

    //Opgave S2 5 point
    public Medarbejder findMedarbejder(LocalTime tidspunkt, int antalTimer){
        Medarbejder ma = null;
        for (Medarbejder m : medarbejdere) {
            if (tidFra.getHour() == tidspunkt.getHour() && tidFra.getMinute() == tidspunkt.getMinute()){
                if ((tidTil.getHour() - tidFra.getHour()) + (tidTil.getMinute() - tidFra.getMinute()) >= antalTimer){
                    ma = m;
                }
            }
        }
        return ma;
    }

    //Opgave S3 5 point
    public int beregnTimeforbrug(Vagt vagt){
        double timeForbrug = 0;
        double vagtTid = (vagt.getTidTil().getHour() - vagt.getTidFra().getHour()) + (vagt.getTidTil().getMinute() - vagt.getTidFra().getMinute());
        timeForbrug = vagt.getMedarbejdere().size() * vagtTid;
        String tid = timeForbrug + "";
        return Integer.parseInt(tid);
    }

    //Opgave S4 5 point
    public int antalMedarbejdereMedFunktion(Funktion funktion){
        int counter = 0;
        for (Medarbejder m : medarbejdere) {
            for (Funktion f : m.getFunktioner()){
                if (funktion.getNavn().equals(f.getNavn())){
                    counter++;
                }
            }

        }
        return counter;
    }

    //Opgave S5 5 point
    public Medarbejder[] skalAdviseresOmMoedeTid(Vagt vagt){
        int i = 0;
        Medarbejder a1[] = new Medarbejder[10];
        for (Medarbejder m : medarbejdere) {
            if (m.getTypiskMødeTid().getHour() + m.getTypiskMødeTid().getMinute() > (vagt.getTidFra().getHour() + vagt.getTidFra().getMinute())){
                a1[i] = m;
                i++;
            }
        }
        return a1;
    }

    //Opgave S6 8 point
    //Obs brug søgeskabelon


    @Override
    public String toString() {
        return getNavn();
    }
}


