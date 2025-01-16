package concept.greedyAlgorithm;

import java.util.Arrays;

public class MinAbsDiff {
    public static void main(String[] args) {
        int[] a = {4,1,8,7};
        int[] b = {2,3,6,5};
        int minDiff = 0;

        Arrays.sort(a);
        Arrays.sort(b);

        for(int i = 0; i < a.length; i++)
            minDiff = minDiff + Math.abs(a[i]-b[i]);

        System.out.println("Min. Difference: "+minDiff);
    }
}
