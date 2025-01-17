package concept.dp;
// MATRIX MULTIPLICATION CHAIN
public class MCM {
    public static int mcmRecursion(int[] arr, int i, int j){
        if(i == j)
            return 0;
        int ans = Integer.MAX_VALUE;
        for (int k = i; k<=j-1; k++){
            int cost1 = mcmRecursion(arr,i,k);
            int cost2 = mcmRecursion(arr,k+1,j);
            int cost3 = arr[i-1]*arr[k]*arr[j];
            int finalCost = cost1+cost2+cost3;

            ans = Math.min(ans,finalCost);
        }
        return ans;
    }
    public static int mcmMemoization(int[] arr, int i, int j,int[][] dp){
        if(i == j)
            return 0;
        if (dp[i][j] != -1)
            return dp[i][j];

        int ans = Integer.MAX_VALUE;
        for (int k = i; k<=j-1; k++){
            int cost1 = mcmMemoization(arr,i,k,dp);
            int cost2 = mcmMemoization(arr,k+1,j,dp);
            int cost3 = arr[i-1]*arr[k]*arr[j];
            int finalCost = cost1+cost2+cost3;

            ans = Math.min(ans,finalCost);
        }
        return dp[i][j] = ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3};
        int n = arr.length;
        int[][] dp = new int[n][n];

        for (int i = 0; i<n; i++){
            for (int j = 0; j < n; j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(mcmRecursion(arr,1,n-1));
        System.out.println(mcmMemoization(arr,1,n-1,dp));
    }
}
