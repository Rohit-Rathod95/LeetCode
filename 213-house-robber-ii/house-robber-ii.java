class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) {
            return nums[0];
        }

        //exclude Last
        int[] dp1=new int[n];
        Arrays.fill(dp1,-1);
        int case1=f(n-2,nums,dp1,0);

        //exclude first 
        int[] dp2=new int[n];
        Arrays.fill(dp2,-1);
        int case2=f(n-1,nums,dp2,1);


        return Math.max(case1,case2);
    }
    public int f(int index,int[] nums,int[] dp,int start) {
        if(index<start) {
            return 0;
        }
        if(index==start) {
            return nums[start];
        }
        if(dp[index] !=-1) {
            return dp[index];
        }
        int pick=nums[index]+f(index-2,nums,dp,start);
        int notPick=0+f(index-1,nums,dp,start);
        return dp[index]=Math.max(pick,notPick);
    }
}