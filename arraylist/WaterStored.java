package concept.arraylist;

import  java.util.*;
public class WaterStored {

    public static int maxStoredWater(ArrayList<Integer> height){
        int maxS = 0;
        int i = 0;
        int j = height.size()-1;
        while (i<j) {
            if(height.get(i)<height.get(j)){
                int width = j-i;
                int currS = height.get(i)*width;
                maxS = Math.max(maxS, currS);
                i++;
            }else{
                int width = j-i;
                int currS = height.get(j)*width;
                maxS = Math.max(maxS, currS);
                j--;
            }
        }
        return maxS;
    }
    public static void main(String[] a){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(8);
        height.add(3);
        height.add(7);
        int ans =  maxStoredWater(height);
        System.out.println(ans);


    }
}
