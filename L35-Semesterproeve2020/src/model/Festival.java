package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Festival {
    private final String name;
    private final LocalDate fraDato;
    private final LocalDate tilDato;

    //Festival skal stå for oprettelse af job-objekter
    private final ArrayList<Job> jobs = new ArrayList<>();

    public Festival(String name, LocalDate fraDato, LocalDate tilDato) {
        this.name = name;
        this.fraDato = fraDato;
        this.tilDato = tilDato;
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

    public Job createJob(String kode, String beskrivelse, LocalDate dato, int timeHonorar, int antalTimer){
        Job job = new Job(kode, beskrivelse, dato, timeHonorar, antalTimer);
        jobs.add(job);
        return job;
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

    public int realiseretJobUdgift(){
        int samletUdgift = 0;
        for (Job j : jobs){
            int antalTimerudfoert = 0;
            for (Vagt v : j.getVagter()){
                antalTimerudfoert += v.getTimer();
            }
            samletUdgift = antalTimerudfoert * j.getTimeHonorar();
        }
        return samletUdgift;
    }

    public ArrayList<String> gaverTilFrivillige(){
        ArrayList<String> list = new ArrayList<>();
        for (Job j : jobs){
            for (Vagt v : j.getVagter()){
                String s = v.getFrivillig().gaveBeskrivelse();
                list.add(s);
            }
        }
        Collections.sort(list);
        return list;
    }

}
