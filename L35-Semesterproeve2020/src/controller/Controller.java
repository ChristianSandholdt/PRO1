package controller;

import model.*;
import storage.Storage;

import java.time.LocalDate;

public class Controller {

    public static Festival createFestival(String name, LocalDate fraDato, LocalDate tilDato){
        Festival festival = new Festival(name, fraDato, tilDato);
        Storage.gemFestivaller(festival);
        return festival;
    }

    public static Frivillig createFrivillig(String navn, String mobil, int maksAntalTimer){
        Frivillig frivillig = new Frivillig(navn, mobil, maksAntalTimer);
        Storage.gemFrivillig(frivillig);
        return frivillig;
    }

    public static Frivillig createFrivilligForening(String navn, String mobil, int maksAntalTimer, String foreningsNavn, int antalPersoner){
        FrivilligForening frivilligForening = new FrivilligForening(navn, mobil, maksAntalTimer, foreningsNavn, antalPersoner);
        Storage.gemFrivillig(frivilligForening);
        return frivilligForening;
    }

    //Opret job

    public static void initStorage(){
        Festival f1 = new Festival("Northside",
                LocalDate.of(2020,6,4),
                LocalDate.of(2020,6,6));

        Frivillig fri1 = new Frivillig("Jane Jensen", "12345678", 20);
        Frivillig fri2 = new Frivillig("Lone Hansen", "78787878", 25);
        Frivillig fri3 = new Frivillig("Anders Mikkelsen","55555555",10);

        Frivillig frifor1 = new FrivilligForening("Christian Madsen", "23232323",100,"Erhvervsakademi Aarhus", 40);

        Job j1 = new Job("T1","Rengøring af toilet",LocalDate.of(2020,6,4),100,5);
        Job j2 = new Job("T1","Rengøring af toilet",LocalDate.of(2020,6,4),100,5);
        Job j3 = new Job("T1","Rengøring af toilet",LocalDate.of(2020,6,4),100,5);

        Job j4 = new Job("T1","Rengøring af toilet",LocalDate.of(2020,6,5),100,5);
        Job j5 = new Job("T1","Rengøring af toilet",LocalDate.of(2020,6,5),100,5);
        Job j6 = new Job("T1","Rengøring af toilet",LocalDate.of(2020,6,5),100,5);

        Job j7 = new Job("T1","Rengøring af toilet",LocalDate.of(2020,6,6),100,5);
        Job j8 = new Job("T1","Rengøring af toilet",LocalDate.of(2020,6,6),100,5);
        Job j9 = new Job("T1","Rengøring af toilet",LocalDate.of(2020,6,6),100,5);


    }

    public static Vagt tagVagt(Job job, Frivillig frivillig, int timer) {
        if (frivillig.ledigeTimer(frivillig) > job.getAntalTimer()) {
            if (timer < frivillig.getMaksAntalTimer() || job.getAntalTimer() > timer) {
                frivillig.setMaksAntalTimer(timer);
            } else {
                throw new RuntimeException("Fejl, den frivillige har ikke timer nok, eller jobbet har for få timer");

            }
        }
        return job.createVagt(timer);
    }
}
