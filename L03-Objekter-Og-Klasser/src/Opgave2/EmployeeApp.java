package Opgave2;

public class EmployeeApp {

    public static void main(String[] args) {
        Employee e1 = new Employee("Hans", "Sandholdt", 45);
       /*  System.out.println("Name: " + e1.getName());
        System.out.println("Age:  " + e1.getAge());
        e1.birthday();
        System.out.println("Trainee? " + e1.isTrainee());
        System.out.println();
        System.out.println("Age:" + e1.getAge()); */

        e1.setTrainee(true);
        e1.printEmployee();
        System.out.println();
    }
}
