package Exercise5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class exc5 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(List.of("a","b","c","d","d","c","b","a"));
// Add some strings to list here
        System.out.println(list); // print the list before sorting
        Collections.sort(list);
        System.out.println(list); // print the list after sorting
        System.out.println();

        //Ex5
        // Finder spilleren med den laveste alder og sætter ham på indeks 1.
        Customer c1 = new Customer("Virgil", 25);
        Customer c2 = new Customer("Mohamed",18);
        Customer c3 = new Customer("Kelleher",22);
        Customer c4 = new Customer("Curtis",21);
        ArrayList<Customer> cList = new ArrayList<>(List.of(c1,c2,c3,c4));

        System.out.println(cList);
        Collections.sort(cList);
        System.out.println(cList);


    }
}

