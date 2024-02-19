package HASHING;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Linked_HashMap {
    public static void main(String[] args) {
        LinkedHashMap<String ,Integer>lhm=new LinkedHashMap<>();
        lhm.put("India",300);
        lhm.put("helo",100);
        lhm.put("nepal",40);
        lhm.put("dia",400);
        System.out.println(lhm);

        HashMap<String ,Integer> hm=new HashMap<>();
        hm.put("India",300);
        hm.put("helo",100);
        hm.put("nepal",40);
        hm.put("India",400);
        System.out.println(hm);
    }
}
