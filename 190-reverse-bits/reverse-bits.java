class Solution {
    public int reverseBits(int n) {
        long result=0;
        for(int i=0;i<32;i++) {
            int lastDigit=n%2;
            result=result*2+lastDigit;
            n=n/2;
        }
        return (int) result;
    }
}