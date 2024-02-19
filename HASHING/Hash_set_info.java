package HASHING;

import java.util.HashSet;

public class Hash_set_info {
    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(2);
        System.out.println(set);
        set.remove(2);
        set.clear();
        if (set.contains(1))
        {
            System.out.println("lol");
        }
        else {
            System.out.println("NOOO");
        }


    }
}
