package Opgaver2;

public class Customer implements Comparable<Customer>{
    private String firstName;
    private String lastName;
    private int age;

    public Customer(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    private String getFirstName(){
        return firstName;
    }
    private String getLastName(){
        return lastName;
    }
    private int getAge(){
        return age;
    }

    @Override
    public int compareTo(Customer o) {
        if (lastName.compareTo(o.lastName) == 0){
            if (firstName.compareTo(o.firstName) == 0){
                return Integer.compare(age, o.age);
            }
            return this.firstName.compareTo(o.firstName);
        }
        return this.lastName.compareTo(o.lastName);
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + " Age: " + age;
    }
}
