package Opgave4;

import java.util.ArrayList;
import java.util.List;

public class TestApp {
    public static void main(String[] args) {
        ArrayList<Figur> figurer = new ArrayList<>(List.of(
        new Circle(10,10,10),
        new Eclipse(30,30,20,10),
        new Square(70,70,10),
        new Rectangle(100,100,10,20)));

        figurerToString(figurer);
        System.out.println();
        System.out.printf("Total area; %.2f\n", totalArea(figurer));
        parallelShift(figurer,10);
        figurerToString(figurer);
    }



    public static void figurerToString(ArrayList<Figur> figurs){
        for (Figur f : figurs){
            System.out.println(f.toString());
            System.out.printf("   Area: %.2f\n",f.Area());
        }
    }
    public static double totalArea(ArrayList<Figur> figurs){
        double sum = 0;
        for (Figur f : figurs) {
            sum += f.Area();
        }
        return sum;
    }

    public static void parallelShift(ArrayList<Figur> figurs, int amount){
        for(Figur f : figurs){
            f.movexPos(amount);
            f.moveyPos(amount);
        }
    }
}
