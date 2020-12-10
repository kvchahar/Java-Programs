package genericspractice.mapinterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("my name", "krishnaveer");
        map.put("ceo", "Bill Gates");
        map.put("ceo","sundar pichai");
        map.put("name","krishnaveer");

        Set<String> keys = map.keySet();

        for (String key : keys) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
