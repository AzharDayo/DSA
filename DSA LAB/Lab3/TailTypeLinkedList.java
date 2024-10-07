class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class TailTypeLinkedList {
    Node head;
    Node tail;
    int size;

    void addToBack(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    void addToFront(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = node;
        }
        size++;
    }

    void removeFromFront() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
    }
    void removeFromBack() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            tail = null;
        } else {
            Node n = head;
            while (n.next.next != null) {
                n = n.next;
            }
            n.next = null;
            tail = n;
        }
        size--;
    }
    boolean isEmpty() {
        return head == null;
    }

    void printList() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        TailTypeLinkedList T1 = new TailTypeLinkedList();
        T1.addToFront(10);
        T1.addToBack(30);
        T1.addToBack(40);
        T1.addToBack(20);
        T1.printList();
        
        T1.removeFromFront();
        T1.removeFromBack();
        T1.printList();
        
        T1.removeFromFront();
        T1.removeFromBack();
        T1.printList();
    }
}
