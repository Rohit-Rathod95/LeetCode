class Solution {
    public int[] separateDigits(int[] nums) {
        int n=nums.length;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++) {
            int num=nums[i];
            String s=String.valueOf(num);
            for(int j=0;j<s.length();j++) {
                list.add(s.charAt(j)-'0');
            }
        }
        int[] ans=new int[list.size()];
        for(int i=0;i<list.size();i++) {
            ans[i]=list.get(i);
        }
        return ans;
    }
}