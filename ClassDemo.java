public class ClassDemo{
    public static void main(String[]args){
        Student s1= new Student();
        s1.name="Kishan";
        s1.age=21;
        s1.display();
    }
}
class Student{
    String name;
    int age;
    void display(){
        System.out.println("Name:"+name+"Age:"+age);
    }
}
// Constructor:special method when object is created example for constuctor
//three type of constructors1.default constructor2.no argument constructor3.parameter constructor
        
            

    

