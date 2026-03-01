class Solution {
    public int minPartitions(String n) {
        int count=0;
        char[] digits=n.toCharArray();
        while(true) {
            boolean allZero=true;
            for(int i=0;i<n.length();i++) {
                if(digits[i]>'0') {
                    allZero=false;
                    digits[i]--;
                }
            }
            if(allZero) {
                break;
            }
            count++;
        }
        return count;
    }
}