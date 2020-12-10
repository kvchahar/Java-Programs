package genericspractice;

import java.util.Collections;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(1);
        v.add(34);
        v.add(21);
        v.addAll(1, Collections.singleton(43));
        System.out.println(v);
    }
}
