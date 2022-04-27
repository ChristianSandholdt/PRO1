package Exercise01.OpgaveD;

public class DogTester {
    public static void main(String[] args) {

        Dog Molly = new Dog(11,"Molly");
        Person Christian = new Person("240700", "41667706","Christian");

        Molly.setDog(Christian);
        System.out.println(Molly.getPerson());

        Molly.removeDog(Christian);
        System.out.println(Molly.getPerson());

    }

}
