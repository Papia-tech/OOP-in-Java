//Constructor overloading means having more than one constructor in a class with different parameter lists.
//Same class → multiple constructors
//Different number or type of parameters

class Student {
    int id;
    String name;

    // Constructor 1: No-argument constructor
    Student() {
        id = 0;
        name = "Unknown";
    }

    // Constructor 2: Constructor with 1 parameter
    Student(int id) {
        this.id = id;
        name = "Unknown";
    }

    // Constructor 3: Constructor with 2 parameters
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student();            // Calls constructor 1
        Student s2 = new Student(101);         // Calls constructor 2
        Student s3 = new Student(102, "Alex"); // Calls constructor 3

        s1.display();
        s2.display();
        s3.display();
    }
}

//Output::
//ID: 0, Name: Unknown
//ID: 101, Name: Unknown
//ID: 102, Name: Alex
