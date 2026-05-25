package Hash;
import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        //Countries Population  
        HashMap<String, Integer> populationMap = new HashMap<>();
        populationMap.put("India", 1393409038);
        populationMap.put("China", 1444216107);
        populationMap.put("United States", 331893745);
        populationMap.put("Indonesia", 273523621);
        populationMap.put("Pakistan", 220892331);
        System.out.println("Population Map: " + populationMap);
        // Accessing population of a specific country
        System.out.println("Population of India: " + populationMap.get("India"));
        // Checking if a specific country is in the HashMap
        System.out.println("Contains 'China': " + populationMap.containsKey("China"));
        // Removing a country from the HashMap
        populationMap.remove("Pakistan");
        System.out.println("Population Map after removing Pakistan: " + populationMap);
        // Iterating through the HashMap
        System.out.println("Iterating through the HashMap:");
        for (Map.Entry<String, Integer> entry : populationMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        // Size of the HashMap
        System.out.println("Size of the HashMap: " + populationMap.size());
        // Clearing the HashMap
        populationMap.clear();
        System.out.println("HashMap after clearing: " + populationMap);
        // Using HashMap to store custom objects
        HashMap<String, Person> personMap = new HashMap<>();    
        personMap.put("Alice", new Person("Alice", 30));
        personMap.put("Bob", new Person("Bob", 25));
        System.out.println("Person Map: " + personMap);
        // Accessing a specific person
        System.out.println("Person with key 'Alice': " + personMap.get("Alice"));
        // Iterating through the Person HashMap
        System.out.println("Iterating through the Person HashMap:");
        for (Map.Entry<String, Person> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}