
import java.util.ArrayList;

public class Store {

    ArrayList<Product> products = new ArrayList<>();
    ArrayList<Product> cart = new ArrayList<>();

    public Store() {
        products.add(new Product(1, "Laptop", 45000, 10));
        products.add(new Product(2, "Smartphone", 20000, 15));
        products.add(new Product(3, "Headphones", 1500, 20));
        products.add(new Product(4, "Keyboard", 800, 25));
        products.add(new Product(5, "Mouse", 500, 30));
    }

    public void displayProducts() {

        System.out.println("\n===== AVAILABLE PRODUCTS =====");

        for (Product product : products) {
            product.displayProduct();
            System.out.println("----------------------");
        }
    }

    public void searchProduct(String searchName) {

        boolean found = false;

        for (Product product : products) {

            if (product.name.equalsIgnoreCase(searchName)) {
                product.displayProduct();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product Not Found!");
        }
    }

    public void addToCart(int productId) {

        boolean found = false;

        for (Product product : products) {

            if (product.id == productId) {

                if (product.quantity > 0) {
                    cart.add(product);
                    product.quantity--;

                    System.out.println("Product Added to Cart!");
                } else {
                    System.out.println("Product Out of Stock!");
                }

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product Not Found!");
        }
    }

    public void displayCart() {

        if (cart.isEmpty()) {
            System.out.println("Your Cart is Empty!");
            return;
        }

        double total = 0;

        System.out.println("\n===== YOUR SHOPPING CART =====");

        for (Product product : cart) {
            product.displayProduct();
            total += product.price;
            System.out.println("----------------------");
        }

        System.out.println("Total Amount: Rs. " + total);
    }

    public void removeFromCart(int productId) {

        for (int i = 0; i < cart.size(); i++) {

            Product product = cart.get(i);

            if (product.id == productId) {
                cart.remove(i);
                product.quantity++;

                System.out.println("Product Removed from Cart!");
                return;
            }
        }

        System.out.println("Product Not Found in Cart!");
    }

    public void checkout() {

        if (cart.isEmpty()) {
            System.out.println("Your Cart is Empty!");
            return;
        }

        double total = 0;

        for (Product product : cart) {
            total += product.price;
        }

        System.out.println("\n===== ORDER SUMMARY =====");
        displayCart();

        System.out.println("Order Placed Successfully!");
        System.out.println("Thank You for Shopping!");

        cart.clear();
    }
}
