package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class HashSetDemo1 {
    public static void main(String[] args) {
        // Wrapper Types (Wrapper Classes for all 8 primitive types)
        // Pre-Defined Class: String, BigInteger, BigDecimal etc...
        // Custom-Defined Class: Student, Car, Book, etc..
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(14);
        numbers.add(23);
        numbers.add(34);
        numbers.add(45);
        numbers.add(67);
        numbers.add(98);
        numbers.add(11);
        System.out.println(numbers);
        Collections.sort(numbers, (o1, o2) -> -Integer.compare(o1, o2));
        System.out.println(numbers);
    }
}
