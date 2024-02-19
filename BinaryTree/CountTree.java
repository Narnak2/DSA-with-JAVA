package BinaryTree;

public class CountTree {
    public static class Node{// 0(N) time complexity
        // program to find the count of the binary tree
        int data;
        Node left,right;
       public Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }

    }
    public static int count(Node root){
        if (root==null)
        {
            return 0;
        }
        int lCount=count(root.left);
        int rCount=count(root.right);
        return lCount+rCount+1;
    }
    public static void main(String[] args) {
      Node root=new Node(1);
        root.left=new Node(2);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right=new Node(6);
        root.right.right=new Node(7);
        System.out.println("the count of the given root is "+count(root));

    }
}
