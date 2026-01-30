# Exception Handling Demo (Task 9)

A Java application designed to demonstrate robust error handling. It prevents the program from crashing when users enter invalid data and implements custom business logic validation.

## 🛠 Features Implemented

### 1. Robust Input Handling (`try-catch`)
* Prevents crashes when:
    * The user tries to divide by zero (`ArithmeticException`).
    * The user enters text instead of numbers (`InputMismatchException`).

### 2. Custom Exceptions
* **Scenario:** Created a specific class `InvalidAgeException`.
* **Why:** Java knows what "divide by zero" is, but it doesn't know that "Age less than 18" is an error for my specific app. I had to teach it that rule by creating a custom exception.

### 3. Resource Cleanup (`finally`)
* The `finally` block runs **no matter what**. Whether the code succeeds or fails, this block executes to close the `Scanner` connection to prevent memory leaks.

## 🧠 Core Concepts Explained

**Q: What is the difference between Checked and Unchecked Exceptions?**
* **Checked Exceptions:** The compiler forces you to handle them (e.g., `IOException`). If you don't wrap them in try-catch, the code won't compile. They represent external failures (like a missing file).
* **Unchecked Exceptions:** The compiler doesn't force you (e.g., `ArithmeticException`, `NullPointerException`). They usually represent flaws in the program logic.

**Q: What is `throw` vs `throws`?**
* `throw`: An action. You use it inside a method to trigger an error *now*. (e.g., `throw new Exception()`).
* `throws`: A warning. You put it in the method signature to warn other parts of the code that "This method *might* cause an error, so be ready."

## 🧪 Sample Execution Log

**Scenario 1: Divide by Zero**
```text
Enter a numerator: 10
Enter a denominator: 0
Error: Cannot divide by zero. Please check your math!
[Log]: java.lang.ArithmeticException: / by zero
[System]: Closing resources and cleaning up...
