// Method Overriding: Whenever we writing method in super and sub classes in such a way that method name and parameter must be same called method overriding.
// Method overriding occurs when a subclass provides its own implementation of a method already defined in the superclass with the same name and parameters.

// Why Use Method Overriding ->
//    --To provide specific behavior in child class
//    --Achieve runtime polymorphism
//    --Improve flexibility

// Rules:
//    --Method name and parameters must be same
//    --Must have inheritance
//    --Cannot reduce access level
//    --Cannot override final and static methods

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
