package Exercise02;

public class ChildApp {
    public static void main(String[] args) {
        Child Martin = new Child(10, true);
        Child Anne = new Child(15, false);



        Martin.printChild();
        System.out.println();
        Anne.printChild();
        System.out.println();
        System.out.println("Martins køn: " + Martin.gender());


    }
}
