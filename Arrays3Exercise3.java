
public class Arrays3Exercise3 {
    static void printSquareAndCube(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int square = numbers[i] * numbers[i];
            int cube = numbers[i] * numbers[i] * numbers[i];

            System.out.println("Number: " + numbers[i]);
            System.out.println("Square: " + square);
            System.out.println("Cube: " + cube);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5};

        printSquareAndCube(numbers);
    }
}
