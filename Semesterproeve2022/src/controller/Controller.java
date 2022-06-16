package controller;

import model.Antal;
import model.Funktion;
import model.Medarbejder;
import model.Vagt;
import storage.Storage;

import java.io.File;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Controller {

    public static Funktion opretFunktion(String navn){
        Funktion funktion = new Funktion(navn);
        Storage.gemFunktion(funktion);
        return funktion;
    }

    public static Medarbejder opretMedarbejder(String navn, int antalTimerPrDag, LocalTime typiskMoedetid){
        Medarbejder medarbejder = new Medarbejder(navn, antalTimerPrDag, typiskMoedetid);
        Storage.gemMedarbejder(medarbejder);
        return medarbejder;
    }

    public static Vagt opretVagt(String navn, LocalDateTime tidFra, LocalDateTime tidTil){
        Vagt vagt = new Vagt(navn, tidFra, tidTil);
        Storage.gemVagter(vagt);
        return vagt;
    }

    public static Antal opretAntal(int antal, Vagt vagt, Funktion funktion){
        return vagt.opretAntal(antal, funktion);
    }


    public static void initStorage(){
        Funktion f1 = opretFunktion("Filetering");
        Funktion f2 = opretFunktion("Grøntsager");
        Funktion f3 = opretFunktion("Sovs og Tilbehør");
        Funktion f4 = opretFunktion("Buffetopfyldning");

        Medarbejder m1 = opretMedarbejder("Peter",6,LocalTime.of(8,0));
        Medarbejder m2 = opretMedarbejder("Anne",8,LocalTime.of(8,0));
        Medarbejder m3 = opretMedarbejder("Marie",6, LocalTime.of(8,0));
        Medarbejder m4 = opretMedarbejder("Torben", 8, LocalTime.of(7,0));

        Vagt v1 = opretVagt("Røgede ål til medarbejderne", LocalDateTime.of(2022,6,24,8,30),
                LocalDateTime.of(2022,6,24,12,30));
        Antal a1 = opretAntal(2,v1,f1);
        Antal a2 = opretAntal(1,v1,f2);
        Antal a3 = opretAntal(1,v1,f3);
        Antal a4 = opretAntal(1,v1,f4);

        //Tilføj medarbejderen til vagten
        m1.addVagt(v1);
        m2.addVagt(v1);
        m3.addVagt(v1);
        m4.addVagt(v1);

        //Peters funktioner
        m1.addFunktion(f2); m1.addFunktion(f3); m1.addFunktion(f4);

        //Annes funktioner
        m2.addFunktion(f2); m2.addFunktion(f3); m2.addFunktion(f4);

        //Maries funktioner
        m3.addFunktion(f1); m3.addFunktion(f2); m3.addFunktion(f4);

        //Torbens funktioner
        m4.addFunktion(f1); m4.addFunktion(f3);
    }

    //Opgave S10 10 point
//    public static void udskrivVagtplan(Vagt vagt, String filnavn){
//        String filename = "Semesterproeve2022/src/controller/Vagtplan";
//        File in = new File(filename);
//        try
//    }

}
