package Opgave1;

import java.util.ArrayList;
import java.util.List;

public class Data {

    public static double average(Measurable[] objects){
        double sum = 0;
        for (Measurable obj : objects){
            sum += obj.getMeasure();
        }
        if (objects.length > 0){
            return sum / objects.length;
        }else
            return 0;
    }


    public static Measurable max(Measurable[] objects){
        Measurable max = objects[0];
        for (Measurable obj : objects){
            if (obj.getMeasure() > max.getMeasure()){
                max = obj;
            }
        }
        return max;
    }

    public static Measurable[] blackFridayMeal(Measurable[] chilies, Measurable[] beers) {
        Measurable[] Strongest = {max(chilies), max(beers)};
        return Strongest;
    }

  public static double average(Measurable[] objects, Filter filter){
      double sum = 0;
      int count = 0;
      for (Measurable e : objects){
          if (filter.accept(e)){
              sum += e.getMeasure();
              count++;
          }
      }
      return sum/count;
  }



    public static void main(String[] args) {
        Chili chilis[] = {new Chili("Habanero", 200000),new Chili("Ghost pepper", 1041427),
                new Chili("Piri Piri", 75000),new Chili("Jalapeno", 5000)};

        Beer beers[] = {new Beer("Tuborg", 4.6), new Beer("Royal Export", 5.8), new Beer("Giraføl", 10)};

        FilterClass f1 = new FilterClass(5000);

        Measurable[] blackFriday = blackFridayMeal(chilis, beers);


        //Chilis
        double averageHeat = average(chilis);
        Measurable max = max(chilis);
        System.out.println("Average heat: " + averageHeat);
        System.out.println("Chili with the highest heat: " + max);
        System.out.println("Average of chilis with over 5000 scoville: " + average(chilis,f1));
        System.out.println();
        //Beers
        double averagePercentage = average(beers);
        Measurable highest = max(beers);
        System.out.println("Average percentage of alcohol: " + averagePercentage);
        System.out.println("Beer with the highest percentage of alcohol: " + highest);
        System.out.println();
        //Black Friday meal
        System.out.println("Strongest Chili: " + blackFriday[0]);
        System.out.println("Strongest beer: " + blackFriday[1]);

    }
}
