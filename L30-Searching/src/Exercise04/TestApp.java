package Exercise04;

import java.util.ArrayList;
import java.util.List;

public class TestApp {

    public static void main(String[] args) {

        ArrayList<Player> players = new ArrayList<>(List.of(
                new Player("Thiago",65,1.82,62),
                new Player("Jurgen", 58,1.69,73),
                new Player("Firmino",43,1.83, 75),
                new Player("Milner", 32, 1.99, 102),
                new Player("Trent",23,1.77, 70),
                new Player("Robbo",2,1.85, 85)));

        Player spiller = findPlayerLinear(players, 2);
        System.out.println("Er der en spiller som har scoret 2 mål? " + spiller);

        Player spiller2 = findPlayerBinary(players,65);
        System.out.println("Er der en spiller som har scoret 65 mål? " + spiller2);

        String spiller3 = findPlayerName(players);
        System.out.println("Er der en spiller under 170cm som har scoret over 50 mål? " + spiller3);
    }

    //Find en spiller som har scoret det indtastede antal mål. Returnerer null hvis ingen spiller har scoret det antal mål
    public static Player findPlayerLinear(ArrayList<Player> players, int score){
        Player p = null;
        int i = 0;
        while (p == null && i < players.size()){
            Player q = players.get(i);
            if (q.getGoalsScored() == score){
                p = q;
            } else i++;
        }
        return p;
    }
    //Find en spiller som har scoret det indtastede antal mål. Returnerer null hvis ingen spiller har scoret det antal mål
    //Skal bruge en sorteret arraylist
    public static Player findPlayerBinary(ArrayList<Player> players, int score){
        Player p = null;
        int left = 0;
        int right = players.size()-1;

        while (p == null && left <= right){
            int middle = (left + right) / 2;
            Player q = players.get(middle);
            if (q.getGoalsScored() == score){
                p = q;
            } else if (q.getGoalsScored() < score){
                right = middle -1;
            } else left = middle +1;
        }
        return p;
    }
    //Ex4c
    //Find en spiller som er mindre en 1.70cm og har scoret mere end 50 mål.
    //Finder den første spiller i arrayet som opfylder kravene
    public static String findPlayerName(ArrayList<Player> players){
        int i = 0;
        String p = null;
        while (p == null && i < players.size()){
            Player q = players.get(i);
            if (q.getHeight() < 1.70 && q.getGoalsScored() > 50){
                p = String.valueOf(q);
            } else i++;
        }
        return p;
    }





}
