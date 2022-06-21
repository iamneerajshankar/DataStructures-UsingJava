package LinkedList;

public class UnderstandingTheLinkedList {
    //creating static class so that we can directly access from main method
    static class Node{
        int data;
        Node next;
    }

    static  void show(Node ptr){
        System.out.print("The elements of the linkedList: ");
        while(ptr != null){
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //creating three different instance(object) of node class for three nodes
        // assign memory in the heap

       Node head = new Node();
       Node second = new Node();
       Node third = new Node();

        head.data = 1;
        head.next = second;

        second.data = 2;
        second.next = third;

        third.data = 3;
        third.next = null;

        show(head);
    }
}
