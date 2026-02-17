class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder res=new StringBuilder();
        int n=columnNumber;
        while(n>0) {
            n--;
           res.insert(0,(char)((n%26)+'A'));
           n=n/26;
        }
        return res.toString();
    }
}