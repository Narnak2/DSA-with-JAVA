package HASHING;

import javax.sound.midi.Soundbank;
import java.util.HashMap;

public class Intro {
    //Hash map
    public static void main(String[] args) {
        //Create hashmap
        HashMap<String,Integer>mp=new HashMap<>();
        //Insert O(1)
        mp.put("Nepal",20304);
        mp.put("America",200123);
        mp.put("japan",200);
        mp.put("india",200);
        mp.put("bhutan",20023);
    //    System.out.println(mp);

        //get
       int population= mp.get("Nepal");
        System.out.println(population);

        // ContainsKey - 0(1) boolean
        System.out.println(mp.containsKey("Nepal"));
        System.out.println(mp.containsKey("Nel"));

        // Remove 0(1)
        System.out.println(mp.remove("Nepal"));
        System.out.println(mp);


        // Size
        System.out.println(mp.size());

        // Is empty
        mp.clear();
        System.out.println(mp);
        System.out.println(mp.isEmpty());







    }
}
