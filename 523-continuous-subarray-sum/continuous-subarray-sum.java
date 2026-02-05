class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
        int preRem=0;
        int currSum=0;
        for(int i=0;i<nums.length;i++) {
            int num=nums[i];
            currSum=currSum+num;
            int rem=currSum%k;
            if(set.contains(rem)) {
                return true;
            }
            set.add(preRem);
            preRem=rem;
        }
        return false;
    }
}