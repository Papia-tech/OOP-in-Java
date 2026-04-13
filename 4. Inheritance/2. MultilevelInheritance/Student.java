// Multilevel inheritance is when a class is derived from another class, which is also derived from another class.
// [ A → B → C ] (B inherits from A, C inherits from B)
// Each class can inherit from only one parent (single inheritance at each level)
// Child class can access all non-private members of parent class

class Person {   // Level 1
    String name;

    void display() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {   // Level 2
    int id;

    void show() {
        System.out.println("ID: " + id);
    }
}

class Graduate extends Student {   // Level 3
    String degree;

    void info() {
        System.out.println("Degree: " + degree);
    }
}

public class Main {
    public static void main(String[] args) {
        Graduate g = new Graduate();

        g.name = "Papia";   // from Person
        g.id = 101;         // from Student
        g.degree = "B.Tech";

        g.display(); // Person method
        g.show();    // Student method
        g.info();    // Graduate method
    }
}

// Output:
// Name: Papia
// ID: 101
// Degree: B.Tech
