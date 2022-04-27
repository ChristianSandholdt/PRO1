package Exercise03.controller;

import Exercise03.model.Newsflash;
import Exercise03.storage.Storage;

public class Controller {
    public static Newsflash createNewsflash(String header, String content){
        Newsflash newsflash = new Newsflash(header, content);
        Storage.storeNewsflash(newsflash);
        return newsflash;
    }
}
