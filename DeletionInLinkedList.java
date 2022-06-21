package LinkedList;

// The Node class
class Node_02{
    int data;
    Node_02 next;
}


class DeleteLinkedList{
    static Node_02 head; // Initializing Node_02 as head node

    // method to add node at the end of last node or head node.
    static void insert(int data){
        Node_02 new_node = new Node_02();
        new_node.data = data;
        new_node.next =null;
        if(head == null){
            head = new_node; // if there are no node insert as th head node
        }
        // else insert the node at the end of all nodes available
        else{
            Node_02 t_node = new Node_02();
            t_node.next = head;
            while(t_node.next != null){
                t_node = t_node.next;
            }
            t_node.next = new_node;
        }
    }

    // method to delete the linked list
    static void delete(){
        head = null;
    }

    // Prints the linked list all nodes and its data
    static void show(){
        Node_02 n = head;
        while(n.next != null){
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println(n.data);
    }
}

public class DeletionInLinkedList {
    public static void main(String[] args) {
        System.out.println("Inserting some elements.....");
        DeleteLinkedList.insert(1);
        DeleteLinkedList.insert(2);
        DeleteLinkedList.insert(3);
        System.out.print("The elements in the linked list after insertion ");
        DeleteLinkedList.show();
        System.out.println("Deleting the entire linked list...");
        DeleteLinkedList.delete();
        try{
            DeleteLinkedList.show();
        } catch (NullPointerException ex){
            System.out.println("The linked list does not exist");
        }


    }

}
