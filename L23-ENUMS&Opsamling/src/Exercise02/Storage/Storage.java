package Exercise02.Storage;

import Exercise02.model.Arrangement;
import Exercise02.model.Plads;
import Exercise02.model.Reservation;

import java.util.ArrayList;

public class Storage {
    private static final ArrayList<Reservation> reservations = new ArrayList<>();
    private static final ArrayList<Plads> pladser = new ArrayList<>();
    private static final ArrayList<Arrangement> arrangementer = new ArrayList<>();

    public static void storeReservation(Reservation reservation){
        reservations.add(reservation);
    }
    public static ArrayList<Reservation> getReservations(){
        return new ArrayList<>(reservations);
    }

    public static void StorePlads(Plads plads){
        pladser.add(plads);
    }
    public static ArrayList<Plads> getPladser(){
        return new ArrayList<>(pladser);
    }

    public static void storeArrangement(Arrangement arrangement){
        arrangementer.add(arrangement);
    }

    public static ArrayList<Arrangement> getArrangementer(){
        return new ArrayList<>(arrangementer);
    }




}
