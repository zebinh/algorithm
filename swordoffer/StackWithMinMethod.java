import java.util.Stack;

/**
 * 剑指Offer，包含min函数的栈
 */

 public class StackWithMinMethod {

    Stack<Integer> data = new Stack<>();
    Stack<Integer> mins = new Stack<>();

    public void push(int node) {
        data.push(node);

        if (mins.isEmpty() || node <= mins.peek()) {
            mins.push(node);
        }else {
            mins.push(mins.peek());
        }
    }
    
    public void pop() {
        data.pop();
        mins.pop();
    }
    
    public int top() {
        return data.peek();
    }
    
    public int min() {
        return mins.peek();
    }

    
 }