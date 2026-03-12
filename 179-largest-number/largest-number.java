class Solution {
    public String largestNumber(int[] nums) {
        String[] arr=new String[nums.length];
        for(int i=0;i<nums.length;i++) {
            arr[i]=nums[i]+"";
        } 
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
                String option1=arr[i]+arr[j];
                String option2=arr[j]+arr[i];
                if(option2.compareTo(option1)>0) {
                    String temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        if(arr[0].equals("0")) return "0";
        String result="";
        for(int i=0;i<arr.length;i++) {
            String s=arr[i];
            result=result+s;
        }
        return result;
    }
}