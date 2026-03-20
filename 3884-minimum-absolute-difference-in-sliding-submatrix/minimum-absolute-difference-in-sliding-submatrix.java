class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] ans = new int[m - k + 1][n - k + 1];

        // Edge case
        if (k == 1) {
            for (int i = 0; i < m; i++) {
                Arrays.fill(ans[i], 0);
            }
            return ans;
        }

        for (int i = 0; i <= m - k; i++) {
            for (int j = 0; j <= n - k; j++) {

                int[] arr = new int[k * k];
                int idx = 0;

                // collect elements
                for (int x = i; x < i + k; x++) {
                    for (int y = j; y < j + k; y++) {
                        arr[idx++] = grid[x][y];
                    }
                }

                Arrays.sort(arr);

                int minDiff = Integer.MAX_VALUE;
                Integer prev = null;

                // skip duplicates while comparing
                for (int x = 0; x < arr.length; x++) {
                    if (prev != null && arr[x] != prev) {
                        minDiff = Math.min(minDiff, arr[x] - prev);
                    }
                    prev = arr[x];
                }

                ans[i][j] = (minDiff == Integer.MAX_VALUE) ? 0 : minDiff;
            }
        }

        return ans;
    }
}