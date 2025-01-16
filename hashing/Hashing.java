package concept.hashing;

import java.util.HashMap;
import java.util.TreeMap;

public class Hashing {
    public static void main(String[] args) {

        System.out.println("-------HASHMAP OPERATION-------");
        HashMap<String,Integer> hm = new HashMap<>();

        hm.put("apple",120);
        hm.put("banana",30);
        hm.put("orange",60);

        System.out.println(hm);

        System.out.println(hm.containsKey("apple"));

        hm.putIfAbsent("Coconut",20);
        System.out.println(hm);

        System.out.println("-------TREEMAP OPERATION-------");
        TreeMap<String,Integer> tm = new TreeMap<>();
        tm.put("apple",120);
        tm.put("banana",30);
        tm.put("orange",60);

        System.out.println(tm);

        System.out.println(tm.containsKey("apple"));

        tm.putIfAbsent("coconut",20);
        System.out.println(tm);


    }
}
