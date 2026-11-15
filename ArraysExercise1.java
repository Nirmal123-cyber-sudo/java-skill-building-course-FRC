
public class ArraysExercise1 {
    public static void main(String[] args) {
        String[] names = {"Aman", "Rohan", "Karan"};

        names[1] = "Nirmal";

        System.out.println("Updated Array:");

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
