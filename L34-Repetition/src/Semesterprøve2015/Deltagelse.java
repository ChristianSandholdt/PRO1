package Semesterprøve2015;

public class Deltagelse {

    private boolean afbud;
    private String begrundelse;

    private Spiller spiller;

    public boolean meldtAfbud() {
        return afbud;
    }

    public String getBegrundelse() {
        return begrundelse;
    }

    public Spiller getSpiller() {
        return spiller;
    }

    public Deltagelse(boolean afbud, String begrundelse, Spiller spiller){
        this.afbud = afbud;
        this.begrundelse = begrundelse;
        this.spiller = spiller;
    }
}
