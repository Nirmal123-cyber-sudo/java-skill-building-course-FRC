
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList1Exercise3 {

    public static void main(String[] args) {

        String[] names = {"A", "B", "C"};

        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));

        System.out.println("ArrayList: " + nameList);
    }
}
