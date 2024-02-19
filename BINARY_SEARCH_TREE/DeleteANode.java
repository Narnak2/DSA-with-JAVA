package BINARY_SEARCH_TREE;

public class DeleteANode {
    public static class Node {
        Node left, right;
        int data;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public static Node delete(Node root, int val) {
            if (root.data < val) {
                root.right = delete(root.right, val);
            } else if (root.data > val) {
                root.left = delete(root.left, val);
            } else {
                // voila //case 1
                if (root.left == null && root.right == null) {
                    return null;
                }
                // case 2 - single child
                if (root.left == null) {
                    return root.right;
                } else if (root.right == null) {
                    return root.left;
                }
                // case 3 both children
                Node IS = findInoderSuccesor(root.right);
                root.data = IS.data;
                root.right = delete(root.right, IS.data);
            }
            return root;
        }

        public static Node findInoderSuccesor(Node root) {
            while (root.left != null) {
                root = root.left;
            }
            return root;
        }

        public static void inorderTraversal(Node root) {
            if (root != null) {
                inorderTraversal(root.left);
                System.out.print(root.data + " ");
                inorderTraversal(root.right);
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.right = new Node(6);
        root.left.right.right = new Node(4);
        root.left.left = new Node(1);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(14);

        System.out.println("Original BST:");
        Node.inorderTraversal(root);

        root = Node.delete(root, 1);

        System.out.println("\nBST after deleting node with value 1:");
        Node.inorderTraversal(root);
    }
}
