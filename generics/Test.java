import java.util.*;

class Test
{
    public static void main(String[] args)
    {
        // Creating a an ArrayList with String specified
        ArrayList <String> al = new ArrayList<String> ();
        ArrayList <Integer> al1 = new ArrayList<Integer>();

        al.add("Sachin");
        al.add("Rahul");
        al1.add(10);

        // Typecasting is not needed
        String s1 = al.get(0);
        String s2 = al.get(1);
        Integer s3 = al1.get(0);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}