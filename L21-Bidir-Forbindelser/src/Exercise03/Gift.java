package Exercise03;

public class Gift {
    private String description;
    private int price;
    private Person giver; // Can not be null
    private Person receiver;

    public Gift(String description, int price, Person giver){
        this.description = description;
        this.price = price;
        this.giver = giver;
    }
    public String getDescription(){
        return description;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setGiver(Person giver){
        this.giver = giver;
    }
//    public void addReceiver(Person receiver){
//        this.receiver = receiver;
//        receiver.giftReceived.add(this);
//    }

    public Person getGiver() {
        return giver;
    }
}
