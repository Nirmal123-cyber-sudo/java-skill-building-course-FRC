
import java.util.Scanner;

public class StringMethods2Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter last name: ");
        String lastName = sc.nextLine();

        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println("Full Name: " + fullName);

        System.out.print("Enter a string to replace 'a': ");
        String text = sc.nextLine();

        String replacedText = text.replace('a', 'x');
        System.out.println("Replaced String: " + replacedText);

        System.out.print("Enter a string with extra spaces: ");
        String messyText = sc.nextLine();

        String cleanText = messyText.trim();
        System.out.println("Cleaned String: " + cleanText);

        sc.close();
    }
}
