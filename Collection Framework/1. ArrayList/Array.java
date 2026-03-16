// ArrayList is a class in the Java Collections Framework that stores a dynamic array of objects.  
// Unlike normal arrays in Java, the size of an ArrayList can grow or shrink automatically.

import java.util.ArrayList;

public class ArrayListOperations {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        System.out.println("Initial List: " + fruits);

        // Add element at specific index (index,"element")
        fruits.add(1, "Grapes");
        System.out.println("After inserting Grapes at index 1: " + fruits);

        // Update element
        fruits.set(3, "Pineapple");
        System.out.println("After updating index 3: " + fruits);

        // Access element
        System.out.println("Element at index 2: " + fruits.get(2));

        // Remove element by index, Remaining elements shift left. Size decreases by 1.
        fruits.remove(0);
        System.out.println("After removing index 0: " + fruits);

        // Remove element by value, Remaining elements shift left. Size decreases by 1.
        fruits.remove("Mango");
      
        // nums.remove(Integer.valueOf(30));  // remove by value in case of integer array
        System.out.println("After removing Mango: " + fruits);

        // Check if element exists
        System.out.println("Contains Banana? " + fruits.contains("Banana"));

        // Get size
        System.out.println("Array size: " + fruits.size());

        // Traverse using for-each loop
        System.out.println("Traversing ArrayList:");
        for(String fruit : fruits){
            System.out.println(fruit);
        }

        // Clear list
        fruits.clear();
        System.out.println("After clearing list: " + fruits);
    }
}

// Output:
// Initial List: [Apple, Banana, Mango, Orange]
// After inserting Grapes at index 1: [Apple, Grapes, Banana, Mango, Orange]
// After updating index 3: [Apple, Grapes, Banana, Pineapple, Orange]
// Element at index 2: Banana
// After removing index 0: [Grapes, Banana, Pineapple, Orange]
// After removing Mango: [Grapes, Banana, Pineapple, Orange]
// Contains Banana? true
// Array size: 4
// Traversing ArrayList:
// Grapes
// Banana
// Pineapple
// Orange
// After clearing list: []
