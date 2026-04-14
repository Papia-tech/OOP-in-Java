// Runtime Polymorphism: A Polymorphism which exists at the time of of runtime (execution time) of program is called runtime polymorphism.
// Runtime polymorphism is also called dynamic binding or late binding
// Method Overriding: Whenever we writing method in super and sub classes in such a way that method name and parameter must be same called method overriding.

class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Main {
    public static void main(String[] args) {
        Animal a = new Dog(); // upcasting
        a.sound();
    }
}

// Output:
// Dog barks
