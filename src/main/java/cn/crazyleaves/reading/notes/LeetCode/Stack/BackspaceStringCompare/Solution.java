package cn.crazyleaves.reading.notes.LeetCode.Stack.BackspaceStringCompare;

/**
 * {@link https://leetcode.com/problems/backspace-string-compare/}
 */
public class Solution {

    private String getFinalString(String s){
        char[] chars = new char[s.length()];
        int index = 0;
        for (char c : s.toCharArray()) {
            if (c == '#'){
                if (index != 0){
                    index -= 1;
                }
            } else {
                chars[index] = c;
                index += 1;
            }
        }
        return String.valueOf(chars, 0, index);
    }

    public boolean backspaceCompare(String S, String T) {
        return getFinalString(S).equals(getFinalString(T));
    }
}
