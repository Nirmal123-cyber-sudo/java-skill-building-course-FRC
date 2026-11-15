
import java.util.Scanner;

public class MathMethodsExercise2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Area of Circle");
        System.out.println("2. Area of Square");
        System.out.println("3. Area of Rectangle");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter radius: ");
                double radius = sc.nextDouble();

                double circleArea = Math.PI * Math.pow(radius, 2);
                System.out.println("Area of Circle: " + circleArea);
                break;

            case 2:
                System.out.print("Enter side: ");
                double side = sc.nextDouble();

                double squareArea = Math.pow(side, 2);
                System.out.println("Area of Square: " + squareArea);
                break;

            case 3:
                System.out.print("Enter length: ");
                double length = sc.nextDouble();

                System.out.print("Enter breadth: ");
                double breadth = sc.nextDouble();

                double rectangleArea = length * breadth;
                System.out.println("Area of Rectangle: " + rectangleArea);
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
