package string;
import java.util.Scanner;
public class Nickname {
    public static void main(String[] args) {
        int count = 1;
        String str;
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        String[] newStr = str.split("");
        for (int i = 0; i < newStr.length; i++) {
            if (newStr[i] == " ") {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
