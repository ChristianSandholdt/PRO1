package Opgave3;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();

        Mechanic m1 = new Mechanic("Martin", "Vinkelvej 69", 2018, 250); // 9250kr i ugen
        Foreman f1 = new Foreman("Hans", "Vinkelvej 69", 2012, 290, 2020, 500); // 11.230 kr i ugen
        Survoyer s1 = new Survoyer("Nehtin", "Vinkelvej 69", 1978, 400, 10); // 15090kr i ugen
        WorkingBoy w1 = new WorkingBoy("Jay-Z", "Park avenue", 100);
        list.add(f1);
        list.add(m1);
        list.add(s1);
        list.add(w1);

        for (Employee m : list){
            System.out.println("Weekly salary for " + m.getName() + ": " + m.weeklySalary() + "kr");
        }

        System.out.println(totalWeeklySalary(list));

    }


    public static double totalWeeklySalary(ArrayList<Employee>list){
        int sum = 0;
        for(Employee M : list){
            sum += M.weeklySalary();
        }
        return sum;
    }


}
