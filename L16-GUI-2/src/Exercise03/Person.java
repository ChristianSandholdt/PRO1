package Exercise03;

public class Person {
    private String name;
    private String title;
    private boolean senior;

    public Person(String name, String title, boolean senior) {
        this.name = name;
        this.title = title;
        this.senior = senior;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        String s = title + " " + name;
        if (senior){
            s = s + " (Senior) ";
        } return s;

    }
}
