class Linked_List {
    Node head;
    int size;

    Linked_List(){ 
        this.head = new Node(5);  
        size = 0; 
    }  

    void addToBack(int data) {
        Node node = new Node(data);
        if (head == null)
            head = node;
        else {
            Node n = head;
            while (n.next != null)
                n = n.next;
            n.next = node;
        }
    }


    void addToFront(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    
    void addMiddle(int index, int data) {
        Node node = new Node(data);
        if (index == 1) {
            addToFront(data);
        } else {
            Node n = head;
            for (int i = 1; i < index - 1; i++) {
                if (n != null) {
                    n = n.next;
                }
            }
            if (n != null) {
                node.next = n.next;
                n.next = node;
            }
        }
    }

  
    void removeFromFront() {
        if (head != null) {
            head = head.next;
        }
    }

   
    void removeFromBack() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }
        Node n = head;
        while (n.next.next != null){
            n = n.next;
        }
            n.next = null;
    }

    void removeAt(int index) {
        if (index == 1) {
            removeFromFront();
        } else {
            Node n = head;
            for (int i = 1; i < index - 1; i++) {
                if (n != null) {
                    n = n.next;
                }
            }
            if (n != null && n.next != null) {
                n.next = n.next.next;
            }
        }
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

    
    boolean SearchNode(int value){
        
        if(head==null){
            System.out.println("List is Empty");
            return false;
        }
        else  {
            Node temp = head;
            while(temp!=null){
                if(temp.data==value){
                System.out.println("Value Found!" + value);
                return true;
            }
            temp = temp.next;
            }}
            
            System.out.println("Value Not Found!");
            return false;
        
        }
    int FindLength(){
        int count = 1;
        if(head==null){
            System.out.println("List is Empty");
            return 1;
        }
        else {
            Node temp = head;
            while(temp.next!=null){
               count++;
               temp=temp.next;
            }
            return count;
        }
        
    }
}
