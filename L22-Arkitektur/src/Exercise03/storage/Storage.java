package Exercise03.storage;

import Exercise03.model.Newsflash;

import java.util.ArrayList;

public class Storage {
    private static final ArrayList<Newsflash> newsflashes = new ArrayList<>();

    public static ArrayList<Newsflash> getNewsflashes(){
        return new ArrayList<>(newsflashes);
    }

    public static void storeNewsflash(Newsflash newsflash){
        newsflashes.add(newsflash);
    }

    public static void deleteNewsFlash(Newsflash newsflash){
        newsflashes.remove(newsflash);
    }
}
