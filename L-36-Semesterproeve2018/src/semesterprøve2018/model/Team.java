package semesterprøve2018.model;

import java.util.ArrayList;

public class Team {
    private final String designation;
    private String teamCaptain;

    Education education; //OBS. package visible

    //-----------------------------------------------------

    public Team(String designation, String teamCaptain) {
        this.designation = designation;
        this.teamCaptain = teamCaptain;
    }

    public Education getEducation() {
        return education;
    }

    public String getTeamCaptain() {
        return teamCaptain;
    }
    //-----------------------------------------------------

    public ArrayList<Tutor> tutors = new ArrayList<>();

    public ArrayList<Tutor> getTutors() {
        return new ArrayList<>(tutors);
    }

    public void addTutor(Tutor tutor) {
        tutors.add(tutor);
        tutor.team = this;
    }

    public void removeTutor(Tutor tutor) {
        tutors.remove(tutor);
        tutor.team = null;
    }

    //-----------------------------------------------------

    public double arrangementsPris() {
        double sum = 0;
        for (Tutor t : tutors) {
            sum = t.arrangementPris();
        }
        return sum;
    }
    //-----------------------------------------------------

    boolean harTidsOverlap(Arrangement arrangement) {
        boolean harOverlap = false;
        for (Tutor t : tutors) {
            for (Arrangement a : t.getArrangements()) {
                if (arrangement.getDate().equals(a.getDate())) {
                    if (arrangement.getStartTime().isAfter(a.getStartTime()) && arrangement.getStartTime().isBefore(a.getEndTime())) {
                        if (arrangement.getEndTime().isAfter(arrangement.getStartTime()) && arrangement.getEndTime().isBefore(arrangement.getEndTime())){
                            harOverlap = true;
                        }
                    }
                }
                
            }
        }

        return harOverlap;
    }
}

