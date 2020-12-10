package genericspractice.sum;

import java.util.Scanner;

class Sum<T extends Number> {

    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    T[] values = new T[]{
        12, 23, 45, 56, 67};

    public T sum() {
        double sum = 0.0;
        for (int i = 0; i < number; i++) {
            sum = sum + values[i];
        }
        return sum;
    }
}


public class SumByGenerics {
    public static <T extends Number> void main(String[] args) {
        Sum<T> sumOfNumbers = new Sum<T>();
        System.out.println(sumOfNumbers.sum());
    }
}
