package linkedlists;

public class ReverseLL<T> {
    public class Node {
        public T data;
        public Node next;
    }

    public Node head;
    public int size;

    public ReverseLL() {
        this.head = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    public  void insertAtHead(T data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void insertAtEnd(T data) {
        if (isEmpty()) {
            insertAtHead(data);
        }

        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        size++;
    }

    public void insertAfter(T data, T previous) {
        Node newNode = new Node();
        newNode.data = data;

        Node currentNode = this.head;
        while (currentNode != null && currentNode.data != previous) {
            currentNode = currentNode.next;
        }

        if (currentNode != null) {
            newNode.next = currentNode.next;
            currentNode.next = newNode;
            size++;
        }
    }

    public boolean searchNode(T data) {
        Node currentNode = this.head;

        while (currentNode != null) {
            if (currentNode.data.equals(data)) {
                return true;

            }
            currentNode = currentNode.next;
        }
            return false;
    }

    public void deleteAtHead(T data) {
        if (isEmpty()) return;

        head = head.next;
        size--;
    }

    public void deleteByValue(T data) {
        if (isEmpty()) return;

        Node currentNode = this.head;
        Node prevNode = null;

        if (currentNode.data.equals(data)) {
            deleteAtHead(data);
        }

        while (currentNode != null) {
            if (data.equals(currentNode.data)) {
                prevNode.next = currentNode.next;
                size--;
            }
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
    }

    public void printList() {
        if (isEmpty()) {
            System.out.println("List is Empty!");
            return;
        }

        Node temp = head;
        System.out.print("List : ");

        while (temp.next != null) {
            System.out.print(temp.data.toString() + " -> ");
            temp = temp.next;
        }

        System.out.println(temp.data.toString() + " -> null");
    }

    public static <T> void reverse(ReverseLL<T> list) {
        ReverseLL<T>.Node previous = null;
        ReverseLL<T>.Node current = list.head;
        ReverseLL<T>.Node next = null;

        while(current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        list.head = previous;
    }

    public static  void main(String[] args) {
        ReverseLL<Integer> list = new ReverseLL<Integer>();

        for (int i = 0; i < 27; i+=3) {
            System.out.println("before: ");
            list.insertAtHead(i);
            list.printList();

            System.out.println("after: ");
            reverse(list);
            list.printList();
        }
    }
}
