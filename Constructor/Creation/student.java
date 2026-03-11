public class Student {    //Only one class, you can declare it as public or leave it default. More than one class keep it default or declare only one as public
    int id;
    String name;

    Student() {     // Constructor (It is a method, name is same as class name, no return type)
        this.id = 1;
        this.name = "Alex";  //we can skip this. because the parameter is not same as instant variable
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
