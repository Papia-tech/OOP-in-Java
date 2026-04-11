// A private constructor is a constructor declared with the private keyword.
//    --Cannot create object from outside the class
//    --Can be used inside the same class

// Use of Private Constructor
//    --Restrict object creation (Prevent others from creating objects directly)
//    --Singleton Design Pattern (Ensure only one object is created)

// Private Constructor Example

class Student {

    int id;

    // Private constructor
    private Student() {
        id = 100;
        System.out.println("Constructor called");
    }

    public static void main(String[] args) {

        // Allowed: inside same class
        Student s = new Student();
        System.out.println(s.id);
    }
}

// Output: 
// Constructor called
// 100

// Outside Access (Not Allowed)
class Test {
    public static void main(String[] args) {
        Student s = new Student(); // ERROR
    }
}
//Compilation error because constructor is private
