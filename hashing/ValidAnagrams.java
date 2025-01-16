package concept.hashing;

import java.util.HashMap;

public class ValidAnagrams {
    public static void main(String[] args) {
        String s1 = "keen" , t1 = "knee";
        boolean ans = true;

        HashMap<Character,Integer> hm1 = new HashMap<>();

        for(int i = 0; i<s1.length(); i++)
            hm1.put(s1.charAt(i), hm1.getOrDefault(s1.charAt(i),0)+1);

        for (int i = 0; i<t1.length();i++){
            if(hm1.containsKey(t1.charAt(i)) && hm1.get(t1.charAt(i))>=1){
                hm1.put(t1.charAt(i),hm1.get(t1.charAt(i))-1);
            }else{
                ans = false;
            }
        }
        System.out.println(ans);

    }
}
