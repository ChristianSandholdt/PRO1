package semesterprøve2021.model;

public class Deltagelse {

    private boolean registreret;

    private final DeltagerStatus status;
    Lektion lektion; // Package visible
    Studerende studerende; // Package visible

    // -----------------------------------------------------


    public Deltagelse(boolean registreret, DeltagerStatus status, Studerende studerende) {
        this.registreret = false;
        this.status = DeltagerStatus.TILSTEDE;
        this.studerende = studerende;
    }

    public DeltagerStatus getStatus() {
        return status;
    }

    public Lektion getLektion() {
        return lektion;
    }

    public Studerende getStuderende() {
        return studerende;
    }

    // -----------------------------------------------------

    public boolean erRegistreretFraværende() {
        boolean fraværende = false;
        for (Deltagelse d : studerende.getDeltagelser()){
            if (d.registreret && d.status != DeltagerStatus.TILSTEDE) {
                fraværende = true;
            }
        }
        return fraværende;
    }

    @Override
    public String toString() {
        return studerende.getNavn() + " " + status + " " + registreret;
    }
}

