package TriesDSA;

public class startsWithProblem {
    static class Node
    {
        Node [] children=new Node[26];
        boolean eow;
        public Node(){
            for (int i=0;i<26;i++)
            {
                children[i]=null;
            }
        }
    }
    public static Node root=new Node();
    public static void insert(String word)
    {
        int level=0;
        int len=word.length();
        int idx=0;
        Node curr=root;
        for (;level<len;level++)
        {
            idx=word.charAt(level)-'a';
            if (curr.children[idx]==null)
            {
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx];
        }
        curr.eow=true;
    }
    public static boolean search(String key)
    {
        Node cur=root;
        for (int level=0;level<key.length();level++)
        {
            int idx=key.charAt(level)-'a';
            if (cur.children[idx]==null)
            {
                return false;
            }
            cur=cur.children[idx];
        }
        return cur.eow==true;

    }
    public static boolean startsWith(String prefix)
    {
        Node curr=root;
        for (int i=0;i<prefix.length();i++)
        {
            int idx=prefix.charAt(i)-'a';
            if (curr.children[idx]==null)
            {
                return false;
            }
            curr=curr.children[idx];
        }
        return true;
    }

    public static void main(String[] args) {
        String word[]={"apple","app","mango","man","woman"};
        String prefix1="app";
        String prefix2="moon";
        for (int i=0;i<word.length;i++)
        {
            insert(word[i]);
        }
        System.out.println(startsWith(prefix1));
        System.out.println(startsWith(prefix2));


    }
}
