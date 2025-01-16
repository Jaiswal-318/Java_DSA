package concept.dp;

import java.util.Arrays;

public class ClimbingStairs {
    public static int recursion(int n){
        if(n == 0)
            return 1;
        if(n<0)
            return 0;

        return recursion(n-1)+recursion(n-2);
    }
    public static int memorization(int n, int [] memo){
        if(n<0)
            return 0;
        memo[0] = 1;

        if(memo[n] != -1)
            return memo[n];

        memo[n] = memorization(n-1,memo) + memorization(n-2,memo);
        return memo[n];
    }
    public static int tabulation(int n){
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i<=n; i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println("Using Recursion: " + recursion(n));

        int[] memo = new int[n+1];
        Arrays.fill(memo,-1);
        System.out.println("memorization: "+memorization(n,memo));

        System.out.println("Tabulation: "+tabulation(n));
    }
}
