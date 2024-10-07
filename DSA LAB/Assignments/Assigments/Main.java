class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class Genric_LinkedList<T> {
     Node<T> head;
     int size;

    Genric_LinkedList() {
        this.head = null;
        this.size = 0;
    }

    void addToBack(T data) {
        Node<T> node = new Node<>(data);
        if (head == null) {
            head = node;
        } else {
            Node<T> n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
        size++;
    }

    void addToFront(T data) {
        Node<T> node = new Node<>(data);
        node.next = head;
        head = node;
        size++;
    }

    void removeFromFront() {
        if (head != null) {
            head = head.next;
            size--;
        }
    }

    void removeFromBack() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
        } else {
            Node<T> n = head;
            while (n.next.next != null) {
                n = n.next;
            }
            n.next = null;
        }
        size--;
    }

    boolean isEmpty() {
        return head == null;
    }

    void printList() {
        Node<T> node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Genric_LinkedList<Integer> integerList = new Genric_LinkedList<>();
        integerList.addToBack(10);
        integerList.addToFront(5);
        integerList.printList();

        integerList.removeFromBack();
        integerList.printList();

        integerList.removeFromFront();
        integerList.printList();

        System.out.println("Is list empty? " + integerList.isEmpty());

        Genric_LinkedList<String> stringList = new Genric_LinkedList<>();
        stringList.addToBack("Hello");
        stringList.addToFront("World");
        stringList.printList();
    }
}
