package Opgave1;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

    }


    public static double totalWeeklySalary(ArrayList<Mechanic>list){
        int sum = 0;
        for(Mechanic M : list){
            sum += M.weeklySalary();
        }
        return sum;
    }

    ArrayList<Mechanic> mechanics = new ArrayList<>();
    Mechanic m1 = new Mechanic("Martin", "Vinkelvej 69", 2018, 250);
    Foreman f1 = new Foreman("Hans", "Vinkelvej 69", 2012, 290, 2020, 500);

    mechanics.add(m1);
}
