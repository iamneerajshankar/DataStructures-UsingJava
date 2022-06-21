package LinkedList;
/*
* Singly linked list and a key, count the number of occurrences of the given key in the linked list.
* */
// Create a node
class Node_09 {
    Node_09 next;
    int data;
}

public class CountOccurrenceOfNumber {
    Node_09 head; // initialize the first node as head.
    // method to  insert node in the linked list
    public void insert(int data){
        //create a new node instance
        Node_09 new_node = new Node_09();
        new_node.data = data;
        new_node.next = null;

        // insert the node as head if the linked list is empty
        if(head == null){
            head = new_node;
        }

        // when the linked list is not empty insert the end
        else{
            // creating temp node to traverse
            Node_09 temp_node = new Node_09();
            temp_node.next = head;
            while(temp_node.next !=null){
                temp_node = temp_node.next;
            }
            temp_node.next = new_node;
        }
    }

    int countOccurrence(int number){
        // create a temp node to traverse the list
       // Node_09 temp_node = new Node_09();
      //  temp_node.next = head;
        Node_09 temp_node = head;
        int count = 0;
        while(temp_node != null){
            // if the element of any node matches with number, increase the count
            if(temp_node.data == number){
                count++;
            }
            temp_node = temp_node.next;
        }
        return count;
    }

    public void show(){
        Node_09 n = head;
        while(n.next != null){
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println(n.data);
    }

    public static void main(String[] args) {
        CountOccurrenceOfNumber list = new CountOccurrenceOfNumber();

        // adding some node to the linked list
        System.out.println("Adding some nodes to the list...");
        list.insert(1);
        list.insert(9);
        list.insert(3);
        list.insert(3);
        list.insert(5);
        list.insert(3);
        // show all the node's data
        System.out.print("The node's data are as follows: ");
        list.show();
        // calling the method to get count of given number
        int number = 3;
        System.out.print("Count of the number " +number + " is : ");
        System.out.println(list.countOccurrence(number));
    }

}

