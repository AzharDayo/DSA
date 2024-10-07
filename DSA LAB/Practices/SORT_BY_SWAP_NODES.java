public class SORT_BY_SWAP_NODES {
    void SWAP_NODES (Node head ){
        
        if(head==null){
            System.out.println("Linked List Empty");
        }
        else {
            Node temp = head;
            while(temp.next==null){
                if(temp.data>temp.next.data){
                    Node t1 = temp.next;
                    temp=temp.next.next;
                    t1.next=temp;
                }
            }
        }

    }
}
class Main{
    public static void main(String[] args) {
        Linked_List1 l1 = new Linked_List1();
        SORT_BY_SWAP_NODES s1 = new SORT_BY_SWAP_NODES();

        l1.addF(10);
        l1.addToBack(20);
        l1.addToBack(15);
        l1.addToBack(12);

        l1.print();
    }
}

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
