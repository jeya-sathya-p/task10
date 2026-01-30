import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * TASK 10: Exception Handling System
 * Demonstrates: Try-Catch, Finally, Custom Exceptions, and Throw vs Throws.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==========================================");
        System.out.println("       EXCEPTION HANDLING DEMO            ");
        System.out.println("==========================================");

        // 3. Use finally block for cleanup (Ensured by the try-with-resources or explicit finally)
        try {
            // Scenario 1: Handling Input Errors
            System.out.print("Enter a numerator: ");
            int numerator = scanner.nextInt();
            
            System.out.print("Enter a denominator: ");
            int denominator = scanner.nextInt();

            // 1. Identify runtime exceptions (ArithmeticException)
            // 2. Handle them using try-catch blocks
            int result = numerator / denominator;
            System.out.println("Result: " + result);

            // Scenario 2: Custom Exception Logic
            System.out.print("\nEnter your age for registration: ");
            int age = scanner.nextInt();
            checkAge(age);

        } catch (ArithmeticException e) {
            // 7. Add meaningful error messages
            System.out.println("Error: Cannot divide by zero. Please check your math!");
            // 8. Log exceptions properly (Simulated log)
            System.out.println("[Log]: " + e.toString());

        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input! Please enter whole numbers only.");
            System.out.println("[Log]: Input data type mismatch.");

        } catch (InvalidAgeException e) {
            // Handling our Custom Exception
            System.out.println("Registration Failed: " + e.getMessage());

        } catch (Exception e) {
            // Catch-all for unexpected errors
            System.out.println("An unexpected error occurred: " + e.getMessage());

        } finally {
            // 3. Use finally block for cleanup
            System.out.println("\n[System]: Closing resources and cleaning up...");
            scanner.close();
            System.out.println("[System]: Program Terminated.");
        }
    }

    // 5. Throw exceptions manually
    // 6. Handle checked vs unchecked exceptions (This is Unchecked/Runtime)
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            // 5. Throw exceptions manually
            throw new InvalidAgeException("User is under 18. Access Denied.");
        } else {
            System.out.println("Access Granted! Welcome to the portal.");
        }
    }
}

// 4. Create custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
