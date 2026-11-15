
public class Arrays3Exercise5 {

    static void findSmallestAndLargest(int[] numbers) {
        int smallest = numbers[0];
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            smallest = Math.min(smallest, numbers[i]);
            largest = Math.max(largest, numbers[i]);
        }

        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }

    public static void main(String[] args) {
        int[] numbers = {45, 12, 78, 5, 34, 90, 23};

        findSmallestAndLargest(numbers);
    }
}
