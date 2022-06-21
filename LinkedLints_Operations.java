package LinkedList;

// Creating the Node class
class Node{
    int data;
    Node next;
}

class My_LinkedList{
    Node head; // initialize first node as head

    // Method to insert new node at the end of Linked List
    public void insert(int data){
        System.out.println("The head is" + head);
        Node new_node = new Node();
        new_node.data = data;
        new_node.next = null;
        if(head == null){
            head = new_node; // If the linked list empty, insert as head
        }

        // else, insert the new node at the end of the linked list
        else{
            Node temp_node = head;
            while(temp_node.next != null){
                temp_node = temp_node.next;
            }
            temp_node.next = new_node;

        }
    }

    //Method to insert at the beginning of the linked list
    public void insertAtStart(int data){
        Node new_node = new Node();
        new_node.data = data;
        new_node.next = head;
        head = new_node;
    }

    // Inserts the element at given index in the linked list
    public void insertAt(int index, int data){
        Node new_node = new Node();
        new_node.data = data;
        new_node.next = null;

        Node temp_node = head;
        for(int i=0;i<index-1; i++){
            temp_node =temp_node.next;
        }
        new_node.next = temp_node.next;
        temp_node.next = new_node;
    }
    public void show(){
        Node n = head;
        while(n.next != null){
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println(n.data);
    }
}

public class LinkedLints_Operations {
    public static void main(String[] args) {
        My_LinkedList my_linkedList = new My_LinkedList();
        my_linkedList.insert(1);
        my_linkedList.insert(4);
        my_linkedList.insert(5);
        my_linkedList.insert(6);
        my_linkedList.insert(3);
        my_linkedList.insertAtStart(0);
        my_linkedList.insertAt(3, 7);
        my_linkedList.show();
    }
}
