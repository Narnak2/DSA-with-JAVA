package BinaryTree;

public class DiameterOfTree {
    static class Node{
        int data;
        Node left, right;
        public Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int height(Node root)
    {
        if (root==null)
        {
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
    public static int diameter(Node root)//0(N^2)
    {
        if (root==null)
        {
            return 0;
        }
        int lDiam=diameter(root.left);
        int leftHeight=height(root.left);
        int rDiam=diameter(root.right);
        int rightHeight=height(root.right);
        int selfdiam=leftHeight+rightHeight+1;
        return Math.max(selfdiam,Math.max(lDiam,rDiam));
        /*int max=Math.max(lDiam,rDiam);
        return Math.max(max,selfdiam);*/

    }
    public static void main(String[] args) {
          /*
                 1
               /  \
              2    3
             / \  / \
            4   5 6  7
      */
        Node root=new Node(1);
        root.left=new Node(2);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right=new Node(6);
        root.right.right=new Node(7);
        root.right.right.right=new Node(8);
        System.out.println(diameter(root));

    }
}
