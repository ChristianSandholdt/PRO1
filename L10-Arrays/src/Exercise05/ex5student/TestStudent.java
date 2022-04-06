package Exercise05.ex5student;

import java.util.Arrays;

public class TestStudent {

    public static void main(String[] args) {
        Student s1 = new Student("Hanne");
        Student s2 = new Student("Margrethe");

        System.out.println(s1.getName());
        System.out.println(s2.getName());


        s1.addGrade(2);
        s1.addGrade(7);
        s1.addGrade(10);
        s1.addGrade(7);
        s1.addGrade(12);
        s1.addGrade(12);
        s1.addGrade(4);
        s1.addGrade(4);
        s1.addGrade(12);
        s1.addGrade(2);
        System.out.println(s1.gradeAverage());
        System.out.println(s1.maxGrade());
        System.out.println(s1.minGrade());
        System.out.println(Arrays.toString(s1.getActualGrades()));


    }
}
