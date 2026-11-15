
import java.util.Scanner;

public class MathMethodsExercise1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int maximum = Math.max(a, Math.max(b, c));
        int minimum = Math.min(a, Math.min(b, c));

        System.out.println("Maximum number: " + maximum);
        System.out.println("Minimum number: " + minimum);

        sc.close();
    }
}

