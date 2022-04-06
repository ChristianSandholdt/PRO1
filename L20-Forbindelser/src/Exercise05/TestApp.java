package Exercise05;

import java.util.ArrayList;
import java.util.List;

public class TestApp {
    public static void main(String[] args) {
        ArrayList<String> Cast = new ArrayList<>(List.of("Nikolaj Lie Kaas","Kim Bodnia", "Mads Mikkelsen"));
        Series Drengerøvene = new Series("Drengerøvene", Cast);

        ArrayList<String>gæsteCast = new ArrayList<>(List.of("Frank Hvam"));
        ArrayList<String>gæsteCast1 = new ArrayList<>(List.of("Casper Christensen"));


        Drengerøvene.createEpisode(gæsteCast, 30);
        Drengerøvene.createEpisode(gæsteCast1,29);

        System.out.println(Drengerøvene.totalLength());
        System.out.println(Drengerøvene.getGuestActors());

    }
}
