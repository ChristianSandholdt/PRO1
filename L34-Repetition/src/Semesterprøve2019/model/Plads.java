package Semesterprøve2019.model;

public class Plads {

    private int række;
    private int nummer;
    private int pris;

    public Plads(int række, int nummer, int pris) {
        this.række = række;
        this.nummer = nummer;
        this.pris = pris;
    }

    public int getPris(){
        return pris;
    }
}
