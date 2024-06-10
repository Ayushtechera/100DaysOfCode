import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {

    // Just Over veiwing collecyion framework,gonna do it in when study particular sata structure.
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        list2.add(35);
        list2.add(24);
        list2.add(27);
        list2.add(35);

        System.out.println(list2);

        List<Integer> vector = new Vector<>();

        vector.add(35);
        vector.add(37);
        vector.add(38);
        vector.add(32);

        System.out.println(vector);
    }
}
