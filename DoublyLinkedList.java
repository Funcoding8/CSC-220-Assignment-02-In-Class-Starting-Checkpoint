public class DoublyLinkedList<T> {


    private class Node { // Inner class for the nodes of the doubly linked list
        T data;
        Node next;
        Node previous;

        Node(T data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }

    private Node head;// make sure it is empty
    private Node tail;
    private int size;

    public void addFirst(T value) {
        Node newNode = new Node(value);

        if (head == null) { // make sure it is empty
            head = newNode;
            tail = newNode;
        }
    
        else {
            newNode.next = head; // list the new node to the front of the list
            head.previous = newNode;
            head = newNode;
        }

        size++;
    }

   
    public void addLast(T value) { // put it in the back of the list 
        Node newNode = new Node(value);

        if (head == null) { // make sure it is empty
            head = newNode;
            tail = newNode;
        }
        
        else {
            newNode.previous = tail;
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    
    public void printList() { // prints out the list 
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    public int getSize() {
        return size;
    }
}