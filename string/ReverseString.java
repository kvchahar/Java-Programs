package string;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
       String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        str = sc.nextLine();
        String[] token = str.split("");

        System.out.println(token.length);
    }
}