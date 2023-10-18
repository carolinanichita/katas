package linkedlists;

public class LLWithTailOper<T> {
    public class Node {
        public T data;
        public Node nextNode;
        public Node prevNode;
    }

    public Node headNode;
    public Node tailNode;
    public int size;

    public LLWithTailOper() {
        this.headNode = null;
        this.tailNode = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        if (headNode == null && tailNode == null)
            return true;
        return false;
    }

    public Node getHeadNode() {
        return headNode;
    }

    public Node getTailNode() {
        return tailNode;
    }

    public int getSize() {
        return size;
    }

    public void insertAtHead(T data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = this.headNode;
        newNode.prevNode = null;
        if (!isEmpty())
            headNode.prevNode = newNode;
        else
            tailNode = newNode;
        this.headNode = newNode;
        size++;
    }

    public void insertAtEnd(T data) {
        if (isEmpty()) {
            insertAtHead(data);
            return;
        }
        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = null;
        newNode.prevNode = tailNode;
        tailNode.nextNode = newNode;
        tailNode = newNode;
        size++;
    }

    public void printList() {
        if (isEmpty()) {
            System.out.println("List is Empty!");
            return;
        }

        Node temp = headNode;
        System.out.print("List : null <- ");

        while (temp.nextNode != null) {
            System.out.print(temp.data.toString() + " <-> ");
            temp = temp.nextNode;
        }

        System.out.println(temp.data.toString() + " -> null");
    }

    public static void main(String[] args) {
        DoublyLinkedListOperations<Integer> list = new DoublyLinkedListOperations<Integer>();
        for (int i = 0; i <= 5; i++) {
            list.insertAtHead(i);
        }
        System.out.println("List after inserting from 0 to 5: ");
        list.printList();

//        for (int i = 7; i <= 12; i++) {
//            list.insertAtEnd(i);
//        }
        System.out.println("List after inserting from 7 to 12 at the end");
        list.printList();

    }
}
