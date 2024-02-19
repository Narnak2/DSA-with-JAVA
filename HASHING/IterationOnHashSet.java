package HASHING;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class IterationOnHashSet {
    public static void main(String[] args) {
        HashSet<String >cities=new HashSet<>();
        cities.add("nepal;");
        cities.add("noida");
        cities.add("kathmandu");
//        Iterator it=cities.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
        //System.out.println(cities);
//        }
        for (String city : cities)
        {
            System.out.println(city);

        }
    }
}
