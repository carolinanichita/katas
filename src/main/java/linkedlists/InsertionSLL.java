package linkedlists;

public class InsertionSLL<T> {
        public class Node {
            public T data;
            public Node next;
            public Node prev;
        }

        public Node headNode;
        int size;
        public InsertionSLL() {
            this.headNode = null;
            this.size = 0;
        }

    public Node getHeadNode() {
        return headNode;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
            if (headNode == null) {
                return true;
            }
            return false;
        }

        public void insertAtHead(T data) {
            Node newNode = new Node();
            newNode.data = data;
            newNode.next = headNode;
            headNode = newNode;
            size++;
        }
        public void insertAtEnd(T data) {
                if (isEmpty()) {
                    insertAtHead(data);
                    return;
                }

                Node newNode = new Node();
                newNode.data = data;
                newNode.next = null;

                Node last = headNode;
                while (last.next != null) {
                    last = last.next;
                }
                last.next = newNode;
                size++;
        }

        public void printList() {
            if (isEmpty()) {
                System.out.println("List is empty");
                return;
            }

            Node newNode = headNode;
            while (newNode.next != null) {
                System.out.println(newNode.data.toString() + " --> ");
                newNode = newNode.next;
            }
            System.out.println(newNode.data.toString() + " --> null");
        }

    public static void main(String[] args) {
        InsertionSLL<Integer> list = new InsertionSLL<Integer>();
        for (int i = 0; i < 5; i++) {
            list.insertAtHead(i);
        }
        System.out.println("List after inserting at head from 0 to 5");
        list.printList();

        for (int i = 6; i < 9; i++) {
            list.insertAtEnd(i);
        }

        System.out.println("List after inserting at end from 6 to 9");
        list.printList();
    }
}
