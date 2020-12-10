package trywithresources;

public class Example {
    public static void main(String[] args) {
        int number = 4;
        int divisor = 2;
        try {
            System.out.println(number / divisor);
        } catch (ArithmeticException exception) {
            System.err.println(exception.getMessage());
            divisor = 1; // finally block always be executed
        } finally {
            System.out.println(number / divisor);
        }
    }
}
