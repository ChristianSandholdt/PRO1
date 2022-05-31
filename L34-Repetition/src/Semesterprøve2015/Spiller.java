package Semesterprøve2015;

import java.util.ArrayList;

public class Spiller {

    private String navn;
    private int årgang;

    private ArrayList<Deltagelse> deltagelser;

    public Spiller(String navn, int årgang){
        this.navn = navn;
        this.årgang = årgang;
    }

    public String getNavn() {
        return navn;
    }

    public int getÅrgang() {
        return årgang;
    }

    public double kampHonorar(){
        double honorar = 0;
        for (Deltagelse d: deltagelser) {
            if (!d.meldtAfbud()) {
                honorar += 10;
            }
        }
        return honorar;
    }


}
