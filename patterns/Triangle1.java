package patterns;

import java.util.Scanner;

public class Triangle1 {
    public static void main(String[] args) {
        int rows;
        int t;
        System.out.println("enter number of rows");
        Scanner sc = new Scanner(System.in);
        rows = sc.nextInt();
        t=rows;
        for (int i = rows; i >=1; i--) {
            for (int j = rows; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k<=t; k++) {
                System.out.print(i);
            }
            t -= 2;
            System.out.println();
        }

    }
}
