class Solution {
    public int minCostClimbingStairs(int[] cost) {
        // sbse phle length nikal bhai
        int n = cost.length;
        // dp array bana le.. store kr har step pr chadne ka minimum ky cost aayega
        int dp[]= new int[n+1];
        dp[0]=0;
        dp[1]=0; // phle to step pr pahynchne ka cost zero he h, qustion me likha ha
        for(int i=2; i<=n;i++){
            dp[i]= Math.min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-2]);
        }
        return dp[n];
    }
}
