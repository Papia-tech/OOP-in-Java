// Inheritance is a mechanism where one class acquires properties and methods of another class.
// When we construct a new class from existing class in such a way that the new class access all the features and properties of existing class called inheritance

// Why use Inheritance ->
//    --Code Reusability → reuse parent code
//    --Less duplication
//    --Method overriding is only possible through inheritance
//    --Easy maintenance
//    --Creates relationship (IS-A)

// We can not access private members of class through Inheritance.
// A subclass (child class) can access all non-private members of the superclass(parent class). So, we should create the object of sub class.

// Types of Inheritance ->
//    --Single/Simple Inheritance [ A → B ]
//    --Multilevel Inheritance [ A → B → C ]
//    --Multiple Inheritance (NOT allowed for classes. Use interfaces instead)
//             B   C
//              \ /
//               A
//    --Hierarchical Inheritance 
//               A
//              / \
//             B   C

// Simple Inheritance: Simple inheritance means one class (child) inherits from one parent class.

class Person { // Super class
    String name;

    void display() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person { // Sub class
    int id;

    void show() {
        System.out.println("ID: " + id);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student(); // Object of sub class

        s.name = "Papia";
        s.id = 101;

        s.display(); // parent method
        s.show();    // child method
    }
}

// Output:
// Name: Papia
// ID: 101

