package Assignment3_4;

import java.io.*;
import java.util.ArrayList;

public class BookApp {
    private ArrayList<Book> bookList = new ArrayList<>();

    // Method to read data from file and populate book list
    public void readBooksFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 5) {
                    try {
                        // Try to parse the integers with exception handling
                        int id = Integer.parseInt(parts[0].trim());
                        int price = Integer.parseInt(parts[4].trim());
                        String isbn = parts[1].trim();
                        String title = parts[2].trim();
                        String author = parts[3].trim();

                        // Add book to the list with initial copies available
                        bookList.add(new Book(id, isbn, title, author, price, 10));
                    } catch (NumberFormatException e) {
                        System.err.println("Invalid number format in line: " + line);
                        // Skip this line and continue with the next one
                    }
                }
            }
            System.out.println("Books loaded successfully from the file.");
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

    // Method to display all books
    public void displayBooks() {
        for (Book book : bookList) {
            System.out.println(book);
        }
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        BookApp app = new BookApp();

        // Load books from file
        app.readBooksFromFile("books.txt");

        // Display all books
        app.displayBooks();
    }
}
