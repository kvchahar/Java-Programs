package patterns;

import java.util.Scanner;

public class Triangle2 {
    public static void main(String[] args) {
        int rows,columns;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
        byte number = scanner.nextByte();
        for ( rows = 0; rows < number; rows++) {
            for ( columns = number - rows; columns > 1; columns--) {
                System.out.print(" ");
            }
            for ( columns = 0; columns <= rows; columns++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}