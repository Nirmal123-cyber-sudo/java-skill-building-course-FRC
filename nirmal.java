import java.util.Scanner;

public class nirmal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        float temp = sc.nextFloat();

        String result = temp < 15 ? "Cold" :
                        temp <= 30 ? "Warm" : "Hot";

        System.out.println(result);

        sc.close();
    }
}