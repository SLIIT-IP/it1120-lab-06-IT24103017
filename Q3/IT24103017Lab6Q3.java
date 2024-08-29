import java.util.Scanner; 

public class IT24103017Lab6Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int sumOfSquares = 0; // To store the sum of squares of the numbers
        int count = 0; // To count the number of valid entries
        
        System.out.println("Enter positive integers (terminate input with -99):");
        while (true) { // Infinite loop to continue taking inputs
            System.out.print("Enter a number: ");
            int number = input.nextInt(); // Take user input

            // Check if the user wants to terminate the input
            if (number == -99) {
                break;
            } else if (number < 0) { // Validate if a negative number is entered
                System.out.println("Invalid input! Please enter a positive integer or -99 to terminate.");
                continue; // Continue to the next iteration
            }

            // Calculate the sum of squares and increment the count
            sumOfSquares += number * number; // Square the number and add to sum
            count++; // Increment the valid number count
        }

        // Calculate and display the Root Mean Square
        if (count > 0) { // Ensure at least one number is entered
            double rms = Math.sqrt((double) sumOfSquares / count); // Calculate RMS
            System.out.println("The Root Mean Square (RMS) is: " + rms);
        } else {
            System.out.println("No valid numbers were entered.");
        }
    }
}
