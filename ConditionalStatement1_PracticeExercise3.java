
import java.util.Scanner;

public class ConditionalStatement1_PracticeExercise3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        int temperature = sc.nextInt();

        if (temperature < 10) {
            System.out.println("Wear a coat");
        } else if (temperature <= 20) {
            System.out.println("Light jacket recommended");
        } else if (temperature <= 30) {
            System.out.println("T-shirt weather");
        } else {
            System.out.println("Stay indoors!");
        }

        sc.close();
    }
}

