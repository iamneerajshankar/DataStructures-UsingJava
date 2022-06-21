package LinkedList;
class Node_05{
    Node_05 next;
    int data;
}

class SearchElementLogic{
    Node_05 head;
    // inserting data into linked list at the end.
    public void insert(int data){
        Node_05 new_node = new Node_05();
        new_node.data = data;
        new_node.next = null;

        if(head == null){
            head = new_node;
        }
        else{
            Node_05 temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new_node;
        }
    }

    public void show(){
        Node_05 temp = head;
        while(temp.next != null){
            System.out.print(" " + temp.data);
            temp = temp.next;
        }
        System.out.println(" "+ temp.data);
    }

    // using the iterative search
    public boolean findElement(int x){
        Node_05 current = head;
        while(current != null){
            if(current.data == x){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // using the recursive search
    public boolean findElement(Node_05 head, int x){
        if(head == null){
            return false;
        }
        if(head.data == x){
            return true;
        }
        return findElement(head.next, x);
    }
}
public class SearchElementInLinkedList {
    public static void main(String[] args) {
        SearchElementLogic list = new SearchElementLogic();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        System.out.print("The elements in the list are: ");
        list.show();

        // search using the recursive method
        if(list.findElement(list.head, 2) == true){
            System.out.println("The element is found");
        }
        else {
            System.out.println("The element not found");
        }
        // search using the iterative method
        if(list.findElement(2) == true){
            System.out.println("The element is found");
        }
        else {
            System.out.println("The element not found");
        }

    }
}
