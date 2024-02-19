package TriesDSA;

public class longestWordWithALlPrefixes {

    static class Node {
        Node[] children = new Node[26];
        boolean eow;

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();
    public static String ans = "";

    public static void insert(String word) {
        int level = 0;
        int len = word.length();
        int idx = 0;
        Node curr = root;
        for (; level < len; level++) {
            idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static void longestWord(Node root, StringBuilder temp) {
        if (root == null) {
            return;
        }
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null && root.children[i].eow) {
                char ch = (char) (i + 'a');
                temp.append(ch);
                if (temp.length() > ans.length() || (temp.length() == ans.length() && temp.toString().compareTo(ans) < 0)) {
                    ans = temp.toString();
                }
                longestWord(root.children[i], temp);
                // No need to deleteCharAt as temp is modified in each recursive call
            }
        }
    }

    public static void main(String[] args) {
        String word[] = {"a", "banana", "app", "ap", "apply", "apple"};
        for (int i = 0; i < word.length; i++) {
            insert(word[i]);
        }

        longestWord(root, new StringBuilder());
        System.out.println(ans);
    }
}
