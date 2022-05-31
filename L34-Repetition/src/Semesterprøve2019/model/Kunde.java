package Semesterprøve2019.model;

import java.util.ArrayList;

public class Kunde {
    private String navn;
    private String mobil;

    private final ArrayList<Bestilling> bestillinger = new ArrayList<>();
}
