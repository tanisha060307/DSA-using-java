import java.util.Stack;
public class sortStack{
    public static void sortStack(Stack<Integer> stack) {
   Stack<Integer> temp = new Stack<>();
   while(!stack.isEmpty()){
    int curr = stack.pop();
    while(!temp.isEmpty() && temp.peek()>curr){
        stack.push(temp.pop());
    }
    temp.push(curr);


}
    while(!temp.isEmpty()){
        stack.push(temp.pop());
    
}
}
public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    stack.push(3);
    stack.push(1);
    stack.push(4);
    stack.push(2);
    sortStack(stack);
    System.out.println( stack);
}
}