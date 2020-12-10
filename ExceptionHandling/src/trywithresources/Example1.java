package trywithresources;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        System.out.println("Please enter your name: ");
        String name = "";
        try (Scanner scanner = new Scanner(System.in)) {
            scanner.close();
            name = scanner.nextLine();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        System.out.println("Hello, " + name + ".");
    }
}
