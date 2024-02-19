package STACKDSA;// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Stack<String> s=new Stack<>();
        s.push("Naran");
        s.push("Manisha");
        s.push("Baby");


        while(!s.isEmpty())
        {
            System.out.println("peek "+s.peek());
            s.pop();

        }


    }
}