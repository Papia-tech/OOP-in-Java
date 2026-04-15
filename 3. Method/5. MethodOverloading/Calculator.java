// Method Overloading in Java is a feature where multiple methods have the same name but different parameters inside the same class.

// A method is considered overloaded when at least one of these is different:
// 1. Number of parameters
// 2. Type of parameters
// 3. Order of parameters

// ⚠️ Return type alone cannot overload a method.

// Rules ->
//    --Same Method Name: All overloaded methods must have the same name within the same class or hierarchy.
//    --Different Parameter List: The methods must have different parameter lists. The difference can be achieved by:
//          -– Changing the number of parameters (e.g., one method with two integers, another with three integers).
//          -– Changing the data types of parameters (e.g., one method with two integers, another with two doubles).
//          -– Changing the order of parameters (e.g., one method with (String name, int id), another with (int id, String name)).
//    --Return Type Does Not Matter: You cannot overload a method by changing its return type alone. The parameter list must still be different; otherwise, a compile-time error will occur.
//    --Access Modifiers and Exceptions: Overloaded methods can have different access modifiers (public, private, etc.) and can throw different exceptions.
//    --Static/Instance Methods: Both static and non-static methods can be overloaded.

class Calculator {
    // Method 1: add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method 2: add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: add two double numbers
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        Calculator c = new Calculator();

        int result1 = c.add(10, 20);
        int result2 = c.add(5, 10, 15);
        double result3 = c.add(2.5, 3.5);

        System.out.println("Sum of two integers: " + result1);
        System.out.println("Sum of three integers: " + result2);
        System.out.println("Sum of two doubles: " + result3);
    }
}

// Sum of two integers: 30
// Sum of three integers: 30
// Sum of two doubles: 6.0
