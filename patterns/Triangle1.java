package patterns;

import java.util.Scanner;

public class Triangle1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
        byte number = scanner.nextByte();
        for (int rows = 0; rows < number; rows++) {
            System.out.print(" ");
            for (int columns = 0; columns <= rows; columns++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
