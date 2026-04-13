// Multiple inheritance means a class inherits from more than one parent class.
//             B   C
//              \ /
//               A

// Multiple Inheritance (NOT allowed for classes. Use interfaces instead)
// Java does NOT support multiple inheritance using classes

// Why Java does not support Multiple Inheritance ->
//    --Because of ambiguity (Diamond Problem) 💎
//          A
//         / \
//        B   C
//         \ /
//          D
//    --If both B and C have same method: Which one should D use?
//    --Confusion → Java avoids it

// Multiple Inheritance using Interfaces
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
    @Override
    public void show() {
        A.super.show(); // choose A's method
    }
}

public class Main {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}

// Output:
// A
