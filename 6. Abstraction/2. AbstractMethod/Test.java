// Abstract Method: A method which contains abstract modifier at the time of declaration is called abstract method.
//    --It can only be used in abstract class and interfaces.
//    --It does not contain any body "{ }" and ends with ";"
//    --abstract void m1(); 
//    --We implement it in subclass
//    --Abstract method must be overridden in sub class otherwise the subclass will also become a abstract class
//    --Whenever action is common but implementation is different then we should use abstract method

abstract class Shape {
    abstract void draw();
    abstract void area();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    void area() {
        System.out.println("Area of Circle = πr²");
    }
}

public class Test {
    public static void main(String[] args) {

        Shape s = new Circle();  // Abstract class reference
        s.draw();
        s.area();

        Circle c = new Circle(); // Direct object of subclass (but same output)
        c.draw();
        c.area();
    }
}

// Output:
// Drawing Circle
// Area of Circle = πr²
// Drawing Circle
// Area of Circle = πr²
