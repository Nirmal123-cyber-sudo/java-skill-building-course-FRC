import java.util.Scanner;

 public class nirmal1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
     System.out.print("Enter CP: ");
float cp = sc.nextFloat();

System.out.print("Enter SP: ");
float sp = sc.nextFloat();

        String result = sp > cp ? "profit":
                        sp < cp ? "loss" : "none";

        System.out.println(result);
        if (sp > cp) {
    float amount = sp - cp;
    float percentage = (amount / cp) * 100;

    System.out.println("Profit amount: " + amount);
    System.out.println("Profit percentage: " + percentage + "%");

} else if (sp < cp) {
    float amount = cp - sp;
    float percentage = (amount / cp) * 100;

    System.out.println("Loss amount: " + amount);
    System.out.println("Loss percentage: " + percentage + "%");

} else {
    System.out.println("No Profit, No Loss");
}


        sc.close();
    }
}

    

