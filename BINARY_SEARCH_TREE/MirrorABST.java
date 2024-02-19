package BINARY_SEARCH_TREE;

public class MirrorABST {
    public static class Node{
        Node left,right;
        int data;
        public Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
        public static Node insert(Node root,int data)
        {
            if (root==null)
            {
                return new Node(data);
            }
            if (data< root.data)
            {
                root.left=insert(root.left, data);
            }
            else if (root.data>data)
            {
                root.right=insert(root.right,data);
            }
            return root;
        }
    }
    public static Node createMirror(Node root)
    {
        if (root==null)
        {
            return null;
        }
       Node leftSubtree= createMirror(root.left);
        Node rightSUbtree=createMirror(root.right);
        root.left=rightSUbtree;
        root.right=leftSubtree;
        return root;

    }
    public static void preOder(Node root)
    {
        if (root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preOder(root.left);
        preOder(root.right);
    }
    public static void main(String[] args) {
     //   int values[]={5,8,3,6,10,11};
        Node root=new Node(8);
        root.left=new Node(5);
        root.left.left=new Node(3);
        root.left.right=new Node(6);
        root.right=new Node(10);
        root.right.right=new Node(11);
      root=  createMirror(root);
      preOder(root);



    }
}
