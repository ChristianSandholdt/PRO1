package Opgave1;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        ArrayList<Mechanic> list = new ArrayList<>();

        Mechanic m1 = new Mechanic("Martin", "Vinkelvej 69", 2018, 250); // 9250kr i ugen
        Foreman f1 = new Foreman("Hans", "Vinkelvej 69", 2012, 290, 2020, 500); // 11.230 kr i ugen
        Survoyer s1 = new Survoyer("Nehtin", "Vinkelvej 69", 1978, 400, 10); // 15090kr i ugen
        list.add(m1);
        list.add(f1);
        list.add(s1);

        for (Mechanic m : list){
            System.out.println("Weekly salary for " + m.getName() + ": " + m.weeklySalary() + "kr");
        }

        System.out.println(totalWeeklySalary(list));

    }


    public static double totalWeeklySalary(ArrayList<Mechanic>list){
        int sum = 0;
        for(Mechanic M : list){
            sum += M.weeklySalary();
        }
        return sum;
    }


}
