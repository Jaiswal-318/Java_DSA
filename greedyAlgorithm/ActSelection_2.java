package concept.greedyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActSelection_2 {
    public static void main(String[] args) {
        int[] startTime = {5,1,8,3,5,0};
        int[] endTime = {9,2,9,4,7,6};
        ArrayList<Integer> al = new ArrayList<>();

// Sorting ACT Based on end time
        int[][] act = new int[startTime.length][3];
        for (int i = 0; i<startTime.length; i++){
            act[i][0] = i;
            act[i][1] = startTime[i];
            act[i][2] = endTime[i];}

        Arrays.sort(act, Comparator.comparingInt(o->o[2]));

// Selecting first ACT:
        al.add(0);
        int lastEnd = act[0][2];
        int maxAct = 1;

// Selecting Other Possible ACT:
        for(int i = 1; i<startTime.length; i++){
            if (act[i][1] >= lastEnd){
                maxAct++;
                lastEnd = act[i][2];
                al.add(i);}
        }

        System.out.println("Max Act: "+maxAct);
        for (int i: al)
            System.out.print("Act-"+i+" ");
    }
}
