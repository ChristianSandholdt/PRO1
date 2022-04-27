package Exercise02.model;

import java.util.ArrayList;

public class Arrangement {
    private String name;
    private boolean offentlig;

    private final ArrayList<Reservation> reservations = new ArrayList<>();

    public Arrangement(String name, boolean offentlig){
        this.name = name;
        this.offentlig = offentlig;
    }

    /** PRE: Reservation is not connected to an arrangement */
    public void addReservation(Reservation reservation){
        reservations.add(reservation);
    }
    //-----------------------------------------------------------------
    //                      S2

    private int antalReserveredePladser(){
        int sum = 0;
        for (Reservation res : reservations) {
            sum += res.getPladser().size();
        }
        return sum;
    }

}
