// class QueueUsingLinkedList{
//      Node rear = null, front = null;
//      int size = 0;

//     // Utility function to remove front element from the queue and check for Queue Underflow
// public int dequeue() 
// {   if(front==null){
//     System.out.println("Queue UnderFlow");
//     return-1;
//     }   
//     int k = front.data;
//     front=front.next;
//     System.out.println("Removed "+k);
//     size--;
//     return k;
// }
// // Utility function to add an item in the queue
// public void enqueue(int item)
// {   
//     Node temp = new Node(item);
//     if(front==null && rear==null){
//         rear=temp;
//         front=temp;
//     }
// else{

//     rear.next=temp;
//     rear=temp;  
//     }
//     System.out.println("Inserted "+item);
//     size++;
// }
// // Utility function to return top element in a queue
// public  int peek()
// {
//     if(front==null){
//         System.out.println("QUEUE EMPTY");
//         return 0;
//     }
//     else{
//     return front.data;
//     }}
//     // Utility function to check if the queue is empty or not
//     public  boolean isEmpty()
//     {
       
//    return front==null;
//     }
//     int size(){
//         return size;
//     }

// public static void main(String[] args)
// {
// QueueUsingLinkedList q = new QueueUsingLinkedList();
// q.enqueue(1);
// q.enqueue(2);
// q.enqueue(3);
// q.enqueue(4);
// System.out.printf("Front element is %d\n", q.peek());
// q.dequeue();
// q.dequeue();
// q.dequeue();
// q.dequeue();
// if (q.isEmpty()) {
// System.out.println("Queue is empty");
// } else {
// System.out.println("Queue is not empty");
// }
// }
// }

// class Node
// {
// int data;
// Node next;

// public Node(int data)
// {

// this.data = data;
// this.next = null;
// }
// }

