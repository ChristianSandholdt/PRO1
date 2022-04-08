package Exercise03;

import java.util.ArrayList;

public class Person {
    private String name;
    private int age;
    final ArrayList<Gift> giftReceived = new ArrayList<>();

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
    public void addGift(Gift gift){
        giftReceived.add(gift);
    }
    public double valueOfGifts(){
        double sum = 0;
        for (Gift g : giftReceived) {
            sum += g.getPrice();
        }
        return sum;
    }
    public ArrayList<Person> giftsReceivedFrom(){
        ArrayList<Person> givers = new ArrayList<>();
        for (Gift g : giftReceived) {
            givers.add(g.getGiver());
        }
        return givers;
    }
    public void addGiftReceived (Gift gift){
        giftReceived.add(gift);
    }
}
