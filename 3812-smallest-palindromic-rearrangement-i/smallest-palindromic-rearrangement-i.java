class Solution {
    public String smallestPalindrome(String s) {
        int[] freq=new int[26];
        for(char ch: s.toCharArray()) {
            freq[ch-'a']++;
        }
        char middle=0;
        StringBuilder left=new StringBuilder();
        for(int i=0;i<26;i++) {
            if(freq[i]%2==1) {
                middle=(char)('a'+i);
            }
            for(int j=0;j<freq[i]/2;j++) {
                left.append((char)('a'+i));
            }
        }
        StringBuilder ans=new StringBuilder();
        ans.append(left);
        if(middle!=0) {
            ans.append(middle);
        }
        StringBuilder right=left.reverse();
        ans.append(right);

        return ans.toString();
    }
}