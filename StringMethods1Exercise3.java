
import java.util.Scanner;

public class StringMethods1Exercise3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter a word to search: ");
        String word = sc.nextLine();

        if (sentence.indexOf(word) != -1) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        sc.close();
    }
}
