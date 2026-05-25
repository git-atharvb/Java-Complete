import java.util.*;
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("ArrayList: " + list);
        // Accessing elements in the ArrayList
        System.out.println("Element at index 0: " + list.get(0));
        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("Element at index 2: " + list.get(2));
        System.out.println("Element at index 3: " + list.get(3)); // This will throw an IndexOutOfBoundsException
        // Sorting the ArrayList
        Collections.sort(list);
        System.out.println("Sorted ArrayList: " + list);
        // Iterating through the ArrayList
        System.out.println("Iterating through the ArrayList:"); 
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        //Get the size of the ArrayList
        System.out.println("Size of the ArrayList: " + list.size());
        // Modifying elements in the ArrayList
        list.set(1, 20);
        System.out.println("Modified ArrayList: " + list);
        // Removing elements from the ArrayList
        list.remove(0);
        System.out.println("ArrayList after removal: " + list);

    }
}