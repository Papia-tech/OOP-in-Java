//Without return type means void type
//It does not return anything

class Calculator {

    // method without return type (void)
    void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {

        Calculator c = new Calculator();  // create object

        c.add(10, 20);   // call method
        c.add(5, 7);     // call method again

    }
}

//Output:
//Sum = 30
//Sum = 12
