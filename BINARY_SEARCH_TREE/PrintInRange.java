package BINARY_SEARCH_TREE;

public class PrintInRange {
    public static class Node{
        int data;
        Node left,right;
        public Node (int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void printInRange(Node root,int k1,int k2)
    {
        if (root==null)
        {
            return;
        }
        if (root.data>=k1&&root.data<=k2)
        {
            printInRange(root.left,k1,k2);
            System.out.print(root.data+" ");
            printInRange(root.right,k1,k2);
            System.out.print(root.data+" ");
        }
        else if (root.data<k1)
        {
            printInRange(root.left,k1,k2);
        }
        else {
            printInRange(root.right,k1,k2);
        }

    }
    public static void main(String[] args) {
Node root=new Node(1);
        root.left = new Node(5);
        root.left.right = new Node(6);
        root.left.right.right = new Node(4);
        root.left.left = new Node(1);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(14);
        printInRange(root,5,12);

    }
}
