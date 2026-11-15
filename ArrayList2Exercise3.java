
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2Exercise3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();

        names.add("Rahul");
        names.add("Aman");
        names.add("Rohan");
        names.add("Karan");
        names.add("Arjun");

        System.out.println("Original list: " + names);

        System.out.print("Enter name to search: ");
        String searchName = sc.nextLine();

        int index = names.indexOf(searchName);

        if (index != -1) {
            System.out.print("Enter replacement name: ");
            String newName = sc.nextLine();

            names.set(index, newName);

            System.out.println("Updated list: " + names);
        } else {
            System.out.println("Name not found");
        }

        sc.close();
    }
}
