class Solution {

    public boolean wordBreak(String s, List<String> wordDict) {

        Boolean dp[] = new Boolean[s.length()];

        return solve(s, wordDict, 0, dp);
    }

    public boolean solve(String s, List<String> wordDict, int index, Boolean[] dp) {

        if (index == s.length())
            return true;

        if (dp[index] != null)
            return dp[index];

        for (String word : wordDict) {

            if (s.startsWith(word, index)) {

                if (solve(s, wordDict, index + word.length(), dp)) {
                    dp[index] = true;
                    return true;
                }
            }
        }

        dp[index] = false;
        return false;
    }
}