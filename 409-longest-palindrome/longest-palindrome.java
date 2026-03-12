class Solution {
    public int longestPalindrome(String s) {
        int[] freq=new int[128];
        for(int i=0;i<s.length();i++) {
            freq[s.charAt(i)]++;
        }
        int length=0;
        boolean oddFound=false;
        for(int i=0;i<128;i++) {
            int count=freq[i];
            if(count%2==0) {
                length=length+count;
            } else {
                length=length+count-1;
                oddFound=true;
            }
        }
        if(oddFound) {
            length=length+1;
        }
        return length;
    }
}