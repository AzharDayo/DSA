class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Linked_List {
     Node head;
     int size;

    public Linked_List() {
        this.head = null;
        this.size = 0;
    }

    public void addFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addBack(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void removeFront() {
        if (head == null) return; // List is empty
        head = head.next;         // Move head to the next node
        size--;                   // Decrement size
    }
    
    public void removeBack() {
        if (head == null) return; // List is empty
        if (head.next == null) {  // Only one element
            head = null;          // Set head to null
            size--;               // Decrement size
            return;
        }
    
        Node current = head;
        while (current.next.next != null) { // Traverse to the second last node
            current = current.next;
        }
        current.next = null;                  // Remove the last node
        size--;                               // Decrement size
    }
    
    public void printList() {
        Node current = head;                 
        while (current != null) {             
            System.out.print(current.data + " "); 
            current = current.next;           
        }
        System.out.println();                 
    }
    
    public int getSize() {
        return size;
    }

    
    void Reverse(){
        if(head==null) System.out.println("List Empty!");

        else{
            Node prev = null;
            Node curr = head;
            Node next = null;
            while (curr!=null) {
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head=prev;

        }
    }

    void printRev(){
        Node current = head; 
        Linked_List temp = new Linked_List();
        while (current!= null) {             
            temp.addFront(current.data);
            
            current = current.next;           
        }
        temp.printList();
    }
}
class Main1{
        
    public static void main(String[] args) {
        Linked_List ll = new Linked_List();
        ll.addBack(1);
        ll.addBack(2);
        ll.addFront(3);
        ll.addBack(4);
        ll.addBack(5);
        ll.addFront(6);
        System.out.println("Print Original");
        ll.printList();  
        System.out.println("Print Reverse");
        ll.printRev();
        System.out.println("Reverse Linked_List");
        ll.Reverse();
        ll.printList();
        System.out.println("Size: " + ll.getSize());  
    }
}
