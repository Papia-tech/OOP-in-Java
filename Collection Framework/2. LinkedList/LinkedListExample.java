// LinkedList is a class in the Java Collections Framework that stores elements as nodes connected by links (references) 
// instead of storing them in contiguous memory like arrays.

import java.util.LinkedList;

public class LinkedListExamples {
    public static void main(String[] args) {
      
        LinkedList<String> list = new LinkedList<>(); // Creating object for class LinkedList

        // 1. add()
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");

        System.out.println("Initial List: " + list);

        // 2. addFirst()
        list.addFirst("Grapes");

        // 3. addLast()
        list.addLast("Pineapple");

        System.out.println("After addFirst & addLast: " + list);

        // 4. add(index, element)
        list.add(2, "Cherry");
        System.out.println("After add at index 2: " + list);

        // 5. get(index)
        System.out.println("Element at index 3: " + list.get(3));

        // 6. getFirst()
        System.out.println("First Element: " + list.getFirst());

        // 7. getLast()
        System.out.println("Last Element: " + list.getLast());

        // 8. set()
        list.set(1, "Kiwi");
        System.out.println("After set(): " + list);

        // 9. contains()
        System.out.println("Contains Mango? " + list.contains("Mango"));

        // 10. size()
        System.out.println("Size of List: " + list.size());

        // 11. remove()
        list.remove("Banana");

        // 12. remove(index)
        list.remove(2);
        System.out.println("After remove(): " + list);

        // 13. removeFirst()
        list.removeFirst();

        // 14. removeLast()
        list.removeLast();
        System.out.println("After removeFirst & removeLast: " + list);

        // 15. indexOf()
        System.out.println("Index of Mango: " + list.indexOf("Mango"));

        // 16. isEmpty()
        System.out.println("Is list empty? " + list.isEmpty());

        // 17. Iterating using for-each
        System.out.println("Elements using for-each:");
        for(String fruit : list) {
            System.out.println(fruit);
        }

        // 18. clear()
        list.clear();

        System.out.println("After clear(): " + list);
    }
}

// Output:
// Initial List: [Apple, Banana, Mango, Orange]
// After addFirst & addLast: [Grapes, Apple, Banana, Mango, Orange, Pineapple]
// After add at index 2: [Grapes, Apple, Cherry, Banana, Mango, Orange, Pineapple]
// Element at index 3: Banana
// First Element: Grapes
// Last Element: Pineapple
// After set(): [Grapes, Kiwi, Cherry, Banana, Mango, Orange, Pineapple]
// Contains Mango? true
// Size of List: 7
// After remove(): [Grapes, Kiwi, Mango, Orange, Pineapple]
// After removeFirst & removeLast: [Kiwi, Mango, Orange]
// Index of Mango: 1
// Is list empty? false
// Elements using for-each:
// Kiwi
// Mango
// Orange
// After clear(): []
