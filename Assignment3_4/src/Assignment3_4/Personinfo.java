package Assignment3_4;

public class Personinfo {

    // Method to validate age
    public static void validateAge(int age) throws InvalidException {
        // Check if the age is between 18 and 60
        if (age < 18 || age >= 60) {
            throw new InvalidException("Age must be between 18 and 60.");
        }
    }

    public static void main(String[] args) {
        // Check if arguments are passed correctly
        if (args.length != 2) {
            System.out.println("Error: Please provide both name and age.");
            System.exit(1); // Exit gracefully with error code 1
        }

        // Extract name and age from command-line arguments
        String name = args[0];
        int age;

        try {
            // Parse the age argument
            age = Integer.parseInt(args[1]);

            // Validate the age
            validateAge(age);

            // If no exception occurs, print the details
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Person registered successfully!");

        } catch (NumberFormatException e) {
            // Catch if the age is not a valid number
            System.out.println("Error: Age must be a valid integer.");
            System.exit(1); // Exit gracefully with error code 1
        } catch (InvalidException e) {
            // Catch the custom age validation exception
            System.out.println("Error: " + e.getMessage());
            System.exit(1); // Exit gracefully with error code 1
        }
    }
}