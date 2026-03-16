// Stack is a class in the Java Collection Framework that extends Vector.
// It follows the LIFO principle (Last In First Out).

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        // Creating a Stack
        Stack<String> books = new Stack<>();

        // 1. Push elements (add elements)
        books.push("Java");
        books.push("Python");
        books.push("C++");
        books.push("JavaScript");
        System.out.println("Initial Stack: " + books);

        // 2. Peek (view top element without removing)
        System.out.println("Top element using peek(): " + books.peek());

        // 3. Pop (remove top element)
        System.out.println("Removed element using pop(): " + books.pop());
        System.out.println("Stack after pop: " + books);

        // 4. Search element
        System.out.println("Position of Python: " + books.search("Python")); //Return index// If element  is not present return -1

        // 5. Check if stack is empty
        System.out.println("Is stack empty? " + books.empty());

        // 6. Get size
        System.out.println("Size of stack: " + books.size());

        // 7. Access element using index
        System.out.println("Element at index 1: " + books.get(1));

        // 8. Iterate using for loop
        System.out.println("\nUsing for loop:");
        for(int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }

        // 9. Iterate using for-each
        System.out.println("\nUsing for-each loop:");
        for(String book : books) {
            System.out.println(book);
        }

        // 10. Check if element exists
        System.out.println("\nContains Java? " + books.contains("Java"));

        // 11. Clear stack
        books.clear();
        System.out.println("Stack after clear(): " + books);
    }
}

// Output:
// Initial Stack: [Java, Python, C++, JavaScript]
// Top element using peek(): JavaScript
// Removed element using pop(): JavaScript
// Stack after pop: [Java, Python, C++]
// Position of Python: 2
// Is stack empty? false
// Size of stack: 3
// Element at index 1: Python

// Using for loop:
// Java
// Python
// C++

// Using for-each loop:
// Java
// Python
// C++

// Contains Java? true
// Stack after clear(): []
