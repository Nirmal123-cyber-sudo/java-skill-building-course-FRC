
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2Exercise2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        System.out.println("Enter 5 numbers for first list:");

        for (int i = 0; i < 5; i++) {
            list1.add(sc.nextInt());
        }

        System.out.println("Enter 5 numbers for second list:");

        for (int i = 0; i < 5; i++) {
            list2.add(sc.nextInt());
        }

        System.out.println("Products of corresponding elements:");

        for (int i = 0; i < 5; i++) {
            int product = list1.get(i) * list2.get(i);
            System.out.println(product);
        }

        sc.close();
    }
}
