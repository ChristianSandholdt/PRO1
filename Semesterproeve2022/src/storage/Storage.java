package storage;

import model.Funktion;
import model.Medarbejder;
import model.Vagt;

import java.util.ArrayList;

public class Storage {

    private static final ArrayList<Funktion> funktioner = new ArrayList<>();

    public static ArrayList<Funktion> getFunktioner(){
        return new ArrayList<>(funktioner);
    }

    public static void gemFunktion(Funktion funktion){
        funktioner.add(funktion);
    }

    private static final ArrayList<Medarbejder> medarbejdere = new ArrayList<>();

    public static ArrayList<Medarbejder> getMedarbejdere() {
        return new ArrayList<>(medarbejdere);
    }

    public static void gemMedarbejder(Medarbejder medarbejder){
        medarbejdere.add(medarbejder);
    }

    private static final ArrayList<Vagt> vagter = new ArrayList<>();

    public static ArrayList<Vagt> getVagter() {
        return new ArrayList<>(vagter);
    }

    public static void gemVagter(Vagt vagt){
        vagter.add(vagt);
    }
}
