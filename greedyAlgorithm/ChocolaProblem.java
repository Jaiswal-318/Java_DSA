package concept.greedyAlgorithm;

import java.util.Arrays;
import java.util.Collections;

public class ChocolaProblem {
    public static void main(String[] args) {
        int m = 4, n = 6;
        Integer[] hzCost = {4,1,2};
        Integer[] vtCost = {2,1,3,1,4};
        Arrays.sort(hzCost, Collections.reverseOrder());
        Arrays.sort(vtCost,Collections.reverseOrder());

        int cost = 0;
        int vp = 1,hp = 1;
        int hCut = 0, vCut = 0;

        while (hCut < hzCost.length && vCut < vtCost.length){
            if(hzCost[hCut] >= vtCost[vCut]){
                cost += (hzCost[hCut]*vp);
                hp++;
                hCut++;
            }else{
                cost += (vtCost[vCut]*hp);
                vp++;
                vCut++;}
        }
        while (hCut < hzCost.length){
            cost += (hzCost[hCut]*vp);
            hp++;
            hCut++;
        }
        while (vCut < vtCost.length){
            cost += (vtCost[vCut]*hp);
            vp++;
            vCut++;
        }
        System.out.println("Total Cost: "+cost);
        System.out.println("Total Pieces: "+hp*vp);

        if(hp*vp == m*n)
            System.out.println("Mission Successful!");
    }
}
