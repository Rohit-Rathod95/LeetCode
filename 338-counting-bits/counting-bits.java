class Solution {

    public int countOnes(int n) {
        if (n == 0) return 0;
        return (n % 2) + countOnes(n / 2);
    }

    public int[] countBits(int n) {
        int[] ans = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            ans[i] = countOnes(i);
        }
        return ans;
    }
}