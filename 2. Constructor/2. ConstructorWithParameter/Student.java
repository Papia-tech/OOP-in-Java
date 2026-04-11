// A parameterized constructor is a constructor that takes arguments (parameters) to initialize object values.
// Instead of fixed values like 1 and "Alex", you can pass values while creating the object.

public class Student {

    int id;
    String name;

    // Parameterized Constructor
    Student(int id, String name) {
        this.id = id;       // Assign parameter value to instance variable
        this.name = name;
        // id = id; // So instance variables (this.id, this.name) are NEVER initialized
        // name = name; // output will be 0 and null because Parameters (id, name) hide instance variables
    }

    // Method to display data
    void show() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {

        // Passing values while creating object
        Student s1 = new Student(101, "Rahul");
        Student s2 = new Student(102, "Priya");
        //Student s = new Student(); // Compilation ERROR (Because we created a parameterized constructor, so default constructor is gone)

        s1.show();
        s2.show();
    }
}

// Output:
// 101 Rahul
// 102 Priya
