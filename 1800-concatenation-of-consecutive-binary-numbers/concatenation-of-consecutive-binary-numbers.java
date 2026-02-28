class Solution {
    public int concatenatedBinary(int n) {
        long mod = 1_000_000_007;
        long result = 0;
        for (int i = 1; i <= n; i++) {
            String binary = Integer.toBinaryString(i);

            for (int j = 0; j < binary.length(); j++) {
                result = (result * 2 + (binary.charAt(j) - '0')) % mod;
            }
        }
        
        return (int) result;
    }
}