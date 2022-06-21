package LinkedList;

public class InsertionLinkedList {
 static Node head;
    //create static class to access from main method directly
    static  class Node{
        int data;
        Node next;

    }
    static void showLinkedList(Node ptr){
        while(ptr != null){
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
        //System.out.println(ptr.data);
        System.out.println();
    }

    static  void insertAfter(Node jointNode, int new_data){
        // create Node object and assign memory for new node
        Node new_node = new Node();
        //add data to new node
        new_node.data = new_data;

        // link new_node with jointNode
        new_node.next = jointNode.next;

        // move on in the LinkedList
        jointNode.next = new_node;
    }

    static void insertAtStart(int new_data){
        // create Node object and assign memory for new node
        Node  atStart_Node = new Node();

        //add data to the new node
        atStart_Node.data = new_data;

        //link atStart_Node to start
        atStart_Node.next = head;
        //Move the head to point to new Node
        head = atStart_Node;
    }

    public static void main(String[] args) {
        //create object of node class and assign memory in head for three nodes
        Node head = new Node();
        Node second = new Node();
        Node third = new Node();
        Node fourth = new Node();
        Node fifth = new Node();

        //add data in head node and link with second node
        head.data = 1;
        head.next = second;
        //add data in second node and link with third node
        second.data = 2;
        second.next = third;
        //add data in third node and link with fourth node
        third.data = 3;
        third.next = fourth;
        //add data in fourth node and link with fifth node
        fourth.data = 4;
        fourth.next = fifth;
        //add data in fifth node and terminate the node
        fifth.data = 5;
        fifth.next = null;

        //calling the show method and passing the first node(head)
        System.out.print("The elements of the linked list before insertion: ");
        showLinkedList(head);
        System.out.print("The elements of the linked list after insertion: ");
        insertAfter(third, 7);
        showLinkedList(head);

        System.out.print("The elements of the linked list after insertion at start ");
        insertAtStart(21);
        showLinkedList(head);
    }
}
