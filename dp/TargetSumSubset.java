package concept.dp;

public class TargetSumSubset {
    public static boolean targetSumSubset(int[] nums,int target){

        boolean[][] dp = new boolean[nums.length+1][target+1];

        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = true;
        }
        for (int i = 1; i < dp.length; i++){
            for (int j = 1; j < dp[0].length; j++){
                int v = nums[i-1];
                if(v <= j && dp[i-1][j-v])
                    dp[i][j] = true;
                else if(dp[i-1][j])
                    dp[i][j] = true;
            }
        }
        return dp[nums.length][target];
    }
    public static void main(String[] args) {
        int[] nums = {4,2,7,1,3};
        int target = 10;

        System.out.println(targetSumSubset(nums,target));
    }
}
