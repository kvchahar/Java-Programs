package genericspractice;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {


        List values = new ArrayList();        // we can also use List with what type of values we can be added.
        values.add(34);                       // List<Integer> values = new ArrayList<Integer>();
        values.add(1,23);        // can sort,add values with specified indexing

        Collections.sort(values);

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

        /*
        for(Object allValues : values){  // while using Integer type values, we can use Integer or int instead of Object.
            System.out.println(allValues);
        }
        */
        values.forEach(System.out::println); // Stream API .. Lambda Expression
    }
}