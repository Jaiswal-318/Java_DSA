package concept.hashing;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,1,3,1,5,1};
        int n = arr.length;
        Map<Integer,Integer> map = new HashMap<>();

        for (int j : arr) {
            map.put(j,map.getOrDefault(j,0)+1);
        }

        for(Integer key: map.keySet()){
            if(map.get(key)>n/3)
                System.out.println(key);
        }

    }
}
