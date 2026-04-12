// Constructor Chaining is when one constructor calls another constructor in the same class or in the parent class.
// Within the same class: Use this()
// From parent class (superclass): Use super()
// this → refers to current class object; super → refers to parent class object

// Why use Constructor Chaining?
//    --Constructor chaining is used to avoid code duplication and to reuse initialization logic.
//    --Code Reusability
//    --Avoid Code Duplication
//    --Cleaner Code
//    --Easier Maintenance

public class Student {
    int id;
    String name;

    // No-arg constructor calls 1-parameter constructor
    Student() {
        this(0);
        System.out.println("No-arg constructor called");
        System.out.println("Default ID: " + id);
        id=2;
        name="Papia";// This will be displayed when we call the display method in the main method. It will override the default values set by the no-arg constructor.
    }

    // 1-parameter constructor calls 2-parameter constructor
    Student(int id) {
        this(id, "Unknown");
        System.out.println("1-parameter constructor called");
        System.out.println("ID: " + id);
    }

    // 2-parameter constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("2-parameter constructor called");
        System.out.println("ID: " + id + ", Name: " + name);
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        Student s = new Student();       
        s.display();
    }
}

// Output: 
// 2-parameter constructor called
// ID: 0, Name: Unknown
// 1-parameter constructor called
// ID: 0
// No-arg constructor called
// Default ID: 0
// ID: 2, Name: Papia
