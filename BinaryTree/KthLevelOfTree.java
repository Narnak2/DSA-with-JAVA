package BinaryTree;

import java.util.ArrayList;

public class KthLevelOfTree {
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
    public static void Klevel(Node root,int level,int k)
    {
        if (root==null)
        {
            return;
        }
        if (level==k)
        {
            System.out.print(root.data+" ");
            return;
        }
        Klevel(root.left,level+1,k);
        Klevel(root.right,level+1,k);
    }

    //to find the lowest common parents
    public static boolean getPath(Node root,int n,ArrayList<Node>path)
    {
        if (root==null)
        {
            return false;
        }
        path.add(root);
        if (root.data==n)
        {
            return true;
        }
        boolean foundleft=getPath(root.left,n,path);
        boolean foundright=getPath(root.right,n,path);

        if (foundleft||foundright)
        {
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
    public static Node lca2(Node root,int n1,int n2)
    {
        if (root==null||root.data==n1||root.data==n2)
        {
            return root;
        }
       Node leftLca= lca2(root.left,n1,n2);
        Node rightLca=lca2(root.right,n1,n2);
        //leftLca rightLca=null
        if (rightLca==null)
        {
            return leftLca;
        }
        return root;
    }

    public static Node lca(Node root,int n1,int n2){
        ArrayList<Node>path1=new ArrayList<>();
        ArrayList<Node>path2=new ArrayList<>();
        getPath(root,n1,path1);
        getPath(root,n2,path2);
        // last common ancestor
        int i=0;
        for (;i<path1.size()&&i<path2.size();i++)

        {
            if (path1.get(i)!=path2.get(i)) {
                break;
            }
        }
        //last equal node ->i-1th
        Node lca=path1.get(i-1);
        return lca;
    }
    public static int lcaDist(Node root,int n)
    {
        if (root==null)
        {
            return -1;
        }
        if (root.data==n)
        {
            return 0;
        }
        int leftDist=lcaDist(root.left,n);
        int rightDis=lcaDist(root.right,n);

        if (leftDist==-1&&rightDis==-1)
        {
            return -1;
        }
        else if (leftDist==-1)
        {
            return rightDis+1;
        }
        else
        {
            return leftDist+1;
        }

    }
    public static int minDist(Node root,int n1,int n2)
    {
        Node lca=lca2(root,n1,n2);
        int dist1=lcaDist(lca,n1);
        int dist2=lcaDist(lca,n2);
        return dist1+dist2;
    }
    public static  int KAncestor(Node root,int n, int k)
    {
        if (root==null)
        {
            return -1;
        }
        if (root.data==n)
        {
            return 0;
        }
        int lefDist=KAncestor(root.left,n,k);
        int rightDist=KAncestor(root.right,n,k);
        if (lefDist==-1&&rightDist==-1){
            return -1;
        }
        int max=Math.max(lefDist,rightDist);
        if (max+1==k)
        {
            System.out.println(root.data);
        }
        return max+1;

    }
    public static int transForm(Node root)
    {
        if (root==null)
        {
            return 0;
        }
        int leftChild=transForm(root.left);
        int rightChild=transForm(root.right);
        int data= root.data;
        int newLeft=root.left==null ? 0 : root.left.data;
        int newRight=root.right==null ? 0 : root.right.data;
        root.data=newLeft+leftChild+newRight+rightChild;

        return data;
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
      Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
       // Klevel(root,1,3);

        int n1=5,n2=2;
      //  System.out.println(lca(root,n1,n2).data);
     //   System.out.println(lca2(root,n1,n2).data);
      //  System.out.println(minDist(root,n1,n2));
  //      KAncestor(root,n1,n2);

        transForm(root);
        preOder(root);

    }
}
