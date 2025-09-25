import java.util.Scanner;

public class FactorialCalculator {

   
    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    
    public static long factorialRecursive(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();
        
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long iterativeResult = factorialIterative(number);
            System.out.println("Factorial (Iterative) of " + number + " is: " + iterativeResult);
            
            
            long recursiveResult = factorialRecursive(number);
            System.out.println("Factorial (Recursive) of " + number + " is: " + recursiveResult);
        }
        
        scanner.close();
    }
}