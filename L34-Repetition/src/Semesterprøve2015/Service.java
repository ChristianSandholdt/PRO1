package Semesterprøve2015;

import java.time.LocalDate;
import java.time.LocalTime;

public class Service {

    public static Spiller createSpiller(String navn, int årgang){
        Spiller spiller = new Spiller(navn, årgang);
        Storage.gemSpiller(spiller);
        return spiller;
    }

    public static ProfSpiller createProfSpiller(String navn, int årgang, double kampHonorar){
        ProfSpiller pSpiller = new ProfSpiller(navn, årgang, kampHonorar);
        Storage.gemSpiller(pSpiller);
        return pSpiller;
    }

    public static Kamp createKamp(String sted, LocalDate dato, LocalTime tid){
        Kamp kamp = new Kamp(sted, dato, tid);
        Storage.gemKamp(kamp);
        return kamp;
    }

    public static void createSumObjects(){
        Spiller s1 =  createSpiller("Jane Jensen",1999);
        Spiller s2 =  createSpiller("Lene Hansen", 2000);
        Spiller s3 =  createSpiller("Mette Pedersen", 1999);
        Spiller s4 =  createProfSpiller("Sofie Kjeldsen",1999,50);
        Spiller s5 =  createProfSpiller("Maria Nielsen",2000, 55);

        Kamp herning = createKamp("Herning",LocalDate.of(2015,1,26), LocalTime.of(10,30,0));
        Kamp ikast = createKamp("Ikast", LocalDate.of(2015,1,27), LocalTime.of(13,30,0));

        herning.createDeltagelse(true,"Moster oda har fødselsdag",s1);
        herning.createDeltagelse(false,"",s2);
        herning.createDeltagelse(false, "", s3);
        herning.createDeltagelse(false,"",s4);
        herning.createDeltagelse(false,"", s5);

        ikast.createDeltagelse(false,"", s1);
        ikast.createDeltagelse(false, "", s2);
        ikast.createDeltagelse(false,"", s3);
        ikast.createDeltagelse(true,"Dårlig form", s4);
        ikast.createDeltagelse(false,"", s5);
    }

    /**
     * Opdaterer sammenhængen mellem spiller og deltagelse så de
     * linker til hinanden
     * Precondition: spiller != null og deltagelse != null
     */
    public static void updateSpillerDeltagelse(Spiller spiller, Deltagelse deltagelse){
    }



}
