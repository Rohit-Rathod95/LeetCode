class Solution {
    public int countBinarySubstrings(String s) {
        int ans=0;
        for(int i=1;i<s.length();i++) {
            if(s.charAt(i)!=s.charAt(i-1)) {
                int left=i-1;
                int right=i;
                char leftChar=s.charAt(left);
                char rightChar=s.charAt(right);
                while(left>=0 && right<s.length() && s.charAt(left)==leftChar && s.charAt(right)==rightChar) {
                    ans++;
                    left--;
                    right++;
                }
            }
        }
        return ans;
    }
}