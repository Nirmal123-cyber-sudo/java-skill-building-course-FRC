
import java.util.Scanner;

public class StringMethods1Exercise1 {

    static int findIndex(String str, char ch) {
        return str.indexOf(ch);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        int result = findIndex(str, ch);

        System.out.println("Index: " + result);

        sc.close();
    }
}

