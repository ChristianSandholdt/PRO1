package semesterprøveJuni2015.model;

import java.time.LocalTime;

public class Parkeringsplads {
    private int nummer;
    private LocalTime ankomst;

    public Parkeringsplads(int nummer, LocalTime ankomst){
        this.nummer = nummer;
        this.ankomst = null;
    }

    public void setAnkomst(LocalTime ankomst) {
        this.ankomst = ankomst;
    }

    public LocalTime getAnkomst() {
        return ankomst;
    }

    public int getNummer() {
        return nummer;
    }

    //-----------------------------------------------------
    Parkeringshus parkeringshus; //Package visible

    public Parkeringshus getParkeringshus() {
        return parkeringshus;
    }
    //-----------------------------------------------------
    private Bil bil;

    public Bil getBil(){
        return bil;
    }
    /** Pre: This person is not connected to a group. */
    public void setBil(Bil bil){
        this.bil = bil;
    }
    /** Pre: This person is connected to a group. */
    public void removeBil(Bil bil){
        this.bil = null;
    }
    //-----------------------------------------------------

//    public int beregnPrisForParkering(LocalTime slutTidspunkt){
//        LocalTime i = getAnkomst(); //LocalTime.of(ankomst.getHour(), ankomst.getMinute(), ankomst.getSecond());
//        if (i.getHour() != slutTidspunkt.getHour()){
//            int timeForskel = (slutTidspunkt.getHour() - i.getHour()) * 36;
//        }
//        if (i.getMinute() != ankomst.getMinute())
//    }

    public void hentBil(LocalTime afgangsTidspunkt){

    }





}
