package Exercise01;

import java.util.ArrayList;

public class DogTester {
    public static void main(String[] args) {
        Dog Molly = new Dog(11,"Molly");
        Dog Chewie = new Dog(5, "Chewie");

        Person Christian = new Person("240700","41667706","Christian");
        Person Gustav = new Person("180899", "89484848", "Gustav");
        Christian.addDog(Molly);
        Gustav.addDog(Chewie);

        System.out.println("Mollys ejer er: " + Molly.getPerson());
        System.out.println("Chewies ejer er: " + Chewie.getPerson());
        System.out.println();

        System.out.println("Christians hund er: " + Christian.dogs);
        System.out.println("Gustavs hund er: " + Gustav.dogs);
        System.out.println();

        //Fjern hund fra Christian og giv den til Gustav vha. add og remove
        Christian.removeDog(Molly);
        Gustav.addDog(Molly);

        System.out.println("-----------------------");
        System.out.println(Christian.dogs);
        System.out.println(Gustav.dogs);
        System.out.println("-----------------------");

    }

}
