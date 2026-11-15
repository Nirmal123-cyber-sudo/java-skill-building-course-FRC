
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1Exercise1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            names.add(name);
        }

        System.out.print("Enter index to remove: ");
        int index = sc.nextInt();

        if (index >= 0 && index < names.size()) {
            names.remove(index);
            System.out.println("Final list: " + names);
        } else {
            System.out.println("Invalid index");
        }

        sc.close();
    }
}

