// Abstraction is a process of hiding internal details and showing the functionality.
// E.g: Phone Call[We don't know the internal processing]

// Ways to Achieve Abstraction in Java ->
//    --Abstract class (20% -> 80% abstraction)
//    --Interface (100% abstraction)

// Why use Abstraction ->
//    --Hides complex implementation details
//    --Shows only essential features 
//    --Improves security (data hiding)
//    --Promotes code reusability

// Abstract Class: Abstract class is a class thet contains abstract keyword in its declaration.
//    --We can't create object of abstract class. But we can create referrence of abstract class
//    --To use an abstract class (super class) we have to inherit it to a sub class
//    --It may or may not contain abstract methods
//    --It can have abstract and non-abstract method
//    --If a class contain partial implementation then we should declare a class as abstract

abstract class Animal {
    int id = 10;
}

class Dog extends Animal {
    // No methods needed
}

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();   // Reference of abstract class
        // Animal a = new Animal(); // Error
        System.out.println(a.id);
    }
}

// Output:
// 10

// Or,

abstract class Animal {

    // Abstract method (no body)
    abstract void sound();

    // Normal method
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Subclass
class Dog extends Animal {

    // Providing implementation of abstract method
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();  // Object creation
        d.sound();
        d.eat();
    }
}

// Output:
// Dog barks
// Animal is eating
