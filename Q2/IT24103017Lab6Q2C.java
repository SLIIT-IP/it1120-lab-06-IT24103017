import java.util.Scanner; 

public class IT24103017Lab6Q2C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int[] numbers = new int[10]; // Array to store 10 numbers
        int i = 0; // Counter initialization
        int sum = 0; // Variable to store the sum of the numbers

        
        while (i < 10) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt(); // Store the input in the array
            sum += numbers[i]; // Add the number to the sum
            i++; // Increment the counter
        }

        // Display the numbers entered
        System.out.println(" ");
        System.out.print("The numbers you entered are: ");
        i = 0; // Reset the counter for displaying the numbers
        while (i < 10) {
            System.out.print(numbers[i] + " "); 
            i++; // Increment the counter
        }

        
        double average = sum / 10.0; 
        // Display the sum and average
        System.out.println(" ");
        System.out.println("\nSum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);
    }
}
