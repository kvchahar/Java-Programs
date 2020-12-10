package genericspractice.comparator;

import java.util.*;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(12);
        values.add(90);
        values.add(44);
        values.add(23);

        Comparator com = new ComImpl();

        Collections.sort(values,com);

        for (int i : values) {
            System.out.println(i);
        }
    }
}
