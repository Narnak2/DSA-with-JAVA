package STACKDSA;

import java.util.Stack;

public class isDuplicateParanthesses {
    public static boolean isDuplcate(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            //closing
            if (ch == ')') {
                int count = 0;
                while (stack.peek() == '(') {
                    stack.pop();
                    count++;
                }
                if (count < 1) {
                    return true;
                } else {
                    stack.pop();//opening  pair

                }


            }
            else {
                stack.push(ch);
            }



        }
        return false;
    }

    public static void main(String[] args) {
        String str="((a+b))";//true
        System.out.println(isDuplcate(str));

    }
}
