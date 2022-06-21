package LinkedList;

class Node_07{
    int data;
    Node_07 next;
}

class NthNodeFromEnd {
    Node_07 head;
    public void push(int data){
        Node_07 new_node = new Node_07();
        new_node.data = data;
        new_node.next = null;
        if(head == null){
            head = new_node;
        }
        else {
            Node_07 t_node = head;
            while(t_node.next != null){
                t_node = t_node.next;
            }
            t_node.next = new_node;
        }
    }
    public void test(int index)

    {
        int list_len = 0;
        Node_07 temp = head;
        while (temp!= null) {
            list_len++;
            temp = temp.next;

        }
        System.out.println(list_len);
        Node_07 myNode = head;
        for (int i=1;i<list_len-index+1;i++){
            myNode = myNode.next;
        }
        System.out.println(myNode.data);

    }
}

public class PrintNthNodeFromEnd {
    public static void main(String[] args) {
        NthNodeFromEnd list =new NthNodeFromEnd();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        System.out.println("The nth node data from end");
        list.test(2);
    }
}
