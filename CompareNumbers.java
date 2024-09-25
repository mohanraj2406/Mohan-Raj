import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get two numbers from the user
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        // Use the ternary operator to find the greater number
        String result = (firstNumber > secondNumber) ? 
                        firstNumber + " is greater." : 
                        (firstNumber < secondNumber) ? 
                        secondNumber + " is greater." : 
                        "Both numbers are equal.";

        // Print the result
        System.out.println(result);

        // Close the scanner
        scanner.close();
    }
}
