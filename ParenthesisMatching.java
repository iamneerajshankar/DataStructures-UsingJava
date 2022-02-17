package Stack;
/*
* A java program to find if the given expression has balanced brackets which means every opening bracket must have a
* corresponding closing bracket and vice versa or not
* */
class Custom_Stack{
    int top;
    int size;
    char[] arr;
}
class LogicParenthesisMatching{
    /*************************Logic to check if the stack is empty or not**********************/
    boolean isEmpty(Custom_Stack s){
        if(s.top==-1){
            return true;
        }
        else{
            return false;
        }
    }
    /*************************Logic to check if the stack is full or not***********************/
    boolean isFull(Custom_Stack s){
        if(s.top==s.size-1){
            return true;
        }
        else {
            return false;
        }
    }
    /*************************Logic to perform the push operation**************************/
    void push(Custom_Stack s, char element){
        if(isFull(s)){
            System.out.println("The stack is full. Cannot push element");
        }
        else {
            s.top++;
            s.arr[s.top] = element;
        }
    }
    /*************************Logic to perform the pop operation**************************/
    char pop(Custom_Stack s){
        if(isEmpty(s)){
            System.out.println("The stack is empty. Cannot pop!");
            return ' ';
        }
        else{
            char element = s.arr[s.top];
            s.top--;
            return element;
        }
    }
    /*************************Logic to check the given set brackets are balanced or not*********/
    boolean parenthesisMatching(Custom_Stack s, String exp){
        int len = exp.length();
        for(int i=0; i<len; i++){
            char x = exp.charAt(i);
            if(x=='(' || x=='{' || x=='['){
                push(s, x);
                continue;
            }
            if (isEmpty(s))
                return false;
            char check;
            switch(x){
                case ')':
                    check =pop(s);
                    if(check == '{' || check==']')
                        return false;
                    break;
                case '}':
                    check=pop(s);
                    if(check=='(' || check=='[')
                        return false;
                    break;
                case ']':
                    check=pop(s);
                    if(check== '{' || check== '(')
                        return false;
                    break;
            }
        }
        return isEmpty(s);
    }
}

public class ParenthesisMatching {

    public static void main(String[] args) {
        Custom_Stack sp = new Custom_Stack();
        sp.top=-1;
        sp.size = 100;
        sp.arr = new char[sp.size];
        String exp = "{{(())}}";
        LogicParenthesisMatching s = new LogicParenthesisMatching();
        if(s.parenthesisMatching(sp, exp)){
            System.out.println("Yes! The brackets set is balanced");
        }
        else {
            System.out.println("The brackets set is not balanced");
        }
    }


}
