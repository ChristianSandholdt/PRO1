package Opgave5;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    public static void main(String[] args) {
        ArrayList<Vare> varer = new ArrayList<>(List.of(
        new Vare("Gulvtæppe", 100, "Et flot gulvtæppe"),
        new Fødevare("Mælk", 11.5, "Mælk fra Arla"),
        new Liquor("Vodka", 56, "Vodka fra Rusland"),
        new Elartikel("Stikdåse", 45, "Stikdåse med 4 udtag")));


    }

    public static void printOutBon(ArrayList<Vare> varer){
        for (Vare v : varer){
            System.out.println();
        }
    }

}
