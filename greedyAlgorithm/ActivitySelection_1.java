package concept.greedyAlgorithm;

import java.util.ArrayList;

public class ActivitySelection_1 {
    public static void main(String[] args) {
        int[] startTime = {10,12,20};
        int[] endTime = {20,25,30};  // Activities sorted on basis of end time

        ArrayList<Integer> act = new ArrayList<>();
        int maxAct = 0;

// Selecting first activities which end first
        maxAct = 1;
        int lastEnd = endTime[0];
        act.add(0);

// selecting other possible activities
        for(int i = 1; i<endTime.length; i++){
            if(startTime[i] >= lastEnd){
                maxAct++;
                lastEnd = endTime[i];
                act.add(i);}
        }
// OUTPUT
        for (int i: act)
            System.out.print("ACT-"+i+"  ");
        System.out.println("\nMax Act = "+maxAct);

    }
}
