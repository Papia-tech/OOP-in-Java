// By using inheritance
// But constructor name will be different

// Constructor chaining is when one constructor calls another constructor in the same class or in the parent class.
// Within the same class: Use this()
// From parent class (superclass): Use super()
// If there is multilevel inheritance then super() always calls the immediate parent class constructor not grandparent directly

// Can not declare both file as public. Only one file is public
class Person {
    int id;
    String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Person constructor called");
    }
}

public class Student extends Person {

    Student() {
        this(0);
        System.out.println("No-arg constructor called");
        id = 2;
        name = "Papia";
    }

    Student(int id) {
        super(id, "Unknown");
        System.out.println("1-parameter constructor called");
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
