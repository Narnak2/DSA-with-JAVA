package STACKDSA;

import java.util.Stack;

public class PushBottom {
    //Push at the Bottom of the stack
    //0(n) liner time
    //recursion
    //implicit stack
    public static void pushAtBottom(Stack<Integer>s,int data)
    {
        if (s.isEmpty())
        {//khali vayasi yasle 4 lai tala rakhxa
            s.push(data);
            return;
        }
      int top=s.pop(); // to nikalna sabai data lai
      pushAtBottom(s,data); // data lai bottom ma rakhna
      s.push(top); // top lai feri push garna



    }

    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtBottom(s,4);
        while (!s.isEmpty())
        {
            System.out.println(s.pop());
        }
    }


}
