package Assignment3_4;

public class InvalidCountryException extends Exception{
    // Constructor without arguments
    public InvalidCountryException() {
        super();
    }

    // Constructor that accepts a custom message
    public InvalidCountryException(String message) {
        super(message);
    }
}