package Exercise05;

import java.util.ArrayList;

public class Episode {
    private static int number = 0;
    private ArrayList<String>guestActors;
    private int lengthMinutes;

    public Episode(ArrayList<String>guestActors, int lengthMinutes){
        number++;
        this.guestActors = guestActors;
        this.lengthMinutes = lengthMinutes;
    }

    public int getNumber(){
        return number;
    }

    public ArrayList<String> getGuestCast() {
        return guestActors;
    }

    public int getLength() {
        return lengthMinutes;
    }
}

