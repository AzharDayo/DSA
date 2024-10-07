class StackUsingArray
{
 private int arr[];
 private int top;
 private int capacity;
 int size;

 StackUsingArray(int cap)
 {
capacity=cap;
 arr = new int[capacity];
 top = -1;
 size=0;
 }
 
 public void push(int x)
 {
    if(!isFull()){
        arr[++top]=x;
        size++;
        System.out.println("Inserted "+x);
    }
    else{
        System.out.println("Stack OverFlow");
        
    }
 }
 // Utility function to pop top element from the stack and
//check for stack underflow
 public int pop()
 {
    if(isEmpty()){
        System.out.println("Stack is Empty");
        return 0;
    }
    else {
      System.out.println("Removed "+arr[top]);
        size--;
        return arr[top--];
    }
   
 }
 // Utility function to return top element in a stack
 public int top()
 {
    return arr[top];
 }
 // Utility function to return the size of the stack
 public int size()
 {
    return size;
 }
 // Utility function to check if the stack is empty or not 
 public Boolean isEmpty()
 {
    return size==0;
 }
 // Utility function to check if the stack is full or not
 public Boolean isFull()
 {
    return (size==capacity);
 }
 public static void main (String[] args)
 {
 StackUsingArray stack = new StackUsingArray(3);
 stack.push(1); // Inserting 1 in the stack
 stack.push(2); // Inserting 2 in the stack
 stack.pop(); // removing the top 2
 stack.pop(); // removing the top 1
 stack.push(3); // Inserting 3 in the stack
 System.out.println("Top element is: " + stack.top());
 System.out.println("Stack size is " + stack.size());
 stack.pop(); // removing the top 3
 // check if stack is empty
 if (stack.isEmpty())
 System.out.println("Stack Is Empty");
 else
 System.out.println("Stack Is Not Empty");
}
}