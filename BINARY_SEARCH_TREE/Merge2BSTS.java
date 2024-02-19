package BINARY_SEARCH_TREE;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;

public class Merge2BSTS {
    public static class Node
    {
        int data;
        Node left,right;
        public Node(int data)
        {
            this.data=data;
            this.left=this.right=null;

        }
    }
    public static void getInoder(Node root, ArrayList<Integer>arr)
    {
        if (root==null)
        {
            return;
        }
        getInoder(root.left,arr);
        arr.add(root.data );
        getInoder(root.right,arr);
    }
    public static Node createBST(ArrayList<Integer>arr,int st,int end)
    {
        if (st>end)
        {
            return null;
        }
        int mid=(st+end)/2;
        Node root=new Node(arr.get(mid));
        root.left=createBST(arr,st,mid-1);
        root.right=createBST(arr,mid+1,end);
        return root;
    }
    public static Node mergeBSTs(Node root1,Node root2)
    {
        ArrayList<Integer>arr1=new ArrayList<>();
        getInoder(root1,arr1);

        // step2
        ArrayList<Integer>arr2=new ArrayList<>();
        getInoder(root2,arr2);
        //merge
        int i=0,j=0;
        ArrayList<Integer>finalArr=new ArrayList<>();
        while (i<arr1.size() && j<=arr2.size())
        {
            if (arr1.get(i)<=arr2.get(j)) {
                finalArr.add(arr1.get(i));
                i++;
            }
            else {
                finalArr.add(arr2.get(j));
                j++;
            }
        }
        while (i<arr1.size())
        {
            finalArr.add(arr1.get(i));
            i++;

        }
        while (j<arr2.size())
        {
            finalArr.add(arr2.get(j));
            j++;
        }
        //Sorted AL
        return createBST(finalArr,0,finalArr.size()-1);
    }
    public static void preOder(Node root) {
        if (root == null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preOder(root.left);
        preOder(root.right);
    }
    public static void main(String[] args) {
        Node root1=new Node(2);
        root1.left=new Node(1);
        root1.right=new Node(4);

        Node root2=new Node(9);
        root2.left=new Node(3);
        root2.right=new Node(12);
        Node root= mergeBSTs(root1,root2);
        preOder(root);


    }
}
