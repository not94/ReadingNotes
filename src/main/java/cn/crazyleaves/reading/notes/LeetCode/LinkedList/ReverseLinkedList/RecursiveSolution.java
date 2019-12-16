package cn.crazyleaves.reading.notes.LeetCode.LinkedList.ReverseLinkedList;


import cn.crazyleaves.reading.notes.LeetCode.LinkedList.ListNode;

public class RecursiveSolution {

    private ListNode reverseListNode(ListNode cur, ListNode next){
        if (next.next == null){
            next.next = cur;
            return next;
        }
        ListNode lastNode = reverseListNode(next, next.next);
        next.next = cur;
        return lastNode;
    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }

        return reverseListNode(null, head);
    }
}
