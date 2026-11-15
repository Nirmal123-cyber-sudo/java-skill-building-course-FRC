
import java.util.ArrayList;

public class ArrayList1Exercise2 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        numbers.remove(2);

        System.out.println("Updated list: " + numbers);
        System.out.println("Size of list: " + numbers.size());
    }
}
