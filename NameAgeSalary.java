package practice;

import java.util.Scanner;

public class NameAgeSalary {

    public static void main(String[] args) {

        System.out.println("Hello. What is your name? : ");
        Scanner scannerObject = new Scanner(System.in);
        String name = scannerObject.nextLine();
        System.out.println(name);
        System.out.println("Hi," + name + "!" + "How old are you?");
        String newWord2 = scannerObject.nextLine();
        System.out.println(newWord2);
        System.out.println("Great, now your favorite number : ");
        int number1 = scannerObject.nextInt();
        System.out.println(number1);
        System.out.println("And, your second favorite number : ");
        int number2 = scannerObject.nextInt();
        System.out.println(number2);

        scannerObject.close();

    }


}
