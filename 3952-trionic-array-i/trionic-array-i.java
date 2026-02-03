class Solution {
    public boolean isTrionic(int[] nums) {
        int n=nums.length;
        if(n<4) {
            return false;
        }
        int i=1; 
        while(i<n && nums[i]>nums[i-1]) {
            i++;
        }
        if(i==1 || i==n) {
            return false; // no increase or reached end
        }  
        while(i<n && nums[i]<nums[i-1]) {
            i++;
        } 
        if(i==n) {
            return false; // no final increase part
        } 
        while(i<n && nums[i]>nums[i-1]) {
            i++;
        }
        return i==n;
    }
}