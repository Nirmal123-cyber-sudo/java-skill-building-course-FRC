
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList2Exercise1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers.add(sc.nextInt());
        }

        Collections.reverse(numbers);

        System.out.println("Reversed ArrayList: " + numbers);

        sc.close();
    }
}
