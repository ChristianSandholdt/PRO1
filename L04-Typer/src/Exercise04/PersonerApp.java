package Exercise04;

public class PersonerApp {
    public static void main(String[] args) {
        Personer1 Piotr = new Personer1("Piotr","", "Suski");

        Personer Mateusz = new Personer("Mateusz","Pawel", "Dziurdz");

      Mateusz.getName();
      Piotr.getName();
        System.out.println();
        System.out.println(Mateusz.getUsername());
        System.out.println(Piotr.getUsername());


        System.out.println();
        System.out.println(Piotr.getInits());
        System.out.println(Mateusz.getInits());



        }


    }

