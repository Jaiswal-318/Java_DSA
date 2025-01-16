package concept.dp;

public class StringConversion {
    public static int totOperation(String s1, String s2){
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m+1][n+1];

        for (int i = 0; i<m+1; i++)
            dp[i][0] = i;
        for (int i = 0; i<n+1; i++)
            dp[0][i] = i;

        for (int i = 1; i<m+1; i++){
            for (int j = 1; j<n+1; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    int ans1 = dp[i-1][j-1] + 1; // REPLACE
                    int ans2 = dp[i-1][j] + 1;  // DELETE
                    int ans3 = dp[i][j-1] + 1;

                    dp[i][j] = Math.min(ans1,Math.min(ans2,ans3));
                }
            }
        }
        return dp[m][n];
    }
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "sbd";

        System.out.println(totOperation(s1,s2));
    }
}
