package collections;

import java.util.ArrayList;
import java.util.HashSet;

class HashSetDemo {
    public static void main(String[] args) {
        // An ArrayList of names (String)
        ArrayList<String> namesList = new ArrayList<>();
        System.out.println("ArrayList has " + namesList.size() + " size.");
        namesList.add("Krishnaveer");
        namesList.add("Krishnaveer");
        namesList.add("Chahar");
        namesList.add("Avtar");
        namesList.add("Arvind");
        System.out.println("ArrayList has " + namesList.size() + " size.");
        System.out.println(namesList);

        // A HashSet of names (String)
        HashSet<String> nameSet = new HashSet<>();
        System.out.println("HashSet has " + nameSet.size() + " size");
        nameSet.add("Krishnaveer");
        nameSet.add("Krishnaveer");
        nameSet.add("Chahar");
        nameSet.add("Avtar");
        nameSet.add("Arvind");
        System.out.println("HashSet has " + nameSet.size() + " size.");
        System.out.println(nameSet);
        // HashSet is also a dynamic data structure or collection bcoz size of the HashSet is not static
        // it can grow, increase or shrink,decrease.
    }
}
