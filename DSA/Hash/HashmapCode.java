package Hash;
import java.util.HashMap;
public class HashmapCode {
    public static void main(String[] args) {
        // Creating a HashMap of strings to integers
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 1);
        hashMap.put("Banana", 2);
        hashMap.put("Cherry", 3);
        hashMap.put("Date", 4);
        hashMap.put("Elderberry", 5);
        System.out.println("HashMap: " + hashMap);
        System.out.println("Value for 'Banana': " + hashMap.get("Banana"));
        System.out.println("Size of HashMap: " + hashMap.size());
        hashMap.remove("Date");
        System.out.println("HashMap after removing 'Date': " + hashMap);
        hashMap.clear();
        System.out.println("HashMap after clearing: " + hashMap);
        //hashfunctions
        HashMap<Person, String> personHashMap = new HashMap<>();
        personHashMap.put(new Person("Alice", 30), "Engineer");
        personHashMap.put(new Person("Bob", 25), "Designer");
        System.out.println("Person HashMap: " + personHashMap);
        System.out.println("Value for Alice, 30: " + personHashMap.get(new Person("Alice", 30)));   
    }
}