class QueueUsingTwoStacks {
    StackUsingLinkedList s1, s2;

    QueueUsingTwoStacks() {
        s1 = new StackUsingLinkedList();
        s2 = new StackUsingLinkedList();
    }

    public void enqueue(int data) {
        s1.push(data);
    }

    public int dequeue() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        if (s2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return s2.pop();
    }

    public static void main(String[] args) {
        int[] keys = {1, 2, 3, 4, 5};
        QueueUsingTwoStacks q = new QueueUsingTwoStacks();

        for (int key : keys) {
            System.out.println("Inserted "+key);
            q.enqueue(key);
        }

        System.out.println("Removed "+q.dequeue());
        System.out.println("Removed "+q.dequeue()); 
    }
}