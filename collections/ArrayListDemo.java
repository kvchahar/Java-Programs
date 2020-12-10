package collections;

import java.util.ArrayList;

// a group of Interfaces/ Abstract classes/classes that
// are used for grouping of data items in a single entity.

public class ArrayListDemo {
    public static void main(String[] args) {
        // The list<E> Interface <-- The ArrayList<E> class.
        // The ArrayList<E> Class behaves like an array at first.
        // But, it overcomes the disadvantage of an array.
        // An array is static! i.e. once the size of an array is defined,
        // it cannot change, it cannot grow, or shrink!
        // But, an ArrayList can grow or shrink as needed.

        // an aarrayList of integers
        ArrayList<Double> list = new ArrayList<>();
        list.add(1.0);
        list.add(1.1);
        list.add(1.2);
        System.out.println(list);
        list.remove(1.1);
        System.out.println(list);

        ArrayList<Friend> friends = new ArrayList<>();
        Friend friend = new Friend("Friend1", 1234556789L);
        friends.add(friend);
        System.out.println(friends);
    }
}

class Friend {
    private String name;
    private long contactNumber;

    public Friend(String name, long contactNumber) {
        this.name = name;
        this.contactNumber = contactNumber;
    }
}
