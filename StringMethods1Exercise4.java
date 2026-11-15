
import java.util.Scanner;

public class StringMethods1Exercise4 {

    static String convertString(String str) {
        int mid = str.length() / 2;

        String firstHalf = str.substring(0, mid).toUpperCase();
        String secondHalf = str.substring(mid).toLowerCase();

        return firstHalf + secondHalf;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Result: " + convertString(str));

        sc.close();
    }
}
