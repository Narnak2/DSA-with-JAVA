package HASHING;

import java.util.HashMap;
import java.util.Set;

public class IterationOnHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("India",9);
        hm.put("China",140);
        hm.put("US",90);
        hm.put("Nepal",5);
        hm.put("Indonesia",20);

        // Iterate
        //EntrySet() pair set

        Set<String>keys=hm.keySet();
        System.out.println(keys);

        for (String k : keys)
        {
            System.out.println("Key="+k+",  value=="+hm.get(k));
        }

    }
}
