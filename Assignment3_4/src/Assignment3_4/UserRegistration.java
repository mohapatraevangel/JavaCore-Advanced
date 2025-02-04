package Assignment3_4;

public class UserRegistration {
    // Method to register a user
    public void registerUser(String username, String userCountry) throws InvalidCountryException {
        if (!userCountry.equalsIgnoreCase("India")) {
            throw new InvalidCountryException("User Outside India cannot be registered");
        } else {
            System.out.println("User registration done successfully");
        }
    }

    // Main method to invoke the registerUser method
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();

        try {
            // Test data: username and userCountry
            String username = "JohnDoe";
            String userCountry = "USA"; // Change this to "India" to see the success message

            // Attempt to register the user
            userRegistration.registerUser(username, userCountry);
        } catch (InvalidCountryException e) {
            // Catch and print the exception message if thrown
            System.out.println(e.getMessage());
        }
    }
}
