class rectangle {
    int length,width;
    rectangle(int l,int w){
        length=l;
        width=w;
    }
    rectangle(int side){
        length=width=side;
    }
    int area(){
        return length*width;
    }
    
}
public class constructor {
    public static void main(String[] args) {
        rectangle  r1 =new rectangle(10,5);
        rectangle r2 =new rectangle(7);
        System.out.println("area of rectangle :"+r1.area());
        System.out.println("area of square:  "+r2.area());
    }
}
