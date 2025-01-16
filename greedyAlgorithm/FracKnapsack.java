package concept.greedyAlgorithm;

import java.util.*;
public class FracKnapsack {
    public static void main(String[] args) {
        int[] wt = {10,20,30};
        int[] profit = {60,100,120};
        int maxWt = 50;
        int totProfit = 0;

        double[][] ratio = new double[wt.length][2];
        for (int i = 0; i<wt.length; i++){
            ratio[i][1] =  profit[i]/(double)wt[i];
            ratio[i][0] = i;}
        Arrays.sort(ratio, Comparator.comparingDouble((double[] o)->o[1]).reversed());

        for (int i = 0; i<wt.length; i++){
            int idx = (int)ratio[i][0];
            if (maxWt >= wt[idx]){
                totProfit = totProfit + profit[idx];
                maxWt = maxWt-wt[idx];

            }else {
                totProfit = totProfit + maxWt*(int)ratio[i][1];}
        }
        System.out.println("Total profit: "+totProfit);
    }
}
