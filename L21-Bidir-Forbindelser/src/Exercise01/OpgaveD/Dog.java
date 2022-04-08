package Exercise01.OpgaveD;

public class Dog {
    private int number;
    private String name;
    Person person; // nullable


    public Dog(int number, String name){
        this.number = number;
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getNumber(){
        return number;
    }


    @Override
    public String toString() {
        return name + " Som er: " + number + " år gammel";
    }
    public Person getPerson(){
        return person;
    }



    public void setDog(Person person){
        this.person = person;
        person.dogs.add(this);
    }
    public void removeDog(Person person){
        this.person = null;
        person.dogs.remove(this);
    }


}
