package semesterprøve2021.storage;

import semesterprøve2021.model.Fag;
import semesterprøve2021.model.Studerende;

import java.util.ArrayList;

public class Storage {
    private static final ArrayList<Fag> fags = new ArrayList<>();
    private static final ArrayList<Studerende> studerendes = new ArrayList<>();

    // -----------------------------------------------------

    public static ArrayList<Fag> getFag() {
        return new ArrayList<>(fags);
    }

    public static ArrayList<Studerende> getStuderende() {
        return new ArrayList<>(studerendes);
    }

    public static void storeFag(Fag fag) {
        fags.add(fag);
    }

    public static void storeStuderende(Studerende studerende){
        studerendes.add(studerende);
    }
}
