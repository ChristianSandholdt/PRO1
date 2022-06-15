package controller;

import model.Forestilling;
import model.Kunde;
import storage.Storage;

import java.time.LocalDate;

public class Controller {

    public static Forestilling opretForestilling(String navn, LocalDate startDato, LocalDate slutDato){
        Forestilling forestilling = new Forestilling(navn, startDato, slutDato);
        Storage.gemForestilling(forestilling);
        return forestilling;
    }

    public static Kunde opretKunde(String navn, String mobil){
        Kunde kunde = new Kunde(navn, mobil);
        Storage.gemKunde(kunde);
        return kunde;
    }

    public static void initStorage(){
        Forestilling f1 = opretForestilling("Evita", LocalDate.of(2019,1,10), LocalDate.of(2019,1,20));
        Forestilling f2 = opretForestilling("Lykke Per", LocalDate.of(2019,2,1),LocalDate.of(2019,2,10));
        Forestilling f3 = opretForestilling("Chess",LocalDate.of(2019,1,21),LocalDate.of(2019,1,30));

        Kunde k1 = opretKunde("Anders Hansen", "11223344");
        Kunde k2 = opretKunde("Peter Jensen", "12345678");
        Kunde k3 = opretKunde("Niels Madsen","12341234");
    }


}
