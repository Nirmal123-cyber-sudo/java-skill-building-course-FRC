
import java.util.Scanner;

public class Loops1_PracticeExercise1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many even numbers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i * 2);
        }

        sc.close();
    }
}
