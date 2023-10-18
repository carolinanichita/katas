//import java.util.*;

package linkedlists;

public class DoublyLinkedListOperations<T> {

    public class Node {
        public T data;
        public Node nextNode;
        public Node prevNode;
    }

    public Node headNode;
    public int size;

    public DoublyLinkedListOperations() {
        this.headNode = null;
    }

    public boolean isEmpty() {
        if (headNode == null)
            return true; //is empty
        return false;    //is not empty
    }

    public void insertAtHead(T data) {
        //create node and put in the data
        Node newNode = new Node();
        newNode.data = data;
        // Make next of new node as head and previous as NULL
        newNode.nextNode = this.headNode;
        newNode.prevNode = null;
        //Change previous of head node to new node
        if (headNode != null)
            headNode.prevNode = newNode;
        this.headNode = newNode;
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
    public void deleteAtHead(){
        //if list is empty do nothing
        if(isEmpty())
            return;

        headNode = headNode.nextNode;
        headNode.prevNode = null;
        size--;
    }
    public void deleteByValue(T data) {
        if (isEmpty())
            return;

        Node currentNode = this.headNode;

        if (currentNode.data.equals(data)) {
            deleteAtHead();
            return;
        }
        while (currentNode != null) {
            if (data.equals(currentNode.data)) {
                currentNode.prevNode.nextNode = currentNode.nextNode;
                if(currentNode.nextNode != null)
                    currentNode.nextNode.prevNode = currentNode.prevNode;
                size--;
            }
            currentNode = currentNode.nextNode;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedListOperations<Integer> dll = new DoublyLinkedListOperations<>();
        for (int i = 1; i <= 10; i++) {
            dll.insertAtHead(i);
        }
        System.out.print("Original ");
        dll.printList();
        System.out.print("After deleting 10 ");
        dll.deleteByValue(10);
        dll.printList();
        System.out.print("After deleting 1 ");
        dll.deleteByValue(1);
        dll.printList();
        System.out.print("After deleting 5 ");
        dll.deleteByValue(5);
        dll.printList();
    }
}

