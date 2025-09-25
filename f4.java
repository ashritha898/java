import java.util.Scanner;
public class f4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        if(marks>=90){
            System.out.println("GRADE:A");
        }
        else if(marks>=75){
            System.out.println("GRADE:B");
        }
        else if(marks>=50){
            System.out.println("GRADE:C");
        }
        else{
            System.out.println("GRADE:FAIL");
        }
   sc.close(); 
}
}