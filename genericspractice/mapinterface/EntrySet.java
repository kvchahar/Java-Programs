package genericspractice.mapinterface;

import java.util.*;

public class EntrySet {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Krishnaveer");
        hm.put(2, "Chahar");
        hm.put(3, "Avtar");
        hm.put(4, "Chahar");

        Set set = hm.entrySet();

        Iterator i = set.iterator();

        while (i.hasNext()) {
            Map.Entry mp = (Map.Entry) i.next();
            System.out.println(mp.getKey() + ": " + mp.getValue());
        }
    }
}
