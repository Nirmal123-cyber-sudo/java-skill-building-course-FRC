
import java.util.Scanner;

public class ConditionalStatements2_PracticeExercise4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first side: ");
        int a = sc.nextInt();

        System.out.print("Enter second side: ");
        int b = sc.nextInt();

        System.out.print("Enter third side: ");
        int c = sc.nextInt();

        if (a > 0 && b > 0 && c > 0 &&
            a + b > c && a + c > b && b + c > a) {

            System.out.println("Valid Triangle");

        } else {
            System.out.println("Invalid Triangle");
        }

        sc.close();
    }
}
