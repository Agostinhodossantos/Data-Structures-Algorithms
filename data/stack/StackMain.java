import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
   
        stk.push(78);  
        stk.push(113);  
        stk.push(90);  
        stk.push(120);  

        boolean result = stk.empty();
        //prints elements of the stack  
        System.out.println("Elements in Stack: " + stk);  
    }
}
