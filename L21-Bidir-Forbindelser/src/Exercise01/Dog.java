package Exercise01;

import java.util.ArrayList;

public class Dog {
    private int number;
    private String name;
    Person person;

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

}
