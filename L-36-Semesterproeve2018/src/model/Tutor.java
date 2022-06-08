package model;

import java.util.ArrayList;

public class Tutor {
    private final String name;
    private final String email;

    public Tutor(String name, String email) {
        this.name = name;
        this.email = email;
    }
    //-----------------------------------------------------

    public String getName(){
        return name;
    }

    public String getEmail() {
        return email;
    }

    private final ArrayList<Arrangement> arrangements = new ArrayList<>();

    public ArrayList<Arrangement> getArrangements(){
        return new ArrayList<>(arrangements);
    }

    public void addArrangement(Arrangement arrangement){
        arrangements.add(arrangement);
    }
    public void removeArrangement(Arrangement arrangement){
        arrangements.remove(arrangement);
    }

    Team team; //Obs. package visible

    public Team getTeam(){
        return team;
    }



    public double arrangementPris(){
        double sum = 0;
        for (Arrangement a : arrangements) {
             sum += a.getPrice();
        }
        return sum;
    }

}
