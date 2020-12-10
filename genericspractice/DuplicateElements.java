package genericspractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Krishnaveer");
        names.add("Chahar");
        names.add("Avtar");
        names.add("Chahar");
        names.add("Rashmi");

        Set<String> s = new HashSet<>();

        for (String name : names) {
            if (s.add(name) == false) {
                System.out.println(name);
            }
        }
    }
}
