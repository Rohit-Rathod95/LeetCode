class Solution {
    public int maxJumps(int[] arr, int d) {
        int n=arr.length;
        int ans=1;
        int[] dp=new int[n];
        for(int i=0;i<n;i++) {
            ans=Math.max(ans,dfs(arr,d,i,dp));
        }
        return ans;
    }
    public int dfs(int[] arr,int d,int i,int[] dp) {
        int n=arr.length;
        int maxVists=1;
        if(dp[i]!=0) {
            return dp[i];
        }
        //left checking 
        for(int j=i-1;j>=Math.max(0,i-d);j--) {
            if(arr[j]>=arr[i])
                break;
            maxVists=Math.max(maxVists,1+dfs(arr,d,j,dp));
        }
        //right checking 
        for(int j=i+1;j<=Math.min(n-1,i+d);j++) {
            if(arr[j]>=arr[i])
                break;
            maxVists=Math.max(maxVists,1+dfs(arr,d,j,dp));
        }
        dp[i]=maxVists;
        return dp[i];
    }
}