package definitions.communication;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortedPrice {
    public static void main(String[] args) {
        Mobile[] mobile3 = new Mobile[10];
        for (int i = 0; i < mobile3.length; i++) {
            mobile3[i] = new Mobile((int) (Math.random() * 1000),
                    "Name" + (i + 1),
                    "ABCD" + (i + 1),
                    (Math.random() * 20_000) + 10_000);
        }
        System.out.println(Arrays.toString(mobile3));
        Arrays.sort(mobile3);
        System.out.println(Arrays.toString(mobile3));
    }
}
