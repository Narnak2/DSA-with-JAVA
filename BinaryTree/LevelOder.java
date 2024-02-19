package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOder {

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
            public void levelOder(Node root)
            {
                if (root==null) {
                    return;
                }
                Queue<Node>q=new LinkedList<>();
                q.add(root);
                q.add(null);
                while (!q.isEmpty())
                {
                    Node currNode=q.remove();
                    if (currNode==null) {
                        System.out.println();

                        if (q.isEmpty()) {
                            break;
                        } else {
                            q.add(null);
                        }
                    }
                    else {
                        System.out.print(currNode.data+" ");
                        if (currNode.left!=null)
                        {
                            q.add(currNode.left);
                        }
                        if (currNode.right!=null)
                        {
                            q.add(currNode.right);
                        }
                    }
                }



            }
        }

        public static void main(String[] args) {
            int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
            BinaryTree tree = new BinaryTree();
            Node root = tree.buildTree(nodes);
            //  tree.inoder(root);
            //  tree.preOrder(root);
         //   tree.postOder(root);
           // tree.postOder(root);
            tree.levelOder(root);

        }
    }


