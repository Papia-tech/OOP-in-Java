// Vector is a class in Java Collection Framework that implements List.
// It is similar to ArrayList but it is synchronized (thread-safe).

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        
        // Creating a Vector
        Vector<String> fruits = new Vector<>(); // or, Vector<String> fruits = new Vector<String>();

        // 1. Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("Initial Vector: " + fruits);

        // 2. Add element at specific index
        fruits.add(1, "Grapes");
        System.out.println("After adding Grapes at index 1: " + fruits);

        // 3. Access element
        System.out.println("Element at index 2: " + fruits.get(2));

        // 4. Update element
        fruits.set(2, "Pineapple");
        System.out.println("After updating index 2: " + fruits);

        // 5. Remove element by index
        fruits.remove(3);
        System.out.println("After removing index 3: " + fruits);

        // 6. Remove element by value
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // 7. Check if element exists
        System.out.println("Contains Apple? " + fruits.contains("Apple"));

        // 8. Get size
        System.out.println("Size of vector: " + fruits.size());

        // 9. Iterate using for loop
        System.out.println("\nUsing for loop:");
        for(int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        // 10. Iterate using for-each
        System.out.println("\nUsing for-each loop:");
        for(String fruit : fruits) {
            System.out.println(fruit);
        }

        // 11. Get first element
        System.out.println("\nFirst element: " + fruits.firstElement());

        // 12. Get last element
        System.out.println("Last element: " + fruits.lastElement());

        // 13. Check index of element
        System.out.println("Index of Apple: " + fruits.indexOf("Apple"));

        // 14. Check if vector is empty
        System.out.println("Is vector empty? " + fruits.isEmpty());

        // 15. Clear all elements
        fruits.clear();
        System.out.println("After clearing vector: " + fruits);
    }
}

// Output:
// Initial Vector: [Apple, Banana, Mango, Orange]
// After adding Grapes at index 1: [Apple, Grapes, Banana, Mango, Orange]
// Element at index 2: Banana
// After updating index 2: [Apple, Grapes, Pineapple, Mango, Orange]
// After removing index 3: [Apple, Grapes, Pineapple, Orange]
// After removing Banana: [Apple, Grapes, Pineapple, Orange]
// Contains Apple? true
// Size of vector: 4

// Using for loop:
// Apple
// Grapes
// Pineapple
// Orange

// Using for-each loop:
// Apple
// Grapes
// Pineapple
// Orange

// First element: Apple
// Last element: Orange
// Index of Apple: 0
// Is vector empty? false
// After clearing vector: []
