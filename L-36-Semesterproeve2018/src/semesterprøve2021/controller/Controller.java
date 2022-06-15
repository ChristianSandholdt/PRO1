package semesterprøve2021.controller;


import semesterprøve2021.model.*;
import semesterprøve2021.storage.Storage;

import java.time.LocalDate;
import java.time.LocalTime;

public class Controller {

    public static Fag opretFag(String navn, String klasse, Lektion lektion) {
        Fag fags = new Fag(navn, klasse, lektion);
        Storage.storeFag(fags);
        return fags;
    }

    public static Studerende opretStuderende(String navn, String email) {
        Studerende studerende = new Studerende(navn, email);
        Storage.storeStuderende(studerende);
        return studerende;
    }

    public static Lektion opretLektion(LocalDate dato, LocalTime startTid, String lokale)  {
        Lektion lektion = new Lektion(dato, startTid, lokale);
        return lektion;
    }

    public static Deltagelse opretDeltagelser(Studerende studerende, Lektion lektion, boolean registreret, DeltagerStatus status) {
        Deltagelse deltagelse =  lektion.opretDeltagelse(registreret, status, lektion, studerende);
        return deltagelse;
    }

    //-------------------------------------------------------------------------------------

    public static void initStorage() {
        Studerende s1 = opretStuderende("Peter Hansen", "ph@stud.dk");
        Studerende s2 = opretStuderende("Tina Jensen", "tj@stud.dk");
        Studerende s3 = opretStuderende("Sascha Petersen", "sp@stud.dk");



        Lektion l1 = opretLektion(LocalDate.of(2021, 2, 1),LocalTime.of(8, 30),"A1.32");
        Lektion l2 = opretLektion(LocalDate.of(2021, 2, 1),LocalTime.of(10, 30),"A1.32");
        Lektion l3 = opretLektion(LocalDate.of(2021, 2, 3),LocalTime.of(8, 30),"A1.32");
        Lektion l4 = opretLektion(LocalDate.of(2021, 2, 3),LocalTime.of(10, 30),"A1.32");

        Fag f1 = opretFag("PRO1 ", "20S",l1);
        f1.addLektion(l2);
        f1.addLektion(l3);
        f1.addLektion(l4);
        Fag f2 = opretFag("PRO1 ", "20T",l2);
        Fag f3 = opretFag("SU1 ", "20S",l3);


        f1.getLektioner().add(l1);
        f1.getLektioner().add(l2);
        f1.getLektioner().add(l3);
        f1.getLektioner().add(l4);

        Deltagelse d1 = opretDeltagelser(s1,l1,false,DeltagerStatus.TILSTEDE);
        Deltagelse d2 = opretDeltagelser(s2,l1,false,DeltagerStatus.TILSTEDE);
        Deltagelse d3 = opretDeltagelser(s3,l1,false,DeltagerStatus.TILSTEDE);


    }

}
