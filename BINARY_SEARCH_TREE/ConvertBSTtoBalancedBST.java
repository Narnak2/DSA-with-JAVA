package BINARY_SEARCH_TREE;

import java.util.ArrayList;

public class ConvertBSTtoBalancedBST {
    public static class Node {
        Node left, right;
        int data;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
        public static void preOder(Node root)
        {
            if (root==null)
                return;
            System.out.print(root.data+ " ");
            preOder(root.left);
            preOder(root.right);
        }

    public static void getInoder(Node root,ArrayList<Integer>inoder)
    {
        if (root==null)
        {
            return;
        }
        getInoder(root.left,inoder);
        inoder.add(root.data);
        getInoder(root.right,inoder);
    }
    public static Node CreatBST(ArrayList<Integer>inoder,int st,int end)
    {
        if (st>end)
        {
            return null;
        }
        int mid=(st+end)/2;
        Node root=new Node(inoder.get(mid));
        root.left=CreatBST(inoder,st,mid-1);
        root.right=CreatBST(inoder,mid+1,end);
        return root;
    }
    public static Node balanceBST(Node root)
    {
        //to calculate inoder seq
        ArrayList<Integer>inoder=new ArrayList<>();
        getInoder(root,inoder);

        //sorted inoder ->balance bst
       root=CreatBST(inoder,0,inoder.size()-1);
       return root;


    }
    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(6);
        root.left.left=new Node(5);
        root.left.left.left=new Node(3);

        root.right=new Node(10);
        root.right.right=new Node(11);
        root.right.right.right=new Node(12);

        root=balanceBST(root);
        preOder(root);






    }
}
