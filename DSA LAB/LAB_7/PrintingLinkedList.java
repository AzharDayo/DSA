class PrintingLinkedList {
     Node head; 

    
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; 
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode; 
        }
    }

    
    public void ItreativePrint() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next; 
        }
        System.out.println();
    }

    public void RecursivePrint(Node node){
        if(node==null){
            return;
        }
        else {
            System.out.print(node.data+" ");
            RecursivePrint(node.next);
        }
    }
    
}

class main {
    public static void main(String[] args) {
        PrintingLinkedList list = new PrintingLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);


        System.out.println("Print linked list With Recursive Approch :");
        long startTime = System.nanoTime();	//record the starting time 
        list.RecursivePrint(list.head);
        long endTime  = System.nanoTime();	//record the ending time 
        long totalTime = endTime - startTime;

        System.out.println("Print linked list With itreative Approch :");
        long startTime2 = System.nanoTime();
        list.ItreativePrint(); 
        long endTime2   = System.nanoTime();	//record the ending time 
        long totalTime2 = endTime2 - startTime2;
        

        if(totalTime>totalTime2){
            System.out.println("Itreative Approch is better ");
        }
        else if (totalTime<totalTime2){
            System.out.println("Recursive Approch is better ");
        }
        else {
            System.out.println("Both Are taken Same time.");
        }
        
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}