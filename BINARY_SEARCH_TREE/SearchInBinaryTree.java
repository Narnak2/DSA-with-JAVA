package BINARY_SEARCH_TREE;

public class SearchInBinaryTree {
    public static class Node{
        int data;
        Node left,right;
        public Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Boolean searchAKey (Node root,int key)
    {
        if (root==null)
        {
            return false;
        }
        if (root.data==key)
        {
            return true;
        }
        if (root.data>key)
        {
            return searchAKey(root.left,key);
        }
        else {
            return searchAKey(root.right,key);
        }



    }
    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(5);
        root.left.right=new Node(6);
        root.left.right.right=new Node(4);
        root.left.left=new Node(1);
        root.right=new Node(10);
        root.right.right=new Node(11);
        root.right.right.right=new Node(14);
        int key=7;
        if (searchAKey(root,key))
        {
            System.out.println("found !!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
        else {
            System.out.println("Sorry Not Found!!!!!!!!!!");
        }




    }
}
