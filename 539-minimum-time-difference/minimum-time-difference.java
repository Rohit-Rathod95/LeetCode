class Solution {
    public int findMinDifference(List<String> timePoints) {
        int n=timePoints.size();
        int[] minutes=new int[n];
        for(int i=0;i<n;i++) {
            String time=timePoints.get(i);
            int hour=Integer.parseInt(time.substring(0,2));
            int min=Integer.parseInt(time.substring(3,5));

            minutes[i]=hour*60+min;
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                int diff=Math.abs(minutes[j]-minutes[i]);
                diff=Math.min(diff,1440-diff);
                ans=Math.min(ans,diff);
            }
        }
        return ans;
    }
}