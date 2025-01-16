package concept.dp;

public class CuttingRod {
    public static int maxProf(int[] L,int[] P, int l){
        int[][] dp = new int[L.length+1][l+1];

        for(int i = 0; i<L.length; i++)
            dp[i][0] = 0;
        for(int i = 0; i<L.length; i++)
            dp[0][i] = 0;

        for(int i = 1; i<dp.length; i++){
            for (int j = 1; j < dp[0].length; j++){
                if(L[i-1]<=j){
                    int incProf = P[i-1]+dp[i][j-L[i-1]];
                    int exProf = dp[i-1][j];
                    dp[i][j] = Math.max(incProf,exProf);
                }else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[L.length][l];
    }
    public static void main(String[] args) {
        int[] length = {1,2,3,4,5,6,7,8};
        int[] prices = {1,5,8,9,10,17,17,20};
        int rodLength = 8;

        System.out.println(maxProf(length,prices,rodLength));
    }
}
