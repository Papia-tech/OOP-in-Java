//Method has a return type like int, char, double, float, double, short, long or byte.
class Calculator {
    int add(int a, int b) {  // returns int
        return a + b;
    }

    public static void main(String args[]) {
        Calculator c = new Calculator();
        int sum = c.add(10, 20);  // call method
        System.out.println(sum);
    }
}
