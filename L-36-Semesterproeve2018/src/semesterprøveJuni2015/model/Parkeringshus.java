package semesterprøveJuni2015.model;

import java.time.LocalTime;
import java.util.ArrayList;

public class Parkeringshus {
    private String adresse;
    private int saldo;

    public Parkeringshus(String adresse){
        this.adresse = adresse;
    }

    //-----------------------------------------------------

    private final ArrayList<Parkeringsplads> parkeringspladser = new ArrayList<Parkeringsplads>();

    public ArrayList<Parkeringsplads> getParkeringspladser(){
        return new ArrayList<Parkeringsplads>();
    }
    //-----------------------------------------------------
    public int getSaldo(){
        return saldo;
    }
    public void setSaldo(){
        this.saldo = saldo;
    }
    //-----------------------------------------------------


    public Parkeringsplads createParkeringsplads(int nummer, LocalTime ankomst){
        Parkeringsplads parkeringsplads = new Parkeringsplads(nummer, ankomst);
        parkeringspladser.add(parkeringsplads);
        return parkeringsplads;
    }

    public Invalideplads createInvalidePlads(int nummer, LocalTime ankomst, double areal){
        Invalideplads invalideplads = new Invalideplads(nummer, ankomst, areal);
        parkeringspladser.add(invalideplads);
        return invalideplads;
    }

    public int antalLedigePladser(){
        int ledigePladser = parkeringspladser.size();
        int i = 0;
        for (Parkeringsplads p : parkeringspladser) {
            if (p.getBil() != null){
                i++;
            }
        }
        return ledigePladser - i;
    }

    public int findPladsMedBil(ArrayList<Parkeringsplads> list, String regNr){
        int indeks = -1;
        int i = 0;
        while (indeks == -1 && i < list.size()){
            String k = list.get(i).getBil().getRegNr();
            if (k.equals(regNr)){
                indeks = i;
            } else i++;
        }
        return indeks;
    }

}
