class Solution {
    public char nextGreatestLetter(char[] letters, char target) {

        int asciiTarget = (int) target;
        int minGreaterAscii = Integer.MAX_VALUE;
        char answer = letters[0]; 
        for (int i = 0; i < letters.length; i++) {
            char ch = letters[i];
            int ascii = (int) ch;
            if (ascii > asciiTarget && ascii < minGreaterAscii) {
                minGreaterAscii = ascii;
                answer = ch;
            }
        }
        return answer;
    }
}
