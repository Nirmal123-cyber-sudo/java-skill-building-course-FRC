
public class ArraysExercise5 {
    static int findMaximum(int[] numbers, int index1, int index2) {
        return Math.max(numbers[index1], numbers[index2]);
    }

    public static void main(String[] args) {
        int[] numbers = {10, 45, 20, 80, 35};

        int result = findMaximum(numbers, 1, 3);

        System.out.println("First element: " + numbers[1]);
        System.out.println("Second element: " + numbers[3]);
        System.out.println("Maximum: " + result);
    }
}
