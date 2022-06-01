package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Festival {
    private String name;
    private LocalDate fraDato;
    private LocalDate tilDato;

    //Festival skal stå for oprettelse af job-objekter
    private final ArrayList<Job> jobs = new ArrayList<>();

    public Festival(String name, LocalDate fraDato, LocalDate tilDato) {
        this.name = name;
        this.fraDato = fraDato;
        this.tilDato = tilDato;
    }

    public Job createJob(String kode, String beskrivelse, LocalDate dato, int timeHonorar, int antalTimer){
        Job job = new Job(kode, beskrivelse, dato, timeHonorar, antalTimer);
        jobs.add(job);
        return job;
    }

    public String getName() {
        return name;
    }

    public LocalDate getFraDato() {
        return fraDato;
    }

    public LocalDate getTilDato() {
        return tilDato;
    }

    public ArrayList<Job> getJobs() {
        return new ArrayList<>(jobs);
    }

    public int budgetteretJobUdgift(){
        int antalTimer = 0;
        int timehonorar = 0;
        for (Job j: jobs) {
            antalTimer += j.getAntalTimer();
            timehonorar += j.getTimeHonorar();
        }
        return antalTimer*timehonorar;
    }

    public ArrayList<String> gaverTilFrivillige(){

    }

    /*public int realiseretJobUdgift(){
        int temp = 0;
        for (Job j: jobs){
            if (j.getVagter().size() > 0){
                j.getAntalTimer()
            }
        }
    }*/

}
