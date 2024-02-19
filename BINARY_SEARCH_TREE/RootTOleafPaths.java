package BINARY_SEARCH_TREE;

import java.util.ArrayList;

public class RootTOleafPaths {
    // Node class for the Binary Search Tree
    public static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Method to print a path from root to leaf
    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " ");
        }
        System.out.println("Null");
    }

    // Method to print all root-to-leaf paths in a BST
    public static void printRootToLeaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }

        // Add the current node to the path
        path.add(root.data);

        // If it's a leaf node, print the path
        if (root.left == null && root.right == null) {
            printPath(path);
        }

        // Recursively explore the left and right subtrees
        printRootToLeaf(root.left, path);
        printRootToLeaf(root.right, path);

        // Backtrack: remove the current node from the path
        path.remove(path.size() - 1);
    }

    // Method to build a balanced Binary Search Tree from a sorted array
    public static Node buildBST(int[] values, int start, int end) {
        if (start > end) {
            return null;
        }

        // Find the middle index
        int mid = (start + end) / 2;

        // Create a new node with the middle value
        Node node = new Node(values[mid]);

        // Recursively build the left and right subtrees
        node.left = buildBST(values, start, mid - 1);
        node.right = buildBST(values, mid + 1, end);

        return node;
    }

    public static void main(String[] args) {
        // Input array of values
        int values[] = {8, 5, 1, 4, 6, 10, 14};

        // Initialize an empty root and build a balanced BST
        Node root = buildBST(values, 0, values.length - 1);

        // Print all root-to-leaf paths in the BST
        printRootToLeaf(root, new ArrayList<>());
    }
}
