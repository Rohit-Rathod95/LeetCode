class Solution {

    public int shipWithinDays(int[] weights, int days) {

        int left = 0;
        int right = 0;
        for (int i=0;i<weights.length;i++) {
            int w=weights[i];
            left = Math.max(left, w);
            right += w;              
        }
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (requiredDays(weights, mid) <= days) {
                right = mid - 1;  
            } else {
                left = mid + 1;  
            }
        }
        return left;
    }
    private int requiredDays(int[] weights, int capacity) {
        int days = 1;
        int load = 0;
        for (int i=0;i<weights.length;i++) {
            int w=weights[i];
            if (load + w > capacity) {
                days++;
                load = 0;
            }
            load += w;
        }
        return days;
    }
}
