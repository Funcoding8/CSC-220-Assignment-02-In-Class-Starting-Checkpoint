public class Demo {

    public static void main(String[] args) {

        DoublyLinkedList<Integer> list = new DoublyLinkedList<>(); // Create a new doubly linked list of integers


        list.addFirst(1); 

        
        list.addFirst(5);

      
        list.addLast(20);
                                // adds 1,5,20
        System.out.println("Expected order: 5 1 20");
        System.out.print("Actual order:   "); // Print the actual order of elements in the list
        list.printList();

        System.out.println("Expected size: 3");
        System.out.println("Actual size:   " + list.getSize()); //  Print the actual size of the list
    }
}