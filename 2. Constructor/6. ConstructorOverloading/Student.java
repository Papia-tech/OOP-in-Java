// Constructor Overloading means having more than one constructor in a class with different parameter lists.
// Same class → multiple constructors

// Why use Overloading?
//    --Constructor overloading allows creating objects in different ways depending on available data.
//    --Constructor overloading improves "flexibility" by allowing objects to be initialized in multiple ways.

// Rules of Constructor Overloading ->
//    --All constructors must have the same name as the class
//    --Different Parameter List (Constructors must differ in: Number of parameters or Type of parameters or Order of parameters)
//    --No Limit on Number of Constructors
//    --Cannot Overload by Return Type (constructors don’t have return types)

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

// Output::
// ID: 0, Name: Unknown
// ID: 101, Name: Unknown
// ID: 102, Name: Alex
