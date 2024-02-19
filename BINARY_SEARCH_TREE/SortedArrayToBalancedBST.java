package BINARY_SEARCH_TREE;

public class SortedArrayToBalancedBST {
    public static class Node{
        Node right,left;
        int data;
        public Node(int data)
        {
            this.data=data;
            this.right=null;
            this.left=null;
        }

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
    public static Node creatBST(int arr[],int st,int end)
    {

        if (st>end)
        {
            return null;
        }

        int mid=(st+end)/2;
        Node root=new Node (arr[mid]);
        root.left=creatBST(arr,st,mid-1);
        root.right=creatBST(arr,mid+1,end);
        return root;

    }

    public static void main(String[] args)
    {
        int arr[]={3,5,6,8,10,11,12};
        Node root=creatBST(arr,0,arr.length-1);
        preOder(root);

    }
}
