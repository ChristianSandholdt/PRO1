package Exercise01;

public class Person {
    private String firstName;
    private String title;
    private boolean senior;

    public Person(String firstName, String title, boolean senior) {
        this.firstName = firstName;
        this.title = title;
        this.senior = senior;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return title;
    }


    @Override
    public String toString() {
        String s = title + " " + firstName;
        if (senior){
            s = s + " (Senior) ";
        } return s;

    }

}
