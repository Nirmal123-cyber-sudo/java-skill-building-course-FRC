
import java.util.ArrayList;

public class ArrayList2Exercise5 {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(2);
        list1.add(4);
        list1.add(6);
        list1.add(8);

        list2.add(3);
        list2.add(5);
        list2.add(7);
        list2.add(9);

        System.out.println("Products:");

        for (int i = 0; i < list1.size(); i++) {
            int product = list1.get(i) * list2.get(i);

            System.out.println(product);
        }
    }
}
