import java.util.HashSet;
import java.util.Set;

public class LinkedList {

    private Node head = null;
    private Node tail = null;
    private int size = 0;

    // Node element of the linked list
    public class Node {
        int value;
        Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    public Node head() {return head;}
    public Node tail() {return tail;}
    public int size() {return size;}

    // Constructor - Initialize the linked list with an array of integers
    public LinkedList(int[] nums) { 
        addHead(nums[0]);
        for (int i=1; i<nums.length; i++) {
            addTail(nums[i]);
        }
        
    }
    
    // Append a node to the beginning of the linked list (head)
    public void addHead(int value) {
        head = new Node(value, head);
        if (size == 0) {
            tail = head;
        }
        size++;
    }

    // Append a node to the end of the linked list (tail)
    public void addTail(int value) {
        Node newest = new Node(value, null);
        if (size==0) {
            head = newest;
        } else {
            tail.next = newest;
        }
        tail = newest;
        size++;
    }

    // Format the linked list as a string (1 -> 2 -> 3 -> null)
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node p = head;

        while (p.next != null) {
            sb.append(p.value + " -> ");
            p = p.next;
        }
        sb.append(p.value);
        return sb.toString();
    }

    // Recursive approach is probaby not the best way to do this,
    // Using a HashSet to track values is more optimal
    // Remove duplicates from the linked list, starting at the node passed in the parameter
    public void removeDuplicates(Node curr) {
        if (curr == null) {
            return;
        }

        Set<Integer> listValues = new HashSet<>();
        listValues.add(curr.value);

        while (curr.next != null) {
            if (listValues.contains(curr.next.value)) {
                // Duplicate is found - remove node & update size
                curr.next = curr.next.next;
                size--;
            } else {
                // Unique # - Add to set 
                listValues.add(curr.value);
                curr = curr.next;
            }
        }

    }

}


