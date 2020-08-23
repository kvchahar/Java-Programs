package practice;

import java.util.Scanner;

public class TheForgetfulMachine {

    public static void main(String[] args){
        System.out.println("Give me a name : ");
        Scanner scannerObject = new Scanner(System.in);
        String newWord1 = scannerObject.nextLine();
        System.out.println(newWord1);
        System.out.println("Give m a second name : ");
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
