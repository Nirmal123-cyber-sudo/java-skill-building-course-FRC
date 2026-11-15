
public class Arrays3Exercise4 {

    static void findAbsoluteValues(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(Math.abs(numbers[i]));
        }
    }

    public static void main(String[] args) {
        int[] numbers = {-10, 20, -30, 40, -50};

        findAbsoluteValues(numbers);
    }
}
