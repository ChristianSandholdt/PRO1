package Exercise04.swimmer;

import java.util.ArrayList;

public class Swimmer {
    private String name;
    private ArrayList<Double> lapTimes;

    public Swimmer(String name, ArrayList<Double> lapTimes) {
        this.name = name;
        this.lapTimes = lapTimes;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Double> getLapTimes() {
        return lapTimes;
    }

    /** Return the fastest lap time. */
    public double bestLapTime() {
        double bestLapTime = 10;
        for (int i = 0; i < getLapTimes().size(); i++){
            if (getLapTimes().get(i) < bestLapTime){
                bestLapTime = getLapTimes().get(i);
            }
        }
        return bestLapTime;
    }

}

