package Exercise01;

import java.util.ArrayList;

public class Hund {
    private final int price;
    private DogRace.Race race;
    private String name;
    private boolean heritage;

    public Hund(String name, boolean heritage, int price, DogRace.Race race){
        this.price = price;
        this.name = name;
        this.heritage = heritage;
        this.race = race;
    }

    public int getPrice(){
        return price;
    }

    public DogRace.Race getRace() {
        return race;
    }


}
