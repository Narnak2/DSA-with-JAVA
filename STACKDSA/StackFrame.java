package STACKDSA;

import java.util.Stack;
public class StackFrame {
    Stack<Integer> s=new Stack<>();
    public StackFrame(){
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

    }

    public static void main(String[] args) {
        StackFrame stackFrame=new StackFrame();
        while (!stackFrame.s.isEmpty())
        {
            int top=stackFrame.s.pop();
            System.out.println("Popped "+top);

        }




    }




}
