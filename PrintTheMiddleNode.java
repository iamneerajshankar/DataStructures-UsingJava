package LinkedList;

class Node_08{
    Node_08 next;
    int data;
}

class MiddleNodeInList{
    Node_08 head;

    public void push(int data){
        Node_08 new_node = new Node_08();
        new_node.data = data;
        new_node.next = null;
        if(head == null){
            head = new_node;
        }
        else {
            Node_08 t_node = head;
            while(t_node.next != null){
                t_node = t_node.next;
            }
            t_node.next = new_node;
        }
    }
    public void middleNode(){

        try {
            Node_08 slow_ptr = head;
            Node_08 fast_ptr= head;
            Node_08 temp =head;
            while(slow_ptr != null && fast_ptr.next != null){
                fast_ptr = fast_ptr.next.next;
                slow_ptr = slow_ptr.next;

            }
            System.out.print("The middle element is ");
            System.out.println(slow_ptr.data);
        } catch (NullPointerException ex){
            System.out.println("Sorry! You are trying to find middle Node in even number of Nodes");
        }
        }

}

public class PrintTheMiddleNode {
    public static void main(String[] args) {
        MiddleNodeInList list = new MiddleNodeInList();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.middleNode();
    }
}
