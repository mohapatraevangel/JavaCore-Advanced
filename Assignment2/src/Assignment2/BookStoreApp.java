package Assignment2;
import java.util.Scanner;

public class BookStoreApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookStore bookstore = new BookStore();

        // Test: Order new books
        bookstore.order("978-3-16-148410-0", 5);
        bookstore.order("978-0-14-028333-4", 3);

        // Test: Display all books
        System.out.println("\nDisplaying all books after order:");
        bookstore.display();

        // Test: Sell books
        bookstore.sell("New Book", 2); // Selling copies of a new book
        bookstore.sell("978-0-14-028333-4", 1); // Selling existing book

        // Test: Display all books after sell
        System.out.println("\nDisplaying all books after selling:");
        bookstore.display();

        // Test: Order more copies of existing books
        bookstore.order("978-0-14-028333-4", 2);

        // Test: Display all books after ordering more
        System.out.println("\nDisplaying all books after re-order:");
        bookstore.display();

        scanner.close();
    }
}
