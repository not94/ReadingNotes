package cn.crazyleaves.reading.notes.LeetCode.Stack.RemoveAllAdjacentDuplicatesInString;

/**
 * {@link https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/}
 */
public class Solution {

    public String removeDuplicates(String S) {
        char[] stack = new char[S.length()];
        int stackIndex = 0;
        for (char c : S.toCharArray()) {
            if (stackIndex == 0 || c != stack[stackIndex - 1]){
                stack[stackIndex] = c;
                stackIndex += 1;
            } else {
                stackIndex -= 1;
            }
        }
        return String.valueOf(stack, 0, stackIndex);
    }
}
