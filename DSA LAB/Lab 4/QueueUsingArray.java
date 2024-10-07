class QueueUsingArray
{
 private int arr[];
 private int front;
 private int rear;
 private int count;
 // Constructor to initialize queue
 QueueUsingArray(int cap)
 {
 arr = new int[cap];
 front = 0;
 rear = 0;
 count = 0;
 }
 // Utility function to remove front element from the queueand check for Queue Underflow
 public void dequeue()
 {
    if(count==0){
        System.out.println("Queue Is Empty");
    }
    else{
        System.out.println("Removed "+arr[front]);
        count--;
        arr[(front++)%(arr.length)]=0;
    }
 }
 
 public void enqueue(int item)
{  
    System.out.println("Inserted "+item);
    count++;
    arr[(rear++)%(arr.length)]=item;
}

 public int peek()
 {
    return arr[front];
 }
 // Utility function to return the size of the queue
 public int size()
 {
     return count;
 }
 // Utility function to check if the queue is empty or not
 public Boolean isEmpty()
 {
    return count<arr.length;
 }
 // Utility function to check if the queue is empty or not
 public Boolean isFull()
 {
    return count==arr.length;
 }
}


class Main
{
 // main function
 public static void main (String[] args)
 {
 // create a queue of capacity 5
 QueueUsingArray q = new QueueUsingArray(5);
 q.enqueue(1);
 q.enqueue(2);
 q.enqueue(3);
 System.out.println("Front element is: " + q.peek());
 q.dequeue();
 System.out.println("Front element is: " + q.peek());
 System.out.println("Queue size is " + q.size());
 q.dequeue();
 System.out.println("Front element is: " + q.peek());
 q.dequeue();
 if (q.isEmpty())
 System.out.println("Queue Is Empty");
 else
 System.out.println("Queue Is Not Empty");
 }
}