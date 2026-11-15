
public class Operators_2_Practice_Exercise_2 {
    public static void main(String[] args) {

        boolean isStudent = true;
        boolean isMember = false;
        boolean hasCoupon = false;

        boolean getsDiscount = isStudent || isMember || hasCoupon;

        System.out.println("Gets Discount: " + getsDiscount);
    }
}
