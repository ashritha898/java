
import java.util.Scanner;

public class ReverseNumber {

    public static int reverse(int number) {
        int reversed = 0;
        int num = number;

        while (num != 0) {
            int digit = num % 10; 
            reversed = reversed * 10 + digit; 
            num /= 10; 
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();

        int reversedNumber = reverse(number);

        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reversedNumber);

        scanner.close();
    }
}

