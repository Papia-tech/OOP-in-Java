// Hierarchical inheritance has one superclass and multiple subclasses, where each subclass directly extends the superclass
// Hierarchical inheritance is when multiple child classes inherit from the same parent class.
// Subclasses cannot access each other's properties directly
//       A
//      / \
//     B   C

// Parent constructor is called separately for each child object

class Person {   // Parent class
    String name;

    void display() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {   // Child 1
    int id;

    void show() {
        System.out.println("ID: " + id);
    }
}

class Teacher extends Person {   // Child 2
    String subject;

    void teach() {
        System.out.println("Subject: " + subject);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s = new Student();
        s.name = "Papia";
        s.id = 101;

        Teacher t = new Teacher();
        t.name = "Alex";
        t.subject = "Math";

        s.display(); // from Person
        s.show();    // Student method

        t.display(); // from Person
        t.teach();   // Teacher method
    }
}

// Output:
// Name: Papia
// ID: 101
// Name: Alex
// Subject: Math
