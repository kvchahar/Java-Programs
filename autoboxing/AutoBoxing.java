package autoboxing;

/* Autoboxing: Converting a primitive value into an object of the corresponding wrapper class is called autoboxing. For example,
converting int to Integer class. The Java compiler applies autoboxing when a primitive value is:
Passed as a parameter to a method that expects an object of the corresponding wrapper class.
Assigned to a variable of the corresponding wrapper class.

Unboxing: Converting an object of a wrapper type to its corresponding primitive value is called unboxing.
For example conversion of Integer to int. The Java compiler applies unboxing when an object of a wrapper class is:
Passed as a parameter to a method that expects a value of the corresponding primitive type.
Assigned to a variable of the corresponding primitive type
*/

public class AutoBoxing {
    public static void main(String[] args) {


        // primitive type variable with a primitive type value
        int number = 45;

        // reference type variable with a reference type value
        Integer number1 = new Integer(45);
        // Deprecated: Obsolete
        // This constructor is a better way of holding it.
        number1 = 45; // auto-boxing

        number = number1;// auto unboxing
        System.out.println(number);

    }
}