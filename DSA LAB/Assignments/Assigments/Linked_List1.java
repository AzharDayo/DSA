
class Linked_List1 {
    int size=0;
    Node head;
    

    Linked_List1(){ 
     
       head=null; 
         
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
        size++;
    }
    void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print("Null");
    }
     int nthFromLast(int n){
        if(head==null){
            System.out.println("List is Empty!");
            return 0;
        }
        else{
            Node temp = head;
            for(int i = size ; i!=n ; i--){
                temp=temp.next;
            }
            return temp.data;
    }
    }

        public void sort() {
            if (size > 1) {
                for (int i = 0; i < size - 1; i++) {
                    Node currentNode = head;
                    Node previous = null;
        
                    while (currentNode != null && currentNode.next != null) {
                        Node nextNode = currentNode.next;
        
                        if (currentNode.data > nextNode.data) {

                            currentNode.next = nextNode.next;
                            nextNode.next = currentNode;
        
                            if (previous != null) {
                                previous.next = nextNode;
                            } else {
                                head = nextNode;
                            }
        
                            previous = nextNode;
                        } else {
                            previous = currentNode;
                            currentNode = currentNode.next;
                        }
                    }
                }
            }
        }
        void addF(int data){
            Node  newnode = new Node(data);
            if(head==null){
                head = newnode;
            }
            else {
                newnode.next=head;
                head=newnode;
                    
            }
            size++;
        }
    
    
    
    Linked_List1 reverse(){

    Linked_List1 reverse = new Linked_List1();
    if(head==null){
        System.out.println("List is Empty!");
    }
    else {
        Node temp = head;
        while(temp!=null){
            reverse.addF(temp.data);
            temp=temp.next;
        }
        
    }
    return reverse;
}

        void CheckDup(){
            if(head==null){
                System.out.println("List is Empty!");
                return;
            }
            else{
            Node current = head;

            while (current != null) {
                Node runner = current;
    
                
                while (runner.next != null) {
                    if (runner.next.data == current.data) {
                      
                        runner.next = runner.next.next;
                    } else {
                        runner = runner.next;
                    }
                }
    
                current = current.next;
            }
        }
        }
}

class Node{
    int data ;
    Node next;

    Node(int data){
        this.data=data;
        next=null;
    }
}
// class Main{
//     public static void main(String[] args) {
//         Linked_List1 ll = new Linked_List1();
        
//         Linked_List1 l2 = new Linked_List1();
//         int n=2;
//         ll.addToBack(50);
//         ll.addToBack(40);
//         ll.addToBack(30);
//         ll.addToBack(20);
//         ll.addToBack(10);
        
        
       
//         ll.print();
//         System.out.println();
//         System.out.println("Return "+n+" Element From last : "+ll.nthFromLast(n)+"\n");
//         System.out.println("Sorted Linked List");
//         ll.sort();
//         ll.print();
//         System.out.println();
//         System.out.println("After reversed Method.");
//        l2= ll.reverse();
//         l2.print();
//         ll.addToBack(10);

//         System.out.println("\n\nList Before Check Duplicate data");
//         ll.print();
//         System.out.println("\nList After Check Duplicate method");
//         ll.CheckDup();
//         ll.print();

//     }
// }