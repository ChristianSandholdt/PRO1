package Exercise03;

public class Exercise03 {
    public static void main(String[] args) {
        String ord1 = "Datamatiker";
        String ord2 = "Uddannelsen";

        System.out.println(ord1.toUpperCase() + " " + ord2.toLowerCase());

        String ord3 = ord1 + ord2.toLowerCase();
        System.out.println(ord3);
        int n = ord3.length();

        System.out.println(ord3.length());

        String ord4 = ord1.substring(0, 7);
        System.out.println(ord4);

        String ord5 = ord2.substring(3, 8);
        System.out.println(ord5);

        String ord6 = ord3.substring(ord3.length()/2);
        System.out.println(ord6);


    }
}
