
import java.util.Scanner;
public class f9 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.println("Hello, " + name);
        System.out.println("Length = " + name.length());
        System.out.println("Upper case = " + name.toUpperCase());
        System.out.println("Lower case = " + name.toLowerCase());
        sc.close();
    }
}

