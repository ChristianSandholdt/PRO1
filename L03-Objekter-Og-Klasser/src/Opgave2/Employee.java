package Opgave2;

public class Employee {
    // The name of the employee.
    private final String firstname;
    private final String surname;
    // Whether the employee is a trainee or not.
    private boolean trainee;

    private int age;

    /**
     * Create an employee as a trainee with the given name.
     */
    public Employee(String firstname, String surname, int age) {
        this.firstname = firstname;
        this.surname = surname;
        this.age = age;
        this.trainee = true;
    }

    /**
     * Return the name of the employee.
     */
    public String getName() {
        return firstname + surname;
    }

    /**
     * Return the trainee state of the employee.
     */
    public boolean isTrainee() {
        return trainee;
    }

    /**
     * Set the trainee state of the employee.
     */
    public void setTrainee(boolean trainee) {
        this.trainee = trainee;
    }

    /**
     * Return a description of the employee (for test purposes).
     */
    @Override
    public String toString() {
        return firstname + surname + " (trainee: " + trainee + ")";
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge(){
        return this.age;

    }
    public void birthday(){
        this.age = age +1;
    }



    /**
     * Print a description of the employee.
     */
    public void printEmployee() {
        System.out.println("*******************");
        System.out.println("Firstname: " + firstname);
        System.out.println("Surname: " + surname);
        System.out.println("Age:" + age);
        System.out.println("Trainee: " + trainee);
        System.out.println("*******************");
    }
}
