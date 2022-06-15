package semesterprøve2021.model;

import java.util.ArrayList;

public class Studerende {

    private String navn;
    private String email;


    private final ArrayList<Deltagelse> deltagelser = new ArrayList<>();

    // -----------------------------------------------------


    public Studerende(String navn, String email) {
        this.navn = navn;
        this.email = email;
    }

    public String getNavn() {
        return navn;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Deltagelse> getDeltagelser() {
        return new ArrayList<>(deltagelser);
    }

    // -----------------------------------------------------

    public int antalFraværsLektioner() {
        int lektioner = 0;
        for (Deltagelse d : deltagelser) {
            if (d.getStatus() != DeltagerStatus.TILSTEDE) {
                lektioner++;
            }
        }
        return lektioner;
    }

}
