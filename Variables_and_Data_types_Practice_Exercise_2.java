
public class Variables_and_Data_types_Practice_Exercise_2 {
    public static void main(String[] args) {

        String name1 = "John";
        int age1 = 14;
        char grade1 = 'A';

        String name2 = "Maya";
        int age2 = 13;
        char grade2 = 'B';

        System.out.printf("%-12s %-10s %-10s%n", "Name", "Age", "Grade");
        System.out.printf("%-12s %-10d %-10c%n", name1, age1, grade1);
        System.out.printf("%-12s %-10d %-10c%n", name2, age2, grade2);
    }
}

