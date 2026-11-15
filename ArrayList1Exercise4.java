
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList1Exercise4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = sc.nextInt();

            numbers.add(num);
            sum += num;
        }

        Collections.sort(numbers);

        double mean = sum / 10.0;
        double median = (numbers.get(4) + numbers.get(5)) / 2.0;

        int mode = numbers.get(0);
        int maxCount = 0;

        for (int i = 0; i < numbers.size(); i++) {
            int count = 0;

            for (int j = 0; j < numbers.size(); j++) {
                if (numbers.get(i).equals(numbers.get(j))) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mode = numbers.get(i);
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);

        if (maxCount == 1) {
            System.out.println("Mode: No repeated value");
        } else {
            System.out.println("Mode: " + mode);
        }

        sc.close();
    }
}

