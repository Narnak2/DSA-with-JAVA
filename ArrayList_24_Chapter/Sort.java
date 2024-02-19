package ArrayList_24_Chapter;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    public static void main(String args[])
    {
        ArrayList<Integer>List=new ArrayList<>();
        List.add(50);
        List.add(5);
        List.add(80);
        List.add(20);
        List.add(5);
        List.add(55);
        System.out.println(List);
        Collections.sort(List);
        System.out.println(List);

//        JFrame frame=new JFrame();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setTitle("new screen here ");
//        frame.setResizable(true);
//
//        frame.setSize(720,720);
//        frame.setVisible(true);
        //descending order print
       Collections.sort(List,Collections.reverseOrder());
       System.out.println(List);



    }
}
