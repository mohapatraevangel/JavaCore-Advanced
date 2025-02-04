package Assignment2;

public class BookStore {
    private Book[] books;
    private int bookCount;

    // Constructor to initialize the bookstore with a maximum of 10 books
    public BookStore() {
        books = new Book[10];
        bookCount = 0;
    }

    // Method to sell a book and decrease the number of copies
    public void sell(String bookTitle, int quantity) {
        boolean found = false;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getBookTitle().equals(bookTitle)) {
                found = true;
                int currentCopies = books[i].getNumOfCopies();
                if (currentCopies >= quantity) {
                    books[i].setNumOfCopies(currentCopies - quantity);
                    System.out.println("Sold " + quantity + " copies of " + bookTitle);
                } else {
                    System.out.println("Not enough copies of " + bookTitle + " to sell.");
                }
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found: " + bookTitle);
        }
    }

    // Method to order books (either new or existing)
    public void order(String ISBN, int quantity) {
        boolean found = false;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getISBN().equals(ISBN)) {
                found = true;
                int currentCopies = books[i].getNumOfCopies();
                books[i].setNumOfCopies(currentCopies + quantity);
                System.out.println("Ordered " + quantity + " more copies of " + books[i].getBookTitle());
                break;
            }
        }

        if (!found) {
            // If book not found, create a new book entry
            System.out.println("Book with ISBN " + ISBN + " not found. Adding new book.");
            books[bookCount] = new Book("New Book", "Unknown Author", ISBN, quantity);
            bookCount++;
            System.out.println("New book ordered with ISBN " + ISBN + " and " + quantity + " copies.");
        }
    }

    // Method to display all books in the bookstore
    public void display() {
        if (bookCount == 0) {
            System.out.println("No books available in the store.");
        } else {
            for (int i = 0; i < bookCount; i++) {
                books[i].display();
            }
        }
    }
}
