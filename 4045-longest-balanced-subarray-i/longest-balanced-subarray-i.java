class Solution {
    public int longestBalanced(int[] nums) {
        int n=nums.length;
        int maxLen=0;
        for(int i=0;i<n;i++) {
            Set<Integer> oddSet=new HashSet<>();
            Set<Integer> evenSet=new HashSet<>();
            for(int j=i;j<n;j++) {
                int num=nums[j];
                if(num%2==0) {
                    evenSet.add(num);
                } else {
                    oddSet.add(num);
                }

                if(oddSet.size()==evenSet.size()) {
                    maxLen=Math.max(maxLen,j-i+1);
                }
            } 
        }
        return maxLen;
    }
}