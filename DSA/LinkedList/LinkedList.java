package LinkedList;
import java.util.*;

public class LinkedList {

    // Singly linked list with many common operations
    public static class SinglyLinkedList<T extends Comparable<T>> {
        private static class Node<E> {
            E val;
            Node<E> next;
            Node(E v) { val = v; }
        }

        private Node<T> head;
        private int size = 0;

        public void addFirst(T val) {
            Node<T> n = new Node<>(val);
            n.next = head;
            head = n;
            size++;
        }

        public void addLast(T val) {
            Node<T> n = new Node<>(val);
            if (head == null) head = n;
            else {
                Node<T> cur = head;
                while (cur.next != null) cur = cur.next;
                cur.next = n;
            }
            size++;
        }

        public void addAt(int idx, T val) {
            if (idx < 0 || idx > size) throw new IndexOutOfBoundsException();
            if (idx == 0) { addFirst(val); return; }
            Node<T> cur = head;
            for (int i = 0; i < idx - 1; i++) cur = cur.next;
            Node<T> n = new Node<>(val);
            n.next = cur.next;
            cur.next = n;
            size++;
        }

        public T removeFirst() {
            if (head == null) return null;
            T v = head.val;
            head = head.next;
            size--;
            return v;
        }

        public T removeLast() {
            if (head == null) return null;
            if (head.next == null) { T v = head.val; head = null; size--; return v; }
            Node<T> cur = head;
            while (cur.next.next != null) cur = cur.next;
            T v = cur.next.val;
            cur.next = null;
            size--;
            return v;
        }

        public T removeAt(int idx) {
            if (idx < 0 || idx >= size) throw new IndexOutOfBoundsException();
            if (idx == 0) return removeFirst();
            Node<T> cur = head;
            for (int i = 0; i < idx - 1; i++) cur = cur.next;
            T v = cur.next.val;
            cur.next = cur.next.next;
            size--;
            return v;
        }

        public boolean contains(T val) {
            return indexOf(val) >= 0;
        }

        public int indexOf(T val) {
            Node<T> cur = head; int idx = 0;
            while (cur != null) {
                if (Objects.equals(cur.val, val)) return idx;
                cur = cur.next; idx++;
            }
            return -1;
        }

        public int size() { return size; }
        public boolean isEmpty() { return size == 0; }

        public void clear() { head = null; size = 0; }

        public void reverseIterative() {
            Node<T> prev = null, cur = head;
            while (cur != null) {
                Node<T> next = cur.next;
                cur.next = prev;
                prev = cur;
                cur = next;
            }
            head = prev;
        }

        public void reverseRecursive() { head = reverseRec(head); }
        private Node<T> reverseRec(Node<T> node) {
            if (node == null || node.next == null) return node;
            Node<T> newHead = reverseRec(node.next);
            node.next.next = node;
            node.next = null;
            return newHead;
        }

