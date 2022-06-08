package model;

import java.util.ArrayList;

public class Education {
    private final String name;

    public Education(String name) {
        this.name = name;
    }

    //-----------------------------------------------------

    ArrayList<Team> teams = new ArrayList<Team>();

    public ArrayList<Team> getTeams(){
        return new ArrayList<>(teams);
    }

    //-----------------------------------------------------

    public Team createTeam(String designation, String teamCaptain){
        Team team = new Team(designation, teamCaptain);
        teams.add(team);
        return team;
    }

    public void addEducation(Team team){
        teams.add(team);
    }

    public void removeEducation(Team team){
        teams.remove(team);
    }

    //-----------------------------------------------------

    public ArrayList<String> tutorOversigt(ArrayList<Team> teams){
        ArrayList<String> tutorList = new ArrayList<>();
        for (Team team : teams) {
            for (Tutor t : team.getTutors()) {
                String s = t.getName() + " " + t.getTeam().getEducation() +" " + t.getTeam() + " " + t.getEmail() +" " + team.getTeamCaptain();
                tutorList.add(s);
            }
        }
        return tutorList;
    }

}
