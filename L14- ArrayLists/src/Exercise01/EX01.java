package Exercise01;

import java.util.ArrayList;
import java.util.List;

public class EX01 {
    public static void main(String[] args) {
        //1
        ArrayList<String> names = new ArrayList<String>();
        //2
        names.addAll(List.of("Hans", "Viggo", "Jens", "Bente", "Bent"));
        //3
        System.out.println(names.size());
        //4
        names.add(1,"Jane");
        //5
        System.out.println(names);
        //6
        names.remove(1);
        //7
        names.add(0, "Pia");
        //8
        names.add(names.size()-1, "Ib");
        //9
        System.out.println(names.size());
        //10
        names.set(2, "Hansi");
        //11
        System.out.println(names.size());
        //12
        System.out.println(names);
        //13
        for (int i = 0; i < names.size(); i++){
            String navn = names.get(i);
            System.out.println(navn.length());
        }
        System.out.println();
        //14
        for (String name : names){
            System.out.println(name.length());
        }

    }
}
