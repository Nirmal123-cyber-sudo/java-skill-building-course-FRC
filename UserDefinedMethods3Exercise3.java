
import java.util.Scanner;

public class UserDefinedMethods3Exercise3 {

    int sumOfDigits(int nm) {
        int sum = 0;

        nm = Math.abs(nm);

        while (nm > 0) {
            int digit = nm % 10;
            sum = sum + digit;
            nm = nm / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        UserDefinedMethods3Exercise3 obj =
            new UserDefinedMethods3Exercise3();

        int result = obj.sumOfDigits(number);

        System.out.println("Sum of digits: " + result);

        sc.close();
    }
}
