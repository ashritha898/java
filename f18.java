 class calculator {
int a,b;
calculator(int x, int y){
    a=x;
    b=y;
}
int add(){
    return a+b;
}
int multiply(){
    return a*b;
}
int subtract(){
    return a-b;
}
int divide(){
    return a/b;
}
int modulus(){
    return a%b;
}
 }
   public class f18{
    public static void main(String[] args) {
        calculator calc=new calculator(10,20);
        System.out.println("Addition :" +calc.add());
        System.out.println("Multiplication :" +calc.multiply());
        System.out.println("subtaction:" +calc.subtract());
        System.out.println("division:" +calc.divide());
        System.out.println("modulus:" +calc.modulus());
        
    }
   } 
