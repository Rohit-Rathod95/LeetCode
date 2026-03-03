class Solution {
    public char findKthBit(int n, int k) {
        
        StringBuilder s = new StringBuilder("0");  
        for (int i = 2; i <= n; i++) {
            int size = s.length();
            StringBuilder inverted = new StringBuilder();
            for (int j = 0; j < size; j++) {
                if (s.charAt(j) == '0') {
                    inverted.append('1');
                } else {
                    inverted.append('0');
                }
            }
            inverted.reverse();
            s.append('1');
            s.append(inverted);
        }
        
        return s.charAt(k - 1);
    }
}