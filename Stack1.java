package Collections;
import java.util.Stack;
public class Stack1 {
    public static void main(String[] args){
        Stack<Integer> stack  = new Stack<>();
        // pushing onto the stack
        stack.push(33);
        stack.push(34);
        stack.push(35);

        // peek method
        System.out.println("top of stack is :" + stack.peek());

        // lets use size method
        System.out.println(stack.size());

        // pop method:
        stack.pop();
        for(Integer i: stack){
            System.out.println(i);
        }
    }
}
