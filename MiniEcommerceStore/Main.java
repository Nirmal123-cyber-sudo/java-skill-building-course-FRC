
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Store store = new Store();

        int choice = 0;

        while (choice != 7) {

            System.out.println("\n===== MINI E-COMMERCE STORE =====");
            System.out.println("1. View Products");
            System.out.println("2. Search Product");
            System.out.println("3. Add to Cart");
            System.out.println("4. View Cart");
            System.out.println("5. Remove from Cart");
            System.out.println("6. Checkout");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1: {
                    store.displayProducts();
                    break;
                }

                case 2: {
                    sc.nextLine();

                    System.out.print("Enter product name: ");
                    String searchName = sc.nextLine();

                    store.searchProduct(searchName);
                    break;
                }

                case 3: {
                    System.out.print("Enter Product ID: ");
                    int productId = sc.nextInt();

                    store.addToCart(productId);
                    break;
                }

                case 4: {
                    store.displayCart();
                    break;
                }

                case 5: {
                    System.out.print("Enter Product ID to remove: ");
                    int removeId = sc.nextInt();

                    store.removeFromCart(removeId);
                    break;
                }

                case 6: {
                    store.checkout();
                    break;
                }

                case 7: {
                    System.out.println("Thank You for Shopping!");
                    break;
                }

                default: {
                    System.out.println("Invalid Choice!");
                }
            }
        }

        sc.close();
    }
}
