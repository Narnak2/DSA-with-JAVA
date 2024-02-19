package BinaryTree;

public class Bulid_Tree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        private int idx;

        public Node buildTree(int nodes[]) {
            idx = 0;
            return buildTreeHelper(nodes);
        }

        private Node buildTreeHelper(int nodes[]) {
            if (idx == nodes.length || nodes[idx] == -1) {
                idx++;
                return null;
            }

            Node newNode = new Node(nodes[idx++]);
            newNode.left = buildTreeHelper(nodes);
            newNode.right = buildTreeHelper(nodes);
            return newNode;
        }

        public void preOrder(Node root) {
            if (root != null) {
                System.out.print(root.data + " ");
                preOrder(root.left);
                preOrder(root.right);
            }

        }
        public void inoder(Node root)
        {
            if (root==null)
            {
                return;
            }
            inoder(root.left);
            System.out.print(root.data+" ");
            inoder(root.right);

        }
        public void postOder(Node root)
        {
            if (root==null)
            {
                return;
            }
            postOder(root.left);
            postOder(root.right);
            System.out.print(root.data+" ");

        }
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
      //  tree.inoder(root);
      //  tree.preOrder(root);
        tree.postOder(root);

    }
}
