package concept.dp;

import java.util.Arrays;
import java.util.HashSet;

// LONGEST INCREASING SUBSEQUENCE
public class LIS {
    public static int Lis(int[] arr1){

        HashSet<Integer> hs = new HashSet<>();
        for(int i: arr1)
            hs.add(i);
        int i = 0;
        int[] arr2 = new int[hs.size()];
        for (int e: hs){
            arr2[i] = e;
            i++;
        }
        Arrays.sort(arr2);

        return Lcs(arr1,arr2);
    }
    public static int Lcs(int[] arr1, int[] arr2){
        int m = arr1.length;
        int n = arr2.length;
        int[][] dp = new int[m+1][n+1];

        for (int i = 1; i<m+1;i++){
            for (int j = 1; j<n+1; j++){
                if(arr1[i-1] == arr2[j-1]){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else {
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1,ans2);
                }
            }
        }
        return dp[m][n];
    }
    public static void main(String[] args) {
        int[] arr = {50,3,10,7,40,80};

        System.out.println(Lis(arr));
    }
}
