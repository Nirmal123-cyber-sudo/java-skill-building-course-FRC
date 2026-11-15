
import java.util.Scanner;

public class UserDefinedMethodsExercise1 {

    static int factorial(int number) {
        int fact = 1;

        while (number > 0) {
            fact = fact * number;
            number--;
        }

        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Invalid input");
        } else {
            int result = factorial(number);
            System.out.println("Factorial: " + result);
        }

        sc.close();
    }
}
