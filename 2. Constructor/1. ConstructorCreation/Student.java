// Constructor is a special type of method whose name is same as class name
//    --The main purpose of constructor is to initialize the object
//    --If no constructor is defined, Java provides a default constructor automatically
//    --A constructor is automatically called during the time of object creation
//    --A constructor never contains any return type including void
//    --Constructor is same as method, name is same as class name, no return type

public class Student { 
    int id;
    String name;

    Student() {
        this.id = 1;
        this.name = "Alex";  //we can skip "this." keyword because the parameter is not same as instant variable
    }

    void show() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.show();
    }
}

// Output: 
// 1 Alex
