class Student {
    int id;
    String name;

    void show() {   // no return type, no parameters
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.id = 1;
        s.name = "Alex";
        s.show();
    }
}

// Output:
// 1 Alex
