package Hash;
import java.util.*;
public class HashsetLib {
    public static void main(String[] args) {
        // Creating a HashSet of strings using same syntax of ArrayList
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Date");
        hashSet.add("Elderberry");
        System.out.println("HashSet: " + hashSet);
        System.out.println("Contains 'Banana': " + hashSet.contains("Banana"));
        System.out.println("Size of HashSet: " + hashSet.size());
        hashSet.remove("Date");
        System.out.println("HashSet after removing 'Date': " + hashSet);
        hashSet.clear();
        System.out.println("HashSet after clearing: " + hashSet);
        // Adding duplicate elements
        hashSet.add("Apple");
        hashSet.add("Apple");
        System.out.println("HashSet after adding duplicates: " + hashSet);
        // Iterating through the HashSet
        System.out.println("Iterating through the HashSet:");
        for (String fruit : hashSet) {
            System.out.println(fruit);
        }
        // Size of the HashSet
        System.out.println("Size of the HashSet: " + hashSet.size());
        //Iterating using an iterator
        System.out.println("Iterating using an iterator:");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}