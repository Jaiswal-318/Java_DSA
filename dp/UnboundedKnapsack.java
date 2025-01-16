package concept.dp;

public class UnboundedKnapsack {
    public static int recursion(int[] val, int[] wt, int W, int n){
        if(n ==0 || W == 0)
            return 0;
        if(wt[n-1] <= W) {
            int ans1 = val[n - 1] + recursion(val, wt, W - wt[n - 1], n);
            int ans2 = recursion(val, wt, W, n - 1);

            return Math.max(ans1, ans2);
        }else
            return recursion(val,wt,W,n-1);
    }

    public static int memoization(int[] val, int[] wt,int[][]memo, int W, int n){

        if(n ==0 || W == 0)
            return 0;
        if(memo[n][W] != -1)
            return memo[n][W];

        if(wt[n-1] <= W) {
            int ans1 = val[n - 1] + memoization(val, wt,memo, W - wt[n - 1], n);
            int ans2 = memoization(val, wt, memo,W, n - 1);

            memo[n][W] =  Math.max(ans1, ans2);
        }else {
            memo[n][W] = memoization(val, wt, memo, W, n - 1);
        }
        return memo[n][W];
    }
    public static int tabulation(int[] val, int[] wt, int W,int n){
        int[][] dp = new int[n+1][W+1];

        for (int i = 0; i< dp.length;i++)
            dp[i][0] = 0;
        for (int j = 0; j< dp.length;j++)
            dp[0][j] = 0;

        for (int i = 1; i<n+1; i++){
            for (int j = 1; j<W+1; j++){
                int v = val[i-1];
                int w = wt[i-1];

                if(w<=j){
                    int incProfit = v+dp[i][j-w];
                    int excProfit = dp[i-1][j];
                    dp[i][j] = Math.max(incProfit,excProfit);
                }else {
                    int excProfit = dp[i-1][j];
                    dp[i][j] = excProfit;
                }
            }
        }
        return dp[n][W];
    }


    public static void main(String[] args) {
        int[] val = {15,14,10,45,30};
        int[] wt = {2,5,1,3,4};
        int W = 7;
        int[][] memo = new int[val.length+1][W+1];
        for (int i = 0; i < memo.length;i++){
            for (int j = 0; j < memo[0].length;j++)
                memo[i][j] = -1;
        }
        System.out.println("Recursion: "+recursion(val,wt,W,val.length));
        System.out.println("Memoization: "+memoization(val,wt,memo,W,val.length));
        System.out.println("Tabulation "+tabulation(val,wt,W,val.length));
    }
}
