package ex2ex3student;

import ex2ex3student.Person;

import javax.naming.Name;
import java.time.Year;

public class PersonTester {

    public static void main(String[] args) {
        // Ex. 2
        ex2ex3student.Person p1 = new Person("Ib", 2000, 10, 6);
        p1.printPerson();
        p1.calcAge(2005, 9, 6);
        System.out.println("Personen er: " + p1.calcAge(2025, 10, 7) + " år gammel");

        ex2ex3student.Person p2 = new Person("Martin", 1970, 11, 25);
        p2.printPerson();
        p2.calcAge(2022, 2, 24);
        System.out.println("Personen er: " + p2.calcAge(2022, 2, 24));
        ex2ex3student.Person p3 = new Person("Jonas", 1994, 4, 15);
        System.out.println("Personen er: " + p3.calcAge(2022, 2, 24));


        //Exercise 3
        System.out.println();
        System.out.println(Year.isLeap(1900));


    }
}
