
import java.util.Scanner;

public class StringMethods1Exercise2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String name = sc.nextLine();

        System.out.println("Uppercase: " + name.toUpperCase());

        String[] parts = name.trim().split("\\s+");

        System.out.println("First letter of first name: " + parts[0].charAt(0));
        System.out.println("First letter of last name: " + parts[parts.length - 1].charAt(0));

        sc.close();
    }
}
