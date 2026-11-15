
public class UserDefinedMethods2Exercise2 {

    void printFibonacci(int count) {
        int first = 0;
        int second = 1;

        for (int i = 1; i <= count; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {

        UserDefinedMethods2Exercise2 obj =
            new UserDefinedMethods2Exercise2();

        obj.printFibonacci(10);
    }
}
