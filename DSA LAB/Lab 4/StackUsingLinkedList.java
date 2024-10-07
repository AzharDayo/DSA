// Define Node class
class Node {
    int data;
    Node next;

    public Node() {
        this.data = 0;
        this.next = null;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Implement Stack using Linked List
class StackUsingLinkedList {
    private Node top;

    public StackUsingLinkedList() {
        this.top = null;
    }

    // Utility function to add an element x in the stack
    public int push(int x) {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
        return x;
    }

    // Utility function to check if the stack is empty or not
    public boolean isEmpty() {
        if (top == null) {
            return true;
        } else {
            
            return false;
        }
    }

    // Utility function to return top element in a stack
    public int top() {
        if (top == null) {
            return -1;
        }
        return top.data;
    }

    // Utility function to remove top element from the stack
    public int pop() {
        if (top == null) {
            return 0;
        }
        else{
        int k = top.data;
        top = top.next;
        return k;
    }
}
}
// Test Stack implementa
 class StackImpl {
    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        System.out.println("inserted "+stack.push(1));
        System.out.println("inserted "+stack.push(2));
        System.out.println("inserted "+stack.push(3));
     
        
        if(stack.top()!=-1){
        System.out.println("Top element is " + stack.top());}
        else{
            System.out.println("Stack is Empty");
        }

        int d1 = stack.pop();
        if(d1==0){
            System.out.println("Stack Empty");
        }
        else{
        System.out.println("Removed "+d1);
        }
        int d2 = stack.pop();
        if(d2==0){
            System.out.println("Stack Empty");
        }
        else{
        System.out.println("Removed "+d2);
            }
        int d3 = stack.pop();
        if(d3==0){
        System.out.println("Stack Empty");
        }
        else{
        System.out.println("Removed "+d3);
        } 
        // Test pop on empty stack
        int d4 = stack.pop();
        if(d4==0){
            System.out.println("Stack Empty");
        }
        else{
        System.out.println("Removed "+d4);
        } 

        if(stack.isEmpty()){
            System.out.println("Stack Empty");
        }
        else{
            System.out.println("Stack is not empty");
        }


    }
}