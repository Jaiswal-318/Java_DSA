package concept.dp;

public class Mt_Valley {
    public static int count(int n){
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i<=n; i++){
            for (int j = 0; j<i; j++){
                int in = dp[j];
                int out = dp[i-j-1];
                dp[i] += in * out;
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n =3;
        System.out.println("Total Mt: "+count(n));
    }

}
