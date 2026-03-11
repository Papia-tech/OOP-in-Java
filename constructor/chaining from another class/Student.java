//using inheritance
//but constructor name will be different

class Person {
    String name;

    Person(String name) {
        this.name = name;
        System.out.println("This is parent constructor"); // executed first
    }
}

class Student extends Person {
    int id;

    Student(int id, String name) {
        super(name); // calls Person constructor first
        this.id = id;
        System.out.println("This is child constructor"); // executed after parent
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        Student s = new Student(101, "Alex");
        s.display();
    }
}
