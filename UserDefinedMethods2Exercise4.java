
import java.util.Scanner;

public class UserDefinedMethods2Exercise4 {

    static int countDigits(int nm) {
        int count = 0;

        if (nm == 0) {
            return 1;
        }

        nm = Math.abs(nm);

        while (nm > 0) {
            count++;
            nm = nm / 10;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int result = countDigits(number);

        System.out.println("Total digits: " + result);

        sc.close();
    }
}
