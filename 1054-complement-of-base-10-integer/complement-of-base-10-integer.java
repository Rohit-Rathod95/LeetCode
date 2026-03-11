class Solution {
    public int bitwiseComplement(int n) {
        String bin = Integer.toBinaryString(n);
        StringBuilder flipped = new StringBuilder();
        for (char c : bin.toCharArray()) {
            if (c == '0') flipped.append('1');
            else flipped.append('0');
        }
        return Integer.parseInt(flipped.toString(), 2);
    }
}