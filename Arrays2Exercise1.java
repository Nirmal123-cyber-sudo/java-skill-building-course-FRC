
public class Arrays2Exercise1 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        int i = 0;

        while (i < numbers.length) {
            numbers[i] = numbers[i] * 2;
            i++;
        }

        System.out.println("Updated Array:");

        i = 0;

        while (i < numbers.length) {
            System.out.println(numbers[i]);
            i++;
        }
    }
}
