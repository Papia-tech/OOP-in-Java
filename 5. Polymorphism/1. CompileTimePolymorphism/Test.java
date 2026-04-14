// Polymorphism = Poly (means Many) + Morphism (means Forms) = many forms
// Polymorphism allows one method to take multiple forms in different situations. It is achieved through method overloading at compile time and method overriding at runtime.
// Polymorphism is the greek word whose meaning is "same method showing different behaviour".

//For example: A Person can be: Customer, Friend, Students, Teacher
//    --i) void person (Teacher)
//    --ii) void person (Students)
//    --iii) void person (Friend) 
//    --iv) void person (Customer) 

// Why Use Polymorphism ->
//    --Code reusability
//    --Flexibility
//    --Cleaner and scalable code

// Types of Polymorphism ->
//    --1. Compile-Time Polymorphism (Same method name, different parameter list) E.g: Method Overloading
//    --2. Run-Time Polymorphism (Same method, different implementation) E.g: Method Overriding

// Compile time polymorphism: A polymorphism which exists at the time of compilation is called compile time or early binding or static polymorphism.

class Test {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.add(2, 3));  
        System.out.println(t.add(2, 3, 4)); 
    }
}

// Output:
// 5
// 9
