package Opgave1;

public class Customer implements Comparable<Customer>{

    public String firstName;
    public String lastName;

    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Customer o) {
        int compare = this.lastName.compareTo(o.lastName);
        if (compare != 0) {
            return compare;
        }else
            return this.firstName.compareTo(o.firstName);
        }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
