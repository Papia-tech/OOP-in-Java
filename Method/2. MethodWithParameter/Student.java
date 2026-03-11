class Student {
    void setData(int id, String name) {
        this.id = id;       // Use this when parameter same as instance
        this.name = name;
    }

    void show() {
        System.out.println(id + " " + name);
    }

    int id;
    String name;

    public static void main(String[] args) {
        Student s = new Student();
        s.setData(1, "Alex"); // pass arguments
        s.show();
    }
}

// Output:
// 1 Alex
