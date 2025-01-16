package concept.dp;

public class CoinChange {
    public static int coinChange(int[] coin, int ch){
        int[][] dp = new int[coin.length+1][ch+1];

        for (int i = 0; i<coin.length+1; i++) {
            dp[i][0] = 1;
        }
        for(int i = 1; i < coin.length+1; i++){
            for (int j = 1; j<ch+1; j++){
                if(coin[i-1] <= j){
                    int ans1 = dp[i][j-coin[i-1]];  // INCLUDE
                    int ans2 = dp[i-1][j];         //  EXCLUDE
                    dp[i][j] = ans1+ans2;
                }else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[coin.length][ch];
    }
    public static void main(String[] args) {
        int[] coin = {2,5,3,6};
        int change = 10;

        System.out.println(coinChange(coin,change));
    }
}
