
import java.util.Scanner;

public class UserDefinedMethods3Exercise4 {

    static void printTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        UserDefinedMethods3Exercise4 obj =
            new UserDefinedMethods3Exercise4();

        int choice;

        do {
            System.out.println("\n1. Print Multiplication Table");
            System.out.println("2. Check Prime Number");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    int num1 = sc.nextInt();

                    printTable(num1);
                    break;

                case 2:
                    System.out.print("Enter a number: ");
                    int num2 = sc.nextInt();

                    if (obj.isPrime(num2)) {
                        System.out.println("Prime Number");
                    } else {
                        System.out.println("Not a Prime Number");
                    }
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 3);

        sc.close();
    }
}

