import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input numbers
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Addition
        double addition = num1 + num2;
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + addition);

        // Subtraction
        double subtraction = num1 - num2;
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + subtraction);

        // Multiplication
        double multiplication = num1 * num2;
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + multiplication);

        // Power
        double power = Math.pow(num1, num2);
        System.out.println(num1 + " raised to the power " + num2 + " is: " + power);

        // Division
        if (num2 != 0) {
            double division = num1 / num2;
            System.out.println("Division: " + num1 + " / " + num2 + " = " + division);
        } else {
            System.out.println("Division: Cannot divide by zero!");
        }

        // Modulo
        if (num2 != 0) {
            double modulo = num1 % num2;
            System.out.println("Modulo: " + num1 + " % " + num2 + " = " + modulo);
        } else {
            System.out.println("Modulo: Cannot compute with zero!");
        }

        sc.close();
    }
}


