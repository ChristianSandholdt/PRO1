package storage;

import model.Arrangement;
import model.Education;
import model.Team;
import model.Tutor;

import java.util.ArrayList;

public class Storage {

    private static final ArrayList<Tutor> tutors = new ArrayList<>();
    private static final ArrayList<Arrangement> arrangements = new ArrayList<>();
    private static final ArrayList<Education> educations = new ArrayList<>();

    private static final ArrayList<Team> teams = new ArrayList<>();

    // ------------------------------------------------------------------------
    public static ArrayList<Tutor> getTutors(){
        return new ArrayList<>(tutors);
    }
    public static void saveTutor(Tutor tutor){
        tutors.add(tutor);
    }
    // -------------------------------------------------------------------------
    public static ArrayList<Arrangement> getArrangements(){
        return new ArrayList<>(arrangements);
    }
    public static void saveArrangement(Arrangement arrangement){
        arrangements.add(arrangement);
    }
    // -------------------------------------------------------------------------
    public static ArrayList<Education> getEducations(){
        return new ArrayList<>(educations);
    }
    public static void saveEducation(Education education){
        educations.add(education);
    }
    // -------------------------------------------------------------------------
    public static ArrayList<Team> getTeams(){
        return new ArrayList<>(teams);
    }
    public static void saveTeam(Team team){
        teams.add(team);
    }



}
