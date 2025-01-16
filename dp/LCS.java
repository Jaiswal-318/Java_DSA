package concept.dp;

 // LONGEST COMMON SUBSEQUENCE
public class LCS {
    public static int LCS_Recursion(String s1, int n1, String s2, int n2){
        if(n1 == 0 || n2 ==0) {
            return 0;
        }
        if(s1.charAt(n1-1) == s2.charAt(n2-1))
            return LCS_Recursion(s1,n1-1,s2,n2-1)+1;
        else {
            int call1 = LCS_Recursion(s1,n1,s2,n2-1);
            int call2 = LCS_Recursion(s1,n1-1,s2,n2);
            return Math.max(call2,call1);
        }
    }
    public static int LCS_Memoization(String s1,int n1, String s2, int n2,int[][] dp){
        if(n1 == 0 || n2 ==0) {
            return 0;
        }if(dp[n1][n2] != -1)
            return dp[n1][n2];
        if(s1.charAt(n1-1) == s2.charAt(n2-1))
            return dp[n1][n2] = LCS_Memoization(s1,n1-1,s2,n2-1,dp)+1;
        else {
            int call1 = LCS_Memoization(s1,n1,s2,n2-1,dp);
            int call2 = LCS_Memoization(s1,n1-1,s2,n2,dp);
            return dp[n1][n2] = Math.max(call2,call1);
        }
    }
    public static int LCS_Tabulation(String s1,int n, String s2, int m){
        int[][] dp = new int[n+1][m+1];

        for (int i = 1; i<n+1; i++){
            for (int j = 1; j<m+1; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }else{
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1,ans2);
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ace";
        int n = s1.length();
        int m = s2.length();

        int[][] dp = new int[n+1][m+1];
        for(int i = 0; i<n+1; i++){
            for (int j = 0; j<m+1; j++)
                dp[i][j] = -1;
        }
        System.out.println("Recursion: "+LCS_Recursion(s1,s1.length(),s2,s2.length()));
        System.out.println("Memoization: "+LCS_Memoization(s1,n,s2,m,dp));
        System.out.println("Tabulation: "+LCS_Tabulation(s1,s1.length(),s2,s2.length()));
    }
}
