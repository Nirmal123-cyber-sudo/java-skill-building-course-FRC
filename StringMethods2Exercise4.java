
import java.util.Scanner;

public class StringMethods2Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String savedUsername = "Student123";
        String savedPassword = "AbCdef";

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (username.equalsIgnoreCase(savedUsername) && password.equals(savedPassword)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Username or Password");
        }

        sc.close();
    }
}

