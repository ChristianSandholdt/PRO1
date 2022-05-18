package Exercise123;

public class Customer implements Comparable<Customer> {
    private int age;
    private String name;

    public Customer(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Customer o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return name;
    }
}
