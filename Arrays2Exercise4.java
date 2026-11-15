
public class Arrays2Exercise4 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60};

        for (int i = 0; i < numbers.length / 2; i++) {
            int sum = numbers[i] + numbers[numbers.length - 1 - i];

            System.out.println(numbers[i] + " + " + numbers[numbers.length - 1 - i] + " = " + sum);
        }
    }
}
