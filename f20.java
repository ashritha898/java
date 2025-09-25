class Student {
    String name;  // Instance variable for student name
    int age;      // Instance variable for student age

    // Constructor
    Student(String name, int age) {
        this.name = name;  // 'this' refers to the current object
        this.age = age;
    }

    // Method to display student details
      void display() {
        System.out.println("Name:" + name + ", Age:" + age);
    }
}

public class f20 {
    public static void main(String[] args){
        // Create a Student object
        Student s1 = new Student("Ravi", 22);

        // Call display method
        s1.display();
    }
}
