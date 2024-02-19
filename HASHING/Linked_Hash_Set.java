package HASHING;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Linked_Hash_Set {
    public static void main(String[] args) {
        HashSet<String >cities=new HashSet<>();
        cities.add("nepal");
        cities.add("noida");
        cities.add("kathmandu");
        System.out.println(cities);


        LinkedHashSet<String>lhs=new LinkedHashSet<>();
        lhs.add("nepal");
        lhs.add("noida");
        lhs.add("kathmandu");
        System.out.println(lhs);
        lhs.remove("nepal");
        System.out.println(lhs);




    }
}
