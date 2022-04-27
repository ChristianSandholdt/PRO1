package Exercise01;

import java.util.ArrayList;

public class Person {
    private String name;
    private String cpr;
    private String phone;
    final ArrayList<Dog> dogs = new ArrayList<>();

    public Person(String cpr, String phone, String name){
        this.cpr = cpr;
        this.phone = phone;
        this.name = name;
    }

    public String getCpr() {
        return cpr;
    }
    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }
    public void setCpr(String cpr) {
        this.cpr = cpr;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return name + ", " +  cpr + ", " + phone;
    }

    public void addDog(Dog dog){
        dogs.add(dog);
        dog.person = this;
    }
    public void removeDog(Dog dog){
        dogs.remove(dog);
        dog.person = null;
    }
}
