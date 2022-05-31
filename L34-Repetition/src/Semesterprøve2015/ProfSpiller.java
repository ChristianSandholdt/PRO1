package Semesterprøve2015;

import java.util.ArrayList;

public class ProfSpiller extends Spiller{

    private double kampHonorar;
    private ArrayList<Deltagelse> deltagelser;

    public ProfSpiller(String navn, int årgang, double kampHonorar) {
        super(navn, årgang);
        this.kampHonorar = kampHonorar;
    }

    public double calcHonorar(){
        double counterAfbud = 0;
        for (Deltagelse d : deltagelser) {
            if (d.meldtAfbud()) {
                counterAfbud++;
            }
        }
        return kampHonorar * (counterAfbud*(deltagelser.size()/100.0));
    }

}
