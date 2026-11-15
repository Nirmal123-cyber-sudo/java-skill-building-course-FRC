
import java.util.Random;

public class Arrays2Exercise5 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numbers = new int[5];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1;
            sum = sum + numbers[i];
        }

        System.out.println("Random numbers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("Sum: " + sum);
    }
}

