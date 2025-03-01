package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new LinkedList();

        // list1.add(34);
        // list1.add(45);
        // list1.add(39);
        // list1.add(78);

        // System.out.println(list1);


        List<Integer> vector = new Vector<>();
        vector.add(34);
        vector.add(45);
        vector.add(39);
        vector.add(78);
        System.out.println(vector);
    }
}
