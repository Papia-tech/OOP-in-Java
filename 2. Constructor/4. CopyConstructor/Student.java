// A copy constructor is a constructor that creates a new object by copying values from another object.
//    --In Java there is no built-in copy constructor (unlike C++)
//    --We create it manually

// Use of Copy Constructor
//    --To create a new object with the same data as an existing object
//    --To duplicate an object safely
//          Student s1 = new Student(101, "Rahul");
//          Student s2 = new Student(s1);
//          s1 and s2 have same values but they are different objects in memory
//    --Avoid reference problems
//          Student s2 = s1;
//          This is NOT copying, both refer to the same object
//          s2.name = "Priya";
//          Output: s1="Priya", s2="Priya" (Both changed → dangerous!)

// Copy Constructor Example

class Student {

    int id;
    String name;

    // Parameterized constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Copy Constructor
    Student(Student ref) {
        this.id = ref.id;
        this.name = ref.name;
    }

    void show() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {

        Student s1 = new Student(101, "Rahul");  // Original object
        Student s2 = new Student(s1);            // Copy constructor

        s1.show();
        s2.show();
    }
}

// Output:
// 101 Rahul
// 101 Rahul
