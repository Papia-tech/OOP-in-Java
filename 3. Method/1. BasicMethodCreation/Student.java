// A method is a block of code that performs a specific task and can be called whenever needed.
// In general programming → Method and fuction are almost same, In Java (OOP) → Slight difference
//    --A function is a block of code that: Performs a task, Usually independent (not tied to a class/object)
//    --A method is a function that: Belongs to a class, Works with objects

// Difference between method and constructor ->
//    --Constructor → used to initialize an object
//    --Method → used to perform operations/tasks
//    --A method must have a return type (including void), whereas a constructor has no return type

// Why use method?
//    --Reusability → write once, use many times
//    --Clean code → organized structure
//    --Easy understanding
//    --Easy debugging

class Student {
    int id;
    String name;

    void show() {   // return type is void (does not return value), no parameters
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.id = 1;
        s.name = "Alex";
        s.show(); // Method calling
    }
}

// Output:
// 1 Alex
