package Exercise02.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Reservation {
    private LocalDateTime start;
    private LocalDateTime slut;

    private final ArrayList<Plads> pladser = new ArrayList<>();
    private final ArrayList<Arrangement> arrangements = new ArrayList<>();

    public Reservation(LocalDateTime start, LocalDateTime slut, Arrangement arrangement){
        this.start = start;
        this.slut = slut;
        arrangements.add(arrangement);
    }

    public ArrayList<Plads> getPladser(){
        return new ArrayList<>(pladser);
    }


}
