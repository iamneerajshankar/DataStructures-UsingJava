package LinkedList;

class Node_06{
    int data;
    Node_06 next;
}

class NthNodeSearchLogic{
    Node_06 head; // make the first element as head

    // inserting data into linked list at the end.
    public void insert(int data){
        Node_06 new_node = new Node_06();
        new_node.data = data;
        new_node.next = null;

        if(head == null){
            head = new_node;
        }
        else{
            Node_06 temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new_node;
        }
    }

    public void show(){
        Node_06 temp = head;
        while(temp.next != null){
            System.out.print(" " + temp.data);
            temp = temp.next;
        }
        System.out.println(" "+ temp.data);
    }

    public int getNthNode(int index){
        Node_06 temp = head; // temporary node as head
        int count = 0;
        while(head != null){
            if(count == index){
                return temp.data; // as soon as count matches given index return node data
            }
            count++;
            temp = temp.next;
        }

        assert(false); // When given index does not exist
        return 0;
    }
}

public class SearchNthNodeInLinkedList {

    public static void main(String[] args) {
        NthNodeSearchLogic list = new NthNodeSearchLogic();

        // Insert some node in the linked list
        System.out.println("Adding some nodes in the list....");
        list.insert(1);
        list.insert(2);
        list.insert(3);
        
        try {
            //find and display node at given index 
            System.out.println("The node present at the index 2 is " + list.getNthNode(3));
        } catch (NullPointerException ex) {

            // it gets executed when user provide false index.
            System.out.println("Sorry! You have given index which is not present");
        }

    }
    
}
