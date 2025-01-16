package concept.dp;

// LONGEST COMMON SUBSTRING
public class LCS_1 {
    public static int longestCommonSubString(String s1,String s2){
        int ans = 0;
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m+1][n+1];

        for (int i = 1; i<m+1; i++){
            for (int j = 1; j<n+1; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                    ans = Math.max(ans,dp[i][j]);
                }else{
                    dp[i][j] = 0;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s1 = "ABCDE";
        String s2 = "ABCGE";

        System.out.println(longestCommonSubString(s1,s2));
    }
}
