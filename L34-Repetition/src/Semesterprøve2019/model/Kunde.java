package Semesterprøve2019.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Kunde {
    private String navn;
    private String mobil;

    private final ArrayList<Bestilling> bestillinger = new ArrayList<>();

//    public ArrayList<Plads> bestiltePladsertilForestillingPåDag(Forestilling forestilling, LocalDate dato){
//        ArrayList<Plads> pladserTilForestilling = new ArrayList<>();
//        for (Bestilling b : bestillinger){
//            if (dato == b.getDato() && forestilling == b.getForestilling()){
//                pladserTilForestilling.add();
//            }
//        }
//
//        return
//    }
}
