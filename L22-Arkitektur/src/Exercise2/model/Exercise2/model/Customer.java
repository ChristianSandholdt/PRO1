package Exercise2.model.Exercise2.model;

public class Customer {
    private String name;

    public Customer(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "" + name;
    }
}
