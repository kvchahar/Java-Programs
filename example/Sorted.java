package example;

import java.util.Scanner;

class Sorted {
    public static void main(String[] args) {
        System.out.println("Enter how many numbers you want to sort");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i <n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("sorted numbers\n");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i] + " ");
        }
    }
}