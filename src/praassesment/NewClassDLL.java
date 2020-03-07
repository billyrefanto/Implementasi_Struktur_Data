package praassesment;

public class NewClassDLL {
    static class NodeDD {
        int data;
        NodeDD previous;
        NodeDD next;

        NodeDD(int data) {
            this.data = data;
        }
    }

    //Represent the head and tail of the doubly linked list
    private NodeDD head, tail;

    private void insertLast(int data) {
        NodeDD newNode = new NodeDD(data);

        //If list is empty
        if (head == null) {
            head = tail = newNode;
            //head's previous will point to null
            head.previous = null;
            //tail's next will point to null, as it is the last node of the list
            tail.next = null;
        } else {
            //newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            //newNode's previous will point to tail
            newNode.previous = tail;
            //newNode will become new tail
            tail = newNode;
            //As it is last node, tail's next will point to null
            tail.next = null;
        }
    }

    //deleteFromStart() will delete a node from the beginning of the list
    private void deleteFirst() {
        //Checks whether list is empty
        if (head != null){
            //Checks whether the list contains only one element
            if (head != tail) {
                //head will point to next node in the list
                head = head.next;
                //Previous node to current head will be made null
                head.previous = null;
            }
            //If the list contains only one element
            //then, it will remove node and now both head and tail will point to null
            else {
                head = tail = null;
            }
        }
    }

    //display() will print out the nodes of the list
    private void display() {
        //Node current will point to head
        NodeDD current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            //Prints each node by incrementing the pointer.

            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        NewClassDLL dll = new NewClassDLL();
        //Add nodes to the list
        dll.insertLast(1);
        dll.insertLast(2);
        dll.insertLast(3);
        dll.insertLast(4);
        dll.insertLast(5);

        //Printing original list
        System.out.println("Original List: ");
        dll.display();
        while (dll.head != null) {
            dll.deleteFirst();
            System.out.println("delete first: ");
            dll.display();
        }
    }
}
