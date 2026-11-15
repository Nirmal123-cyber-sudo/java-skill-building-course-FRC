
public class ArraysExercise4 {
    public static void main(String[] args) {
        String[] names = {"Hello", "Java", "World"};

        String result = names[0].concat(names[names.length - 1]);

        System.out.println("First element: " + names[0]);
        System.out.println("Last element: " + names[names.length - 1]);
        System.out.println("Concatenated String: " + result);
    }
}

