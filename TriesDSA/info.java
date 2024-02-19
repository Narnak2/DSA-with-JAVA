package TriesDSA;

public class info {
    static class Node
    {
        Node children[]=new Node[26];
        boolean eow=false;
        Node (){
            for (int i=0;i<26;i++)
            {
                children [i]=null;
            }
        }
    }
    public static Node root;
    public static void insert(String words)
    {
        Node cur=root;
        for (int level=0;level<words.length();level++)
        {
            int idx=words.charAt(level)-'a';
            if (cur.children[idx]==null)
            {
                cur.children[idx]=new Node();
            }
            cur=cur.children[idx];
        }
        cur.eow=true;
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

    public static void main(String[] args) {
        String words[] = {"the", "a", "there", "their", "any", "three"};
        for (int i=0;i<words.length;i++)
        {
            insert(words[i]);
        }
        System.out.println(search("three"));
        System.out.println(search("thor"));




    }
}

