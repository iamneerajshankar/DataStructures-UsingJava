package Stack;
/*
* A java program to implement various operation on stack of integer
* */
class UserStack{
    int top;
    int size;
    int[] arr;
}
class StackImplementation{
    /*************************Logic to check if the stack is empty or not**********************/
    boolean isEmpty(UserStack s){
        if(s.top==-1){
            return true;
        }
        else{
            return false;
        }
    }
    /*************************Logic to check if the stack is full or not***********************/
    boolean isFull(UserStack s) {
        if (s.top == s.size - 1) {
            return true;
        } else {
            return false;
        }
    }
    /*************************Logic to perform the push operation**************************/
    void push(UserStack s, int element){
        if(isFull(s)){
            System.out.println("Sorry! The element cannot be pushed. The stack is full.");
        }
        else{
            s.top++;
            s.arr[s.top] = element;
        }
    }

    /*************************Logic to perform the pop operation**************************/
    //pop operation removes the top element from the stack
    int pop(UserStack s){
        if(isEmpty(s)){
            System.out.println("Sorry! The stack is empty. No element to pop.");
            return -1;
        }
        else {
            int element = s.arr[s.top];
            s.top--;
            return element;
        }
    }
    /*************************Logic to perform the stackTop operation**************************/
    int stackTop(UserStack s){
        return s.arr[s.top];
    }
    /*************************Logic to perform the peekTop operation**************************/
    int stackBottom(UserStack s){
        return s.arr[0];
    }

    /*************************Logic to perform the peek operation**************************/
    // peek operation return an element in the stack at a given index
    int peek(UserStack s, int i){
        int index = s.top-i;
        if(index>=0){
            System.out.println("No more elements left. Done!");
            return -1;
        }
        else {
            return s.arr[index];
        }
    }
}

public class Implementing_Stack_Using_Array {
    public static void main(String[] args) {
        // initialize the stack here
        UserStack userStack = new UserStack();
        userStack.top = -1;
        userStack.size = 100;
        userStack.arr =new int[userStack.size];
        System.out.println("The stack created successfully");

        //create instance of the class StackImplementation
        StackImplementation stackImplementation = new StackImplementation();
        //checking stack before pushing any element
        System.out.println("***************************************************************");
        System.out.println("The stack status before pushing any element");
        System.out.println("Is the stack Empty? " +stackImplementation.isEmpty(userStack));
        System.out.println("Is the stack Full? " +stackImplementation.isFull(userStack));

        //push some element to the stack
        stackImplementation.push(userStack, 1);
        stackImplementation.push(userStack, 2);
        stackImplementation.push(userStack, 3);
        stackImplementation.push(userStack, 4);
        stackImplementation.push(userStack, 5);

        //checking stack after pushing some elements
        System.out.println("\n***************************************************************");
        System.out.println("The stack status after pushing some elements");
        System.out.println("Is the stack Empty? " +stackImplementation.isEmpty(userStack));
        System.out.println("Is the stack Full? " +stackImplementation.isFull(userStack));

        //performing the peek operation
        System.out.println("\n***************************************************************");
        for(int j=0; j<=userStack.top +1; j++){
            int index = userStack.top -j;
            System.out.println("The element at the index " + index + " is " +stackImplementation.peek(userStack, j));
        }

        //Lets pop an element from stack
        System.out.println("\n***************************************************************");
        System.out.println("The element " + stackImplementation.pop(userStack) + " is popped from the stack");

        //calling the stackTop and stackBottom functions
        System.out.println("\n***************************************************************");
        System.out.println("The top most element in the stack is " +stackImplementation.stackTop(userStack));
        System.out.println("The bottom element element of the stack is " +stackImplementation.stackBottom(userStack));


    }

}
