package Exercise05;

import java.util.ArrayList;

public class Series {
    private String title;
    private ArrayList<String> cast;

    public Series(String title, ArrayList<String> cast){
        this.title = title;
        this.cast = cast;
    }
    public String getTitle(){
        return title;
    }
    public ArrayList<String>getCast(){
        return cast;
    }
    private ArrayList<Episode> episodes = new ArrayList<>();

    public Episode createEpisode(ArrayList<String> guestActors, int length){
        Episode episode = new Episode(guestActors, length);
        episodes.add(episode);
        return episode;
    }

    public int totalLength(){
        int totalLength = 0;
        for (Episode e : episodes) {
            totalLength += e.getLength();
        }
        return totalLength;
    }

    public ArrayList<String>getGuestActors(){
        ArrayList<String> guestActors = new ArrayList<>();
        for (Episode e : episodes) {
            guestActors.addAll(e.getGuestCast());
        }
        return guestActors;
    }

}
