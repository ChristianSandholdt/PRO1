package Exercise02;

public class Child {
    private int age;
    private boolean male;

    public Child(int age, boolean male) {
        this.age = age;
        this.male = male;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge(int age) {
        return this.age;
    }

    public boolean isMale() {
        return male;
    }

    public String institution() {
        if (age == 0) {
            return "Home";
        } else if (age == 1 || age == 2) {
            return "Nursery";
        } else if (age > 2 && age <= 5) {
            return "Kindergarten";
        } else if (age >= 6 && age <= 16)
            return "School";
        else
            return "Out of School";
    }

    public String gender() {
        if (!male) {
            return "Girl";
        } else
        return "Boy";
    }

    public String team() {
        if (male && age < 8) {
            return "Young Boys";
        } else if (male) {
            return "Cool boys";
        }
        if (!male && age < 8) {
            return "Tumbling Girls";
        } else {
            return "Springy Girls";
        }


    }



        public void printChild() {
            System.out.println("Age of child: " + age);
            System.out.println("Gender of child? " + gender());
            System.out.println("Institution? " + institution());
            System.out.println("Team: " + team());

        }}