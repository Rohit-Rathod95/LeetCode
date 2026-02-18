class Solution {
    public boolean hasAlternatingBits(int n) {
        String bin="";
        while(n>0) {
            bin=bin+(n%2);
            n=n/2;
        }
        for(int i=1;i<bin.length();i++) {
            if(bin.charAt(i)==bin.charAt(i-1)) {
                return false;
            }
        }
        return true;
    }
}