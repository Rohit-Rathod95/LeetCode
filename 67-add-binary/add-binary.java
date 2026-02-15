class Solution {
    public String addBinary(String a, String b) {
         StringBuilder sb = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;

        int carry = 0;
        while (i >= 0 || j >= 0) {
            int bit1 = 0;
            int bit2 = 0;
            if (i >= 0) {
                bit1 = a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                bit2 = b.charAt(j) - '0';
                j--;
            }
            int sum = bit1 + bit2 + carry;

            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry == 1) {
            sb.append('1');
        }
        return sb.reverse().toString();
    }
}