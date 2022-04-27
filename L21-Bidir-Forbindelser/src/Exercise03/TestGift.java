package Exercise03;

public class TestGift {
    public static void main(String[] args) {
        Person p1 = new Person("Martin", 25);
        Person p2 = new Person("Nehtin", 42);

        Gift g1 = new Gift("Bog",100,p2);
        Gift g2 = new Gift("Fjernstyret bil", 50, p1);


        System.out.println(p1.getName() + " Fik en " + g1.getDescription() + " af " + g1.getGiver());
        System.out.println(p2.getName() + " Fik en " + g2.getDescription() + " af " + g2.getGiver());

        System.out.println();

        System.out.println(p1.getName() + "'s gave har kostet " + p1.valueOfGifts());
        System.out.println(p2.getName() + "'s gave har kostet " + p2.valueOfGifts());
    }
}
