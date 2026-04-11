// A constructor with no parameters is called a no-argument constructor
// A default constructor is provided by Java automatically when no constructor is defined
//    --Implicit Default Constructor (Real Default Constructor): Automatically created by compiler when we do not add it manually.
//    --Explicit Default Constructor (User-defined No-Argument Constructor): Created by Programmer that has no parameter.

//Implicit Default Constructor
public class Student {

    int id;
    String name;

    void show() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student s = new Student();  // Default constructor is called
        s.show();
    }
}

// Output:
// 0 null

// Explicit Default Constructor
public class Student {

    int id;
    String name;

    // No-argument constructor
    Student() {
        id = 10;
        name = "Rahul";
    }

    void show() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student s = new Student();  // Calls no-arg constructor
        s.show();
    }
}

// Output: 
// 10 Rahul
