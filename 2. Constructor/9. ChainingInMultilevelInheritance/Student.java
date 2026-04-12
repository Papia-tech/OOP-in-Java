// Java does not support multiple inheritance in classes to avoid ambiguity
// Interfaces allow multiple inheritance (one class having more than one parent)
// If multiple interfaces have same default method → must override
// Use InterfaceName.super.method() to resolve ambiguity

// NOT ALLOWED in Java
//    --class A { }
//    --class B { }
//    --class C extends A, B { } // ERROR

// You must explicitly specify: A.super.show(); So, compiler knows exactly which one to call.
interface A {
    default void show() {
        System.out.println("A");
    }
}

interface B {
    default void show() {
        System.out.println("B");
    }
}

class C implements A, B {
    public void show() {
        A.super.show(); // explicitly choosing
    }
}
