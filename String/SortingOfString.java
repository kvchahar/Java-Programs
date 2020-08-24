package String;

import java.util.Scanner;

public class SortingOfString {
    public static void main(String[] args) {
        String temp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers of strings you want to sort");
        int number = scanner.nextInt();
        String words[] = new String[number];
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter " + number + " Strings");
        for (int i = 0; i < number; i++) {
            words[i] = scanner2.nextLine();
        }
        scanner.close();
        scanner2.close();

        for (int i = 0; i < number; i++) {
            for (int j = i + 1; j < number; j++) {
                if (words[i].compareTo(words[j]) > 0) {
                    temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        for (int i = 0; i < number; i++) {
            System.out.println("sorted string : " + words[i]);
        }
    }
}
