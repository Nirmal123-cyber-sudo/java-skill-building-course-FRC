public class Main {
    public static void main(String[] args) {

        double length = 12.5;
        double breadth = 7.5;

        double area = length * breadth;
        double perimeter = 2 * (length + breadth);

        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Perimeter: %.2f%n", perimeter);
    }
}