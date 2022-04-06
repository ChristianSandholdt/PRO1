package Exercise01.swimmer;

import java.util.ArrayList;

public class Swimmer {
    private String name;
    private ArrayList<Double> lapTimes;
    private TrainingPlan trainingPlan;

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
    /** nullable return value **/
    public TrainingPlan getTrainingPlan() {
        return trainingPlan;
    }
    /** The swimmer is not connected to a swimming plan **/
    public void setTrainingPlan(TrainingPlan trainingPlan){
        this.trainingPlan = trainingPlan;
    }
    /** The swimmer is connected to a trainingPlan**/
    public void removeTrainingPlan(){
        this.trainingPlan = null;
    }

    /** Return the fastest lap time. */
    public double bestLapTime() {
        // kan også være double fastest = lapTime.get(0), så man sammenligner med indekset på
        // plads 0 og sammenligner med resten af arraylisten.
        double bestLapTime = 10;
        for (int i = 0; i < getLapTimes().size(); i++){
            if (getLapTimes().get(i) < bestLapTime){
                bestLapTime = getLapTimes().get(i);
            }
        }
        return bestLapTime;
    }
    /** Returns how many hours the swimmer trains**/
    public int allTrainingHours(){
        int waterHours = getTrainingPlan().getWeeklyWaterHours();
        int strengthHours = getTrainingPlan().getWeeklyStrengthHours();
        return waterHours + strengthHours;
    }
}
