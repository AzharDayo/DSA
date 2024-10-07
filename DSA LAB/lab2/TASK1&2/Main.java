class Main {
    public static void main(String[] args) {
        
            Linked_List ll = new Linked_List();
            ll.addToFront(10);
            ll.addToBack(5);
            ll.addToBack(7);
            ll.addToFront(3);
            ll.printList();
            
            ll.SearchNode(4);
            System.out.println("Length : "+ll.FindLength());

            ll.addMiddle(3,900); 
            ll.printList(); 
            System.out.println(""); 
            ll.addToFront(20); 
            ll.printList(); 
            System.out.println(""); 
            ll.addMiddle(2,200); 
            ll.printList(); 
            System.out.println(""); 
            ll.removeFromFront(); 
            ll.printList(); 
            
    }
}