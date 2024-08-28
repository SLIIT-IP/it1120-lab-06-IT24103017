import java.util.Scanner;

public class IT24103017Lab6Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        
        double square = Math.pow(number, 2);
        double squareRoot = Math.sqrt(number);
        
	System.out.println(" ");
        System.out.println("Square of " + number + " is: " + square);
        System.out.println("Square root of " + number + " is: " + squareRoot);
        
        scanner.close();
    }
}
