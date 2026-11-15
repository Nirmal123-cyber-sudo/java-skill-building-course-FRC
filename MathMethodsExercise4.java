
import java.util.Scanner;

public class MathMethodsExercise4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        double base = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        double hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));

        System.out.println("Hypotenuse: " + hypotenuse);

        sc.close();
    }
}
