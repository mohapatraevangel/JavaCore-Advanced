package Assignment2;

public class Book {
    private String bookTitle;
    private String author;
    private String ISBN;
    private int numOfCopies;

    // Constructor to initialize the book's details
    public Book(String bookTitle, String author, String ISBN, int numOfCopies) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.ISBN = ISBN;
        this.numOfCopies = numOfCopies;
    }

    // Display the book details
    public void display() {
        System.out.println(bookTitle + " - " + author + " - " + ISBN + " - " + numOfCopies);
    }

    // Getter for ISBN
    public String getISBN() {
        return ISBN;
    }

    // Getter and setter for the number of copies
    public int getNumOfCopies() {
        return numOfCopies;
    }

    public void setNumOfCopies(int numOfCopies) {
        this.numOfCopies = numOfCopies;
    }

    // Getter for book title
    public String getBookTitle() {
        return bookTitle;
    }
}
