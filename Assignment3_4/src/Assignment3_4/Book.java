package Assignment3_4;

public class Book {
    int id;
    String isbn;
    String title;
    String author;
    int price;
    int copiesAvailable;

    // Constructor
    public Book(int id, String isbn, String title, String author, int price, int copiesAvailable) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
        this.copiesAvailable = copiesAvailable;
    }

    // Method to sell books
    public boolean sell(int noOfCopies) {
        if (copiesAvailable < noOfCopies) {
            return false;  // Not enough copies
        }
        copiesAvailable -= noOfCopies;
        return true;  // Successfully sold
    }

    // Method to purchase books
    public void purchase(int noOfCopies) {
        copiesAvailable += noOfCopies;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", ISBN: " + isbn + ", Title: " + title + ", Author: " + author + ", Price: " + price + ", Copies Available: " + copiesAvailable;
    }
}
