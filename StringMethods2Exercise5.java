
import java.util.Scanner;

public class StringMethods2Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter student name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        for (int i = 0; i < 2; i++) {
            for (int j = i + 1; j < 3; j++) {
                int result = names[i].compareToIgnoreCase(names[j]);

                if (result == 0) {
                    result = names[i].compareTo(names[j]);
                }

                if (result > 0) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        System.out.println("Names in alphabetical order:");

        for (int i = 0; i < 3; i++) {
            System.out.println(names[i]);
        }

        sc.close();
    }
}
