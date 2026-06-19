class Solution {
    public int largestAltitude(int[] gain) {
        int maxHeight=0;
        int currHeight=0;
        for(int i=0;i<gain.length;i++) {
            int g=gain[i];
            currHeight=currHeight+g;
            maxHeight=Math.max(maxHeight,currHeight);
        }
        return maxHeight;
     }
}