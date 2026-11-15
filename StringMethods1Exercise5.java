
import java.util.Scanner;

public class StringMethods1Exercise5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Last index of e: " + str.lastIndexOf('e'));
        System.out.println("Starts with The: " + str.startsWith("The"));
        System.out.println("Ends with end.: " + str.endsWith("end."));

        sc.close();
    }
}
