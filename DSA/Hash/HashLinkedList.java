package Hash;
public class HashLinkedList {
    public static void main(String[] args) {
        //Implementing a simple hash linked list using Java's LinkedList
        java.util.LinkedList<String> hashLinkedList = new java.util.LinkedList<>();
        // Adding elements to the hash linked list
        hashLinkedList.add("Node1");
        hashLinkedList.add("Node2");
        hashLinkedList.add("Node3");
        System.out.println("Hash Linked List: " + hashLinkedList);
        // Accessing elements
        System.out.println("First Node: " + hashLinkedList.getFirst());
        System.out.println("Last Node: " + hashLinkedList.getLast());
        // Removing elements
        hashLinkedList.removeFirst();
        System.out.println("Hash Linked List after removing the first node: " + hashLinkedList);
        // Checking if the list contains a specific node
        System.out.println("Does the list contain 'Node2'? " + hashLinkedList.contains("Node2"));
        // Clearing the list    
        hashLinkedList.clear();
        System.out.println("Is the hash linked list empty? " + hashLinkedList.isEmpty());
        // Adding more nodes
        hashLinkedList.add("Node4");
        hashLinkedList.add("Node5");
        System.out.println("Hash Linked List after adding more nodes: " + hashLinkedList);
        // Iterating through the hash linked list   
        System.out.println("Iterating through the hash linked list:");
        for (String node : hashLinkedList) {
            System.out.println(node);
        }
    }
}