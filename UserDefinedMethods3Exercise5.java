
import java.util.Scanner;

public class UserDefinedMethods3Exercise5 {

    int power(int a, int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * a;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        int a = sc.nextInt();

        System.out.print("Enter exponent: ");
        int n = sc.nextInt();

        UserDefinedMethods3Exercise5 obj =
            new UserDefinedMethods3Exercise5();

        int answer = obj.power(a, n);

        System.out.println("Result: " + answer);

        sc.close();
    }
}

