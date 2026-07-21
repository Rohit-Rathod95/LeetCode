class Solution {
    public int maxActiveSectionsAfterTrade(String s) {

        s = "1" + s + "1";
        int n = s.length();

        int ones = 0;
        for (int i = 1; i < n - 1; i++) {
            if (s.charAt(i) == '1')
                ones++;
        }

        int ans = ones;

        ArrayList<Integer> len = new ArrayList<>();
        ArrayList<Character> type = new ArrayList<>();

        int i = 0;
        while (i < n) {

            char ch = s.charAt(i);
            int j = i;

            while (j < n && s.charAt(j) == ch)
                j++;

            type.add(ch);
            len.add(j - i);

            i = j;
        }

        for (int k = 1; k < type.size() - 1; k++) {

            if (type.get(k) == '1') {

                int leftZero = 0;
                int rightZero = 0;

                if (type.get(k - 1) == '0')
                    leftZero = len.get(k - 1);

                if (type.get(k + 1) == '0')
                    rightZero = len.get(k + 1);

                ans = Math.max(ans, ones + leftZero + rightZero);
            }
        }

        return ans;
    }
}