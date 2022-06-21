package LinkedList;

// The Node class
class Node_03 {
    int data;
    Node_03 next;
}
class LinkedListLength{
     Node_03 head; // Initializing Node_03 as head node

    // method to add node at the end of last node or head node.
    public void insert(int data){
        Node_03 new_node = new Node_03();
        new_node.data = data;
        new_node.next = null;
        if(head == null){
            head = new_node; // if there are no node insert as th head node
        }
        // else insert the node at the end of all nodes available
        else {
            Node_03 t_node = head;
            while(t_node.next != null){
                t_node = t_node.next;
            }
            t_node.next = new_node;
        }
    }

    // To get the count of nodes in the linked list
    public int getCount(){
        int count =0;
        Node_03 temp_node = head;

        while(temp_node != null){
            count =count +1;
            temp_node = temp_node.next;
        }
        return count;
    }

}

public class FindLengthOfLinkedList {
    public static void main(String[] args) {
        LinkedListLength list = new LinkedListLength();
        try{
            list.getCount();
        } catch( NullPointerException ex){
            System.out.println("The linked is currently empty");
        }
        list.getCount();
        System.out.println("Adding some elements to the linked list....");
        list.insert(1);
        list.insert(2);
        list.insert(3);
        System.out.print("The current length of the linked list ");

        System.out.println(list.getCount());


    }

}
