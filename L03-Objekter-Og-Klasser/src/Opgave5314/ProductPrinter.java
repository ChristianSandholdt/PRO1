package Opgave5314;

public class ProductPrinter {
    public static void main(String[] args) {
        Product TV = new Product("Fjernsyn",79.99);
        Product Sofa = new Product("Oslo Sofa",349.49);


        System.out.println("Name of TV is: " + TV.getName());
        System.out.println("Name of Sofa is: " + Sofa.getName());
        System.out.println("Price of TV is: " + TV.getPrice());
        System.out.println("Price of Sofa is: " + Sofa.getPrice());

        TV.reducePrice(5);
        Sofa.reducePrice(5);
        System.out.println();
        System.out.println("Price of TV is now: " + TV.getPrice());
        System.out.println("Price of Sofa is now: " + Sofa.getPrice());
        System.out.println();


    }
}
