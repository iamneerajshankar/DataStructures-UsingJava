package Stack;

class StackOperation{
    static final int MAX= 100;
    int top;
    int[] s = new int[MAX];

    boolean isEmpty(){
        return (top<0);
    }
    StackOperation(){
        top = -1;
    }

    boolean push(int x){
        if(top>MAX- 1){
            System.out.println("The stack overflow");
            return false;
        }
        else {
            s[++top] = x;
            System.out.println("The element " + x + " pushed into stack");
            return true;
        }
    }

    int pop(){
        if(top<0){
            System.out.println("The stack underflow");
            return 0;
        }
        else{
            int x = s[top--];
            return x;
        }
    }
    int peek(){
        if(top<0){
            System.out.println("The stack underflow");
            return 0;
        }
        else{
            int x = s[top];
            return x;
        }
    }

    void show(){
        for(int i=top; i>-1; i--){
            System.out.print(" " + s[i]);
        }
    }
}

public class UnderstandingTheStack {
    public static void main(String[] args) {
        StackOperation stackOperation = new StackOperation();
        stackOperation.push(10);
        stackOperation.push(20);
        stackOperation.push(30);
        System.out.println("The pop element is: " + stackOperation.pop());
        System.out.print("The element present in the stack: ");
        stackOperation.show();
    }
}
