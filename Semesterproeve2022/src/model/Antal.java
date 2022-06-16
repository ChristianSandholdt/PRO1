package model;

public class Antal {
    private int antal;

    //Forbindelse til funktion
    private Funktion funktion;


    Antal(int antal, Funktion funktion) { //Package visible
        this.antal = antal;
        this.funktion = funktion;
    }

    public int getAntal() {
        return antal;
    }

    //--------------------------------------------------------


}
