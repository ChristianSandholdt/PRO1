package Exercise01;

import java.util.ArrayList;

import static Exercise01.DogRace.Race.*;


public class TestApp {




    public static void main(String[] args) {

        ArrayList<Hund> hunde = new ArrayList<>();
        Hund h1 = new Hund("Fido", false, 100, Terrier);
        Hund h2 = new Hund("Molly", false, 150, Terrier);
        Hund h3 = new Hund("Martin", false, 45, Bokser);
        Hund h4 = new Hund("Bjørn", false, 30, Puddel);
        Hund h5 = new Hund("Anton", false, 40, Bokser);

        hunde.add(h1);
        hunde.add(h2);
        hunde.add(h3);
        hunde.add(h4);
        hunde.add(h5);


        System.out.println(samletPris(hunde, Puddel));
        System.out.println(samletPris(hunde, Bokser));
        System.out.println(samletPris(hunde, Terrier));





    }

    public static int samletPris(ArrayList<Hund> hunde, DogRace.Race race){
        int total = 0;
        for (Hund hund : hunde){
            if (hund.getRace() == race){
                total += hund.getPrice();
            }
        }
        return total;
    }


}
