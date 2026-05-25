package LinkedList;
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class ReverseLinkedList {
    public static void main(String[] args) {
        // Iterative approach
        ListNode head = new ListNode(1);   
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        System.out.println("Original List:");
        printList(head);
        ListNode reversedHeadIterative = reverseIterative(head);
        System.out.println("Reversed List (Iterative):");
        printList(reversedHeadIterative);
        // Recursive approach
        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode reversedHeadRecursive = reverseRecursive(head);
        System.out.println("Reversed List (Recursive):");
        printList(reversedHeadRecursive);
    }
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
    public static ListNode reverseIterative(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
    public static ListNode reverseRecursive(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}