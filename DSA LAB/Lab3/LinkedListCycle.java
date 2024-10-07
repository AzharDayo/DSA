class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListCycle {

    public boolean CheckCycle(Node head) {
        if (head == null) {
            return false;
        }
        
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;         
            fast = fast.next.next;     

            if (slow == fast) {
                return true;  
            }
        }
        
        return false;  
    }
    public static void main(String[] args) {
        LinkedListCycle detector = new LinkedListCycle();

        //cant written add method so that
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next; 

        System.out.println("Cycle detected: " + detector.CheckCycle(head));
    }
}
