package cn.crazyleaves.reading.notes.LeetCode.LinkedList.MiddleOfTheLInkedList;

import cn.crazyleaves.reading.notes.LeetCode.LinkedList.ListNode;

/**
 * {@link https://leetcode.com/problems/middle-of-the-linked-list/}
 * 我的思路 -> 两个指针，一个快进两步，一个快进一步，效率为O(N)
 * Fast and Slow Pointer 好处是省空间
 */
public class Solution {

    public ListNode middleNode(ListNode head) {
        ListNode oneStep = head;
        ListNode twoStep = head;

        while (twoStep.next != null){
            if (twoStep.next.next != null){
                oneStep = oneStep.next;
                twoStep = twoStep.next.next;
            } else {
                return oneStep.next;
            }
        }
        return oneStep;
    }
}
