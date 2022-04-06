package Exercise02;

public class Exercise02 {
    public static void main(String[] args) {
        int i1;
        char ch1, ch2;

        ch1 = 'A';
        System.out.println(ch1);
        System.out.println("Expected A");

        ch2 = '3';
        System.out.println(ch2);
        System.out.println("Expected 3");

        i1 = ch1;
        System.out.println(i1);
        System.out.println("Expected 65 da det er unicode for A");

        i1 = 66;
        System.out.println(i1);
        System.out.println("Expected 66");

        ch2 = (char) i1;
        System.out.println(ch2);
        System.out.println("Expected B");

    }
}
