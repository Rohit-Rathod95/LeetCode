class Solution {

    public int[] stringIndices(String[] wordsContainer, String[] wordsQuery) {
        HashMap<Character, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < wordsContainer.length; i++) {
            String word = wordsContainer[i];
            char lastChar = word.charAt(word.length() - 1);
            map.putIfAbsent(lastChar, new ArrayList<>());
            map.get(lastChar).add(i);
        }
        int defaultIndex = 0;
        for (int i = 1; i < wordsContainer.length; i++) {
            if (wordsContainer[i].length() < wordsContainer[defaultIndex].length()) {
                defaultIndex = i;
            }
        }
        int[] ans = new int[wordsQuery.length];
        for (int i = 0; i < wordsQuery.length; i++) {
            String query = wordsQuery[i];
            char lastChar = query.charAt(query.length() - 1);
            int bestIndex = defaultIndex;
            int bestSuffixLength = 0;
            List<Integer> candidates = map.getOrDefault(lastChar, new ArrayList<>());

            for (int idx : candidates) {
                String container = wordsContainer[idx];
                int suffixLength = CommonSuffixLength(container, query);
                if (suffixLength > bestSuffixLength) {
                    bestSuffixLength = suffixLength;
                    bestIndex = idx;
                } 
                else if (suffixLength == bestSuffixLength) {
                    if (wordsContainer[idx].length() < wordsContainer[bestIndex].length()) {
                        bestIndex = idx;
                    }
                }
            }
            ans[i] = bestIndex;
        }
        return ans;
    }
    public int CommonSuffixLength(String container, String query) {
        int i = container.length() - 1;
        int j = query.length() - 1;
        int count = 0;
        while (i >= 0 && j >= 0) {
            if (container.charAt(i) != query.charAt(j)) {
                break;
            }
            count++;
            i--;
            j--;
        }
        return count;
    }
}