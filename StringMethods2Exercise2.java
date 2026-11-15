
import java.util.Scanner;

public class StringMethods2Exercise2 {
    static void printCharacters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        printCharacters(str);

        sc.close();
    }
}
