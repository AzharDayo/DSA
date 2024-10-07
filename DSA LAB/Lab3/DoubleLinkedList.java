class Node {
    String name;
    Node prev, next;

    Node(String name) {
        this.name = name;
        this.prev = null;
        this.next = null;
    }
}
public class DoubleLinkedList {
    Node head;

    
    public void insertAtBeginning(String name) {
        Node n1 = new Node(name);
        if (head == null) {
            head = n1;
        } else {
            n1.next=head;
            head.prev=n1;
            head=n1;           
        }
        head.prev=null;
    }
    public void insertAtBeginning(Node node){
        if (head == null){
            head=node;
        }
        else{
            node.next=head;
            head.prev=node;
            head=node;
        }
    }

    
    public void insertAtEnd(String name) {
        Node n1 = new Node(name);
        if (head == null) {
            head = n1;
        } else {
            Node temp = head;  
            while(temp.next!=null){
                temp=temp.next;
            }  
            temp.next=n1;
            n1.prev=temp;
        }
    }
    public void insertAtEnd(Node node){
        if (head == null) {
            head = node;
            head.prev=null;
        } else {
            Node temp = head;  
            while(temp.next!=null){
                temp=temp.next;
            }  
            temp.next=node;
            node.prev=temp;
            node.next=null;
        }
    }
    
         void insertBeforeName(String name, Node node){
        if(head==null){
            System.out.println("There is No any element");
        }
        else{
            Node temp = head;
            while (temp != null && !temp.name.equals(name)){
               temp=temp.next;
            }
            if(temp.name==null){
                System.out.println("Element Not Found.");
            }
            else{
                Node PreTemp = temp.prev;
                PreTemp.next = node;
                node.prev = PreTemp;
                node.next = temp;
                temp.prev = node;
            }   }}

    public void insertAfterName(String name, Node node) {
        if (head == null) {
            System.out.println("There is no element in the list.");
            return;
        }
    
        Node temp = head;
        while (temp != null && !temp.name.equals(name)) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Node with name " + name + " not found.");
            return;
        }
        if (node.prev != null || node.next != null) {
            System.out.println("The node to insert is already part of the list.");
            return;
        }
        node.next = temp.next;
        node.prev = temp;       
        if (temp.next != null) {
            temp.next.prev = node; 
        }
        temp.next = node;  
    }
    public void makeCircular() {
        if (head != null) {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = head;  
            head.prev = temp;  
        }
    }
    public void printAll() {
        if (head == null) {
            System.out.println("List Empty!");
        } else {
            Node temp = head;
            while(temp!=null){
                System.out.print("-->"+temp.name);
                temp=temp.next;
            }
            System.out.println();  }
    }

    public static void main(String[] args) {
        DoubleLinkedList D1 = new DoubleLinkedList();
        Node node = new Node("Azhar1");
        Node node2 = new Node("Azhar2");
        Node node3 = new Node("Azhar3");
        Node node4 = new Node("Azhar4");
        D1.insertAtBeginning("Ali");
        D1.insertAtBeginning("Ahmed");
        D1.insertAtEnd("Sara");
        D1.insertAtEnd("Hyder");
        D1.insertAtBeginning("Khan");
        D1.insertAtBeginning(node);
        D1.insertAtEnd(node2);
        D1.insertAfterName("Khan",node3);
        D1.insertBeforeName("Ali", node4);
        D1.printAll();  
    }
}
