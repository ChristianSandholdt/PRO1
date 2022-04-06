package Exercise04.swimmer;

import java.util.ArrayList;
import java.util.List;


public class SwimmerApp {

    public static void main(String[] args) {

        TrainingPlan plan1 = new TrainingPlan('A',16,10);
        TrainingPlan plan2 = new TrainingPlan('B',10,6);

        ArrayList<Double> lapTimesJan = new ArrayList<>();
        lapTimesJan.addAll(List.of(1.02, 1.01, 0.99, 0.98, 1.02, 1.04, 0.99));

        plan1.createSwimmer("Jan",lapTimesJan);

        ArrayList<Double> lapTimesBo = new ArrayList<>();
        lapTimesBo.addAll(List.of(1.05, 1.01, 1.04, 1.06, 1.08, 1.04, 1.02));

        plan1.createSwimmer("Bo",lapTimesBo);

        ArrayList<Double> lapTimesMikkel = new ArrayList<>();
        lapTimesMikkel.addAll(List.of(1.03, 1.01, 1.02, 1.05, 1.03, 1.06, 1.03));

        plan2.createSwimmer("Mikkel",lapTimesMikkel);

        ArrayList<Swimmer> swimmers = new ArrayList<>();

        System.out.println("Plan1 svømmere");
        for (Swimmer s : plan1.getSwimmers()) {
            System.out.println(s.getName() + "'s bedste tid: " + s.bestLapTime());
            System.out.println(s.getName() + " Bruger " + plan1.getWeeklyWaterHours() + " timer i vandet, og " + plan1.getWeeklyStrengthHours() + " på styrketræning");
            System.out.println(s.getName() + " Bruger i alt " + (plan1.getWeeklyStrengthHours() + plan1.getWeeklyWaterHours()) + " timerpå at træne");
            System.out.println();
        }
        System.out.println("Plan2 svømmere");
        for (Swimmer s : plan2.getSwimmers()) {
            System.out.println(s.getName() + "'s bedste tid: " + s.bestLapTime());
            System.out.println(s.getName() + " Bruger " + plan2.getWeeklyWaterHours() + " timer i vandet, og " + plan2.getWeeklyStrengthHours() + " på styrketræning");
            System.out.println(s.getName() + " Bruger i alt " + (plan2.getWeeklyStrengthHours() + plan2.getWeeklyWaterHours()) + " timer på at træne");
            System.out.println();
    }
}
}
