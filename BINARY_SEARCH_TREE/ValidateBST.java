package BINARY_SEARCH_TREE;

public class ValidateBST {
    public static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
        }
    }
    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }


    public static boolean isValidBST(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }
        if (min != null && root.data <= min.data) {
            return false;
        } else if (max != null && root.data >= max.data) {
            return false;
        }
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }


    public static void main(String[] args) {
        int values[] = {5252, 4774777, 5};
        Node root = null;

        for (int i = 0; i < values.length; i++)
        {
            root=insert(root,values[i]);
        }
        System.out.println();

        if (isValidBST(root, null, null)) {
            System.out.println("Valid BST");
        } else {
            System.out.println("Not a valid BST");
        }
    }
}
