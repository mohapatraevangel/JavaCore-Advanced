package Assignment3_4;

// Custom exception class to handle invalid age
public class InvalidException extends Exception {
    // Constructor that accepts a custom message
    public InvalidException(String message) {
        super(message);
    }
}
