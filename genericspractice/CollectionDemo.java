package genericspractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {


        Collection values = new ArrayList(); // we can also use Collection with what type of values we can be added.
        values.add(3);                       // Collection<Integer> values = new ArrayList<Integer>
        values.add("Krishnaveer");
        values.add(6.7f);
        values.remove(3);

        /*
        Iterator i = values.iterator();


        System.out.println(i.next());
        System.out.println(i.next());
        System.out.println(i.next());
         */

        /*
        while(i.hasNext()){
            System.out.println(i.next());
        }
        */
        for(Object allValues : values){  // while using Integer type values, we can use Integer or int instead of Object.
            System.out.println(allValues);
        }
    }
}