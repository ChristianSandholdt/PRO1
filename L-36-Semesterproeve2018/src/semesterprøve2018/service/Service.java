package semesterprøve2018.service;

import semesterprøve2018.model.Arrangement;
import semesterprøve2018.model.Education;
import semesterprøve2018.model.Team;
import semesterprøve2018.model.Tutor;
import semesterprøve2018.storage.Storage;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Service {
    public static Arrangement createArrangement(String title, LocalDate date, LocalTime startTime,
                                                LocalTime endTime, double price){
        Arrangement arrangement = new Arrangement(title, date, startTime, endTime, price);
        Storage.saveArrangement(arrangement);
        return arrangement;
    }

    public static Team createTeam(String designation, String teamCaptain, Education education) {
        Team team = new Team(designation, teamCaptain);
        Storage.saveTeam(team);
        return education.createTeam(designation, teamCaptain);
    }

    public static Tutor createTutor(String name, String email){
        Tutor tutor = new Tutor(name, email);
        Storage.saveTutor(tutor);
        return tutor;
    }

    public static Education createEducation(String name){
        Education education = new Education(name);
        Storage.saveEducation(education);
        return education;
    }

    public static void tilføjArrangement(Tutor tutor, Arrangement arrangement){
        ArrayList<Tutor> tutors = new ArrayList<>(List.copyOf(Storage.getTutors()));
        for (Tutor t : tutors){
            if (t.getArrangements().size() == 0){
                t.addArrangement(arrangement);
        } else throw new RuntimeException("Tutoren er allerede knyttet til et arrangement");
        }
    }

    public static ArrayList<Team> holdUdenTutorer(ArrayList<Team> teams){
        ArrayList<Team> list = new ArrayList<>();
        for (Team t : teams) {
            if (t.getTutors() == null){
                list.add(t);
            }
        }
        return list;
    }



    public static void initStorage(){
        Education e1 = createEducation("DMU");
        Education e2 = createEducation("FINØ");

        Team team1 = createTeam("1dme17s","Margrethe Dybdahl", e1);
        Team team2 = createTeam("1dmE17T","Kristian Dorland",e1);
        Team team3 = createTeam("1dmE17U","Kell Orhøj",e1);
        Team team4 = createTeam("1fiE17B","Karen Jensen",e2);

        Tutor t1 = createTutor("Anders Hansen", "aaa@students.eaaa.dk");
        Tutor t2 = createTutor("Peter Jensen","ppp@students.eaaa.dk");
        Tutor t3 = createTutor("Niels Madsen", "nnn@students.eaaa.dk");
        Tutor t4 = createTutor("Lone Andersen", "lll@students.eaaa.dk");
        Tutor t5 = createTutor("Mads Miller", "mmm@students.eaaa.dk");

        Arrangement a1 = createArrangement("Rusfest",LocalDate.of(2017,8,31),
                LocalTime.of(18,0,0),
                LocalTime.of(23,30,0),
                250);

        Arrangement a2 = createArrangement("Fodbold", LocalDate.of(2017,8,30),
                LocalTime.of(14,0,0),
                LocalTime.of(17,0,0),
                100);

        Arrangement a3 = createArrangement("Brætspil", LocalDate.of(2017,8,29),
                LocalTime.of(12,0,0),
                LocalTime.of(16,30,0),
                25);

        Arrangement a4 = createArrangement("Mindeparken",LocalDate.of(2017,8,30),
                LocalTime.of(18,0,0),
                LocalTime.of(22,0,0),
                25);

        //Tutors til rusfest
        tilføjArrangement(t1,a1);
        tilføjArrangement(t2,a1);
        tilføjArrangement(t5,a1);

        //Tutors til fodbold
        tilføjArrangement(t3,a2);

        //Tutors til brætspil
        tilføjArrangement(t4,a3);
        tilføjArrangement(t3,a3);

        //Tutors til mindeparken
        tilføjArrangement(t1,a4);
        tilføjArrangement(t5,a4);



    }
}
