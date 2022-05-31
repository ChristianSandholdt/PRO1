package Semesterprøve2015;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class Kamp {

    private String sted;
    private LocalDate dato;
    private LocalTime tid;

    private ArrayList<Deltagelse> deltagelser;

    public Kamp(String sted, LocalDate dato, LocalTime tid){
        this.sted = sted;
        this.dato = dato;
        this.tid = tid;
    }

    public String getSted() {
        return sted;
    }

    public LocalDate getDato() {
        return dato;
    }

    public LocalTime getTid() {
        return tid;
    }

    public Deltagelse createDeltagelse(boolean afbud, String begrundelse, Spiller spiller){
        Deltagelse deltagelse = new Deltagelse(afbud, begrundelse, spiller);
        return deltagelse;
    }

    public ArrayList<String> afbud(){
        ArrayList<String> afbudsListe = new ArrayList<>();
        for (Deltagelse d : deltagelser){
            if (d.meldtAfbud()){
                String s = d.getSpiller().getNavn() + ", " + d.getBegrundelse();
                afbudsListe.add(s);
            }
            }
        return afbudsListe;
    }

}

