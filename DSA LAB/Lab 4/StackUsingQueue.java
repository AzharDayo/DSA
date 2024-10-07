public class StackUsingQueue {
    private QueueUsingLinkedList Q1, Q2;

    public StackUsingQueue() {
        Q1 = new QueueUsingLinkedList();
        Q2 = new QueueUsingLinkedList();
    }

    public void Push(int data) {
        Q1.enqueue(data);
    }

    public int Pop() {
        if (Q1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

       
        while (Q1.size() > 1) {
            Q2.enqueue(Q1.dequeue());
        }

        
        int topElement = Q1.dequeue();

        
        QueueUsingLinkedList temp = Q1;
        Q1 = Q2;
        Q2 = temp;

        return topElement;
    }

    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();

        stack.Push(1);
        stack.Push(2);
        stack.Push(3);
        stack.Push(4);
        stack.Push(5);

        System.out.println(stack.Pop()); // 5
        System.out.println(stack.Pop()); // 4
        System.out.println(stack.Pop()); // 3
        System.out.println(stack.Pop()); // 2
        System.out.println(stack.Pop()); // 1

        
    }
}
class QueueUsingLinkedList {
    private Node front, rear;
    private int size;

    private static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public QueueUsingLinkedList() {
        this.front = this.rear = null;
        this.size = 0;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        int data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}