import java.util.Scanner;
public class f8 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        for(int j = 1; j <= num ; j++) {
            System.out.println();
        for(int i = 1; i <= 10 ; i++) {
            System.out.println(j +" * "+ i +" = " +(j*i)); 
        }
    }
        sc.close();
    }
}