        // Floyd's cycle detection
        public boolean hasCycle() {
            Node<T> slow = head, fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) return true;
            }
            return false;
        }

        public T findMiddle() {
            if (head == null) return null;
            Node<T> slow = head, fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next; fast = fast.next.next;
            }
            return slow.val;
        }

        public T kthFromEnd(int k) {
            if (k < 0) throw new IllegalArgumentException();
            Node<T> a = head, b = head;
            for (int i = 0; i < k; i++) {
                if (b == null) return null;
                b = b.next;
            }
            while (b != null && b.next != null) { a = a.next; b = b.next; }
            return (b == null) ? null : a.val;
        }

        public void removeDuplicates() {
            Set<T> seen = new HashSet<>();
            Node<T> cur = head, prev = null;
            while (cur != null) {
                if (seen.contains(cur.val)) {
                    prev.next = cur.next; size--; cur = prev.next;
                } else {
                    seen.add(cur.val); prev = cur; cur = cur.next;
                }
            }
        }

        // Merge two sorted lists (returns new list)
        public static <E extends Comparable<E>> SinglyLinkedList<E> mergeSorted(SinglyLinkedList<E> a, SinglyLinkedList<E> b) {
            SinglyLinkedList<E> res = new SinglyLinkedList<>();
            Node<E> pa = a.head, pb = b.head, pt = null;
            while (pa != null || pb != null) {
                Node<E> pick;
                if (pb == null || (pa != null && pa.val.compareTo(pb.val) <= 0)) { pick = new Node<>(pa.val); pa = pa.next; }
                else { pick = new Node<>(pb.val); pb = pb.next; }
                if (res.head == null) { res.head = pick; pt = pick; }
                else { pt.next = pick; pt = pt.next; }
                res.size++;
            }
            return res;
        }

        // Merge sort for linked list
        public void sort() { head = mergeSort(head); }
        private Node<T> mergeSort(Node<T> node) {
            if (node == null || node.next == null) return node;
            Node<T> mid = getMiddleNode(node);
            Node<T> right = mid.next; mid.next = null;
            Node<T> left = mergeSort(node);
            right = mergeSort(right);
            return mergeTwo(left, right);
        }
        private Node<T> mergeTwo(Node<T> a, Node<T> b) {
            Node<T> dummy = new Node<>(null);
            Node<T> cur = dummy;
            while (a != null && b != null) {
                if (a.val.compareTo(b.val) <= 0) { cur.next = new Node<>(a.val); a = a.next; }
                else { cur.next = new Node<>(b.val); b = b.next; }
                cur = cur.next;
            }
            while (a != null) { cur.next = new Node<>(a.val); a = a.next; cur = cur.next; }
            while (b != null) { cur.next = new Node<>(b.val); b = b.next; cur = cur.next; }
            return dummy.next;
        }
        private Node<T> getMiddleNode(Node<T> node) {
            Node<T> slow = node, fast = node;
            while (fast.next != null && fast.next.next != null) { slow = slow.next; fast = fast.next.next; }
            return slow;
        }

        public List<T> toList() {
            List<T> out = new ArrayList<>();
            Node<T> cur = head;
            while (cur != null) { out.add(cur.val); cur = cur.next; }
            return out;
        }

        public void forEach(java.util.function.Consumer<T> c) {
            Node<T> cur = head;
            while (cur != null) { c.accept(cur.val); cur = cur.next; }
        }

        public String toString() { return toList().toString(); }
    }

    // Doubly linked list (core ops)
    public static class DoublyLinkedList<T> {
        private static class DNode<E> { E val; DNode<E> prev, next; DNode(E v){val=v;} }
        private DNode<T> head, tail; private int size=0;
        public void addFirst(T v){ DNode<T> n=new DNode<>(v); if(head==null){head=tail=n;} else{n.next=head; head.prev=n; head=n;} size++; }
        public void addLast(T v){ DNode<T> n=new DNode<>(v); if(tail==null){head=tail=n;} else{tail.next=n; n.prev=tail; tail=n;} size++; }
        public T removeFirst(){ if(head==null) return null; T v=head.val; head=head.next; if(head!=null) head.prev=null; else tail=null; size--; return v; }
        public T removeLast(){ if(tail==null) return null; T v=tail.val; tail=tail.prev; if(tail!=null) tail.next=null; else head=null; size--; return v; }
        public int size(){return size;} public boolean isEmpty(){return size==0;} public void clear(){head=tail=null; size=0;} 
        public String toString(){ List<T> out=new ArrayList<>(); for(DNode<T> cur=head;cur!=null;cur=cur.next) out.add(cur.val); return out.toString(); }
    }

    // Circular singly linked list (core ops)
    public static class CircularLinkedList<T> {
        private static class CNode<E>{E val; CNode<E> next; CNode(E v){val=v;}}
        private CNode<T> tail; private int size=0; // tail.next is head
        public void addFirst(T v){ CNode<T> n=new CNode<>(v); if(tail==null){ tail=n; tail.next=tail; } else { n.next = tail.next; tail.next = n; } size++; }
        public void addLast(T v){ addFirst(v); tail = tail.next; }
        public T removeFirst(){ if(tail==null) return null; CNode<T> head = tail.next; if(head==tail){ T v=head.val; tail=null; size--; return v; } T v=head.val; tail.next = head.next; size--; return v; }
        public int size(){return size;} public boolean isEmpty(){return size==0;} public String toString(){ List<T> out=new ArrayList<>(); if(tail!=null){ CNode<T> cur=tail.next; do{ out.add(cur.val); cur=cur.next;} while(cur!=tail.next); } return out.toString(); }
    }

    // Demo runner exercising many operations
    public static void main(String[] args) {
        System.out.println("--- SinglyLinkedList Demo ---");
        SinglyLinkedList<Integer> s = new SinglyLinkedList<>();
        s.addLast(3); s.addFirst(1); s.addAt(1, 2); s.addLast(4); s.addLast(5);
        System.out.println("Initial: " + s);
        s.removeAt(2);
        System.out.println("After removeAt(2): " + s);
        s.addAt(2, 10);
        System.out.println("After addAt(2,10): " + s);
        System.out.println("Contains 10? " + s.contains(10));
        System.out.println("Middle: " + s.findMiddle());
        System.out.println("Has cycle? " + s.hasCycle());
        s.reverseIterative();
        System.out.println("Reversed iterative: " + s);
        s.reverseRecursive();
        System.out.println("Reversed recursive (back): " + s);
        s.addLast(2); s.addLast(3); s.addLast(3);
        System.out.println("With duplicates: " + s);
        s.removeDuplicates();
        System.out.println("After removeDuplicates: " + s);
        System.out.println("Size: " + s.size());
        s.sort();
        System.out.println("Sorted: " + s);

        System.out.println("--- Merge two sorted lists ---");
        SinglyLinkedList<Integer> a = new SinglyLinkedList<>(); a.addLast(1); a.addLast(4); a.addLast(7);
        SinglyLinkedList<Integer> b = new SinglyLinkedList<>(); b.addLast(2); b.addLast(3); b.addLast(8);
        System.out.println("A: " + a + " B: " + b);
        SinglyLinkedList<Integer> m = SinglyLinkedList.mergeSorted(a, b);
        System.out.println("Merged: " + m);

        System.out.println("--- DoublyLinkedList Demo ---");
        DoublyLinkedList<String> d = new DoublyLinkedList<>(); d.addLast("a"); d.addFirst("z"); d.addLast("b");
        System.out.println(d + " size=" + d.size());
        d.removeFirst(); d.removeLast(); System.out.println("After removes: " + d + " size=" + d.size());

        System.out.println("--- CircularLinkedList Demo ---");
        CircularLinkedList<Character> c = new CircularLinkedList<>(); c.addLast('x'); c.addLast('y'); c.addLast('z');
        System.out.println("Circular: " + c + " size=" + c.size());
        c.removeFirst(); System.out.println("After removeFirst: " + c + " size=" + c.size());
        System.out.println("--- Quick tests complete ---");
    }
}