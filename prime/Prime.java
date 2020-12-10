package prime;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int number;
        boolean isPrime = true;
        System.out.println("enter a number");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime=false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(number + " is prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }
}