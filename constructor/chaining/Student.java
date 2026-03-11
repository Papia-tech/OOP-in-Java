//Constructor chaining is when one constructor calls another constructor in the same class or in the parent class.
//Within the same class: Use this()
//From parent class (superclass): Use super()
class Student {
    int id;
    String name;

    // 2-parameter constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // 1-parameter constructor calls 2-parameter constructor
    Student(int id) {
        this(id, "Unknown"); // Must be first statement
    }

    // No-arg constructor calls 1-parameter constructor
    Student() {
        this(0); // Must be first statement
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student();       
        Student s2 = new Student(101);    
        Student s3 = new Student(102, "Alex");

        s1.display();
        s2.display();
        s3.display();
    }
}
