class Linked_ListOf3 implements List {
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = new Node(null);  // Dummy node
    int size = 0; 

    @Override
    public boolean isEmpty() {
        return size == 0;  // Check size instead of head for dummy node
    }

    @Override
    public int size() {
        return size; 
    }

    @Override
    public void add(String item) {
        Node newNode = new Node(item); 
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode; 
        size++; 
    }

    @Override
    public void add(int index, String item) {
        if (index < 1 || index > size + 1) {
            System.out.println("Index should be less than or equal to the list size and greater than 0.");
            return; 
        }

        Node newNode = new Node(item); 
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next; 
        }
        newNode.next = temp.next; 
        temp.next = newNode; 
        size++; 
    }

    @Override
    public void remove(int index) {
        if (index < 1 || index > size) { 
            System.out.println("Index should be less than or equal to the list size and greater than 0.");
            return; 
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next; 
        }
        temp.next = temp.next.next; 
        size--; 
    }

    @Override
    public void remove(String item) {
        Node temp = head;

        while (temp.next != null && !temp.next.data.equals(item)) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Item not found!");
        } else {
            temp.next = temp.next.next;
            size--;
        }
    }

    void printList() {
        if (isEmpty()) {
            System.out.println("List is Empty!"); 
            return;
        } else {
            Node temp = head.next; // Skip dummy node
            System.out.print("[Size:" + size() + "-");
            while (temp != null) { 
                System.out.print(temp.data + ","); 
                temp = temp.next;
            }
            System.out.print("]");
        }
    }

    public Linked_ListOf3 duplicate() {
        Linked_ListOf3 duplicateList = new Linked_ListOf3();
        Node current = head.next;  // Skip dummy node
        
        while (current != null) {
            duplicateList.add(current.data); 
            current = current.next;
        }
        
        return duplicateList;
    }

    @Override
    public Linked_ListOf3 duplicateReversed() {
        Linked_ListOf3 reversedList = new Linked_ListOf3();
        Node current = head.next;  // Skip dummy node
        
        while (current != null) {
            Node newNode = new Node(current.data);
            newNode.next = reversedList.head.next;
            reversedList.head.next = newNode;
            current = current.next;
        }
        
        return reversedList;
    }

    public static void main(String[] args) {
        Linked_ListOf3 LL = new Linked_ListOf3();
        LL.add("This");
        LL.add("Is");
        LL.add("list");
        System.out.println("Original list:");
        LL.printList(); 
        LL.add(3, "Java");
        System.out.println("\nList after adding 'Java' at index 3:");
        LL.printList(); 
        LL.remove("Is");
        System.out.println("\nList after removing 'Is':");
        LL.printList();
        Linked_ListOf3 duplicateList = LL.duplicate();
        System.out.println("\nDuplicate list:");
        duplicateList.printList();
        Linked_ListOf3 reversedList = LL.duplicateReversed();
        System.out.println("\nReversed duplicate list:");
        reversedList.printList();
        LL.remove("is");
        System.out.println("\nList after attempting to remove 'is':");
        LL.printList(); 
        LL.add(3, "Error");
        System.out.println("\nList after attempting to add 'Error' at index 3:");
        LL.printList();
    }
}
