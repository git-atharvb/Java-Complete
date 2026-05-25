package Hash;
class Person {
    String name;
    int age;
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, age);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && java.util.Objects.equals(name, person.name);
    }
    
    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}

public class Hashset {
    public static void main(String[] args) {
        java.util.HashSet<String> hashSet = new java.util.HashSet<>();
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
        // Using HashSet to store unique integers
        java.util.HashSet<Integer> intSet = new java.util.HashSet<>();
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(2); // Duplicate, will not be added
        System.out.println("Integer HashSet: " + intSet);
        // Checking if the HashSet is empty
        System.out.println("Is the HashSet empty? " + hashSet.isEmpty());
        // Using HashSet to store custom objects
        java.util.HashSet<Person> personSet = new java.util.HashSet<>();
        personSet.add(new Person("Alice", 30));
        personSet.add(new Person("Bob", 25));
        personSet.add(new Person("Alice", 30)); // Duplicate, will not be added
        System.out.println("Person HashSet: " + personSet);
        // Iterating through the Person HashSet
        System.out.println("Iterating through the Person HashSet:");
        for (Person person : personSet) {
            System.out.println(person);
        }
        // Checking if a specific person is in the HashSet
        System.out.println("Does the HashSet contain Alice, 30? " + personSet.contains(new Person("Alice", 30)));   
        // Removing a person from the HashSet
        personSet.remove(new Person("Bob", 25));
        System.out.println("Person HashSet after removing Bob, 25: " + personSet);
    }
}