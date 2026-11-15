
import java.util.ArrayList;

public class ArrayList2Exercise4 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("rahul");
        names.add("aman");
        names.add("rohan");
        names.add("karan");
        names.add("arjun");

        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);

            names.set(i, name.toUpperCase());
        }

        System.out.println("Capitalized list: " + names);
    }
}
