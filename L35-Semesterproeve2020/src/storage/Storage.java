package storage;

import model.Festival;
import model.Frivillig;

import java.util.ArrayList;

public class Storage {
    private static final ArrayList<Festival> festivaller = new ArrayList<>();
    private static final ArrayList<Frivillig> frivillige = new ArrayList<>();

    // -------------------------------------------------------------------------

    public static ArrayList<Festival> getFestivaller(){
        return new ArrayList<>(festivaller);
    }
    public static void gemFestivaller(Festival festival){
        festivaller.add(festival);
    }

    // -------------------------------------------------------------------------

    public static ArrayList<Frivillig> getFrivillige(){
        return new ArrayList<>(frivillige);
    }
    public static void gemFrivillig(Frivillig frivillig){
        frivillige.add(frivillig);
    }

}
