import java.util.Scanner; 

public class IT24103017Lab6Q2B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object
        int[] numbers = new int[10]; // Array to store 10 numbers
        int i = 0; // Counter initialization

        // While loop to get input from the user
        while (i < 10) { 
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt(); // Store the input in the array
            i++; // Increment the counter
        }
       
        System.out.println("  ");
        System.out.print("The numbers you entered are: ");
        i = 0; // Reset the counter for displaying the numbers
        while (i < 10) {
            System.out.print(numbers[i] + " "); // Print each number
            i++; // Increment the counter
        }
    }
}
