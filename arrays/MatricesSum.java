package arrays;

import java.util.Scanner;

public class MatricesSum {
    public static void main(String[] args) {
        int m, n, i, j;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows ");
        m = scanner.nextInt();
        System.out.println("Enter number of columns ");
        n = scanner.nextInt();
        int[][] first = new int[m][n];
        int[][] second = new int[m][n];
        int[][] sum = new int[m][n];
        System.out.println("Enter elements of 1st matrice");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                first[i][j] = scanner.nextInt();
            }
        }
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(first[i][j]+ "\t");
            }
            System.out.println();
        }
        System.out.println("enter elements of 2nd matrices");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                second[i][j] = scanner.nextInt();
            }
        }
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(second[i][j]+ "\t");
            }
            System.out.println();
        }
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                sum[i][j] = first[i][j] + second[i][j];
            }
        }
        System.out.println("resultant matrice");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
