package com.vladsimonenko.algorithms.lists;

public class DeleteDuplicates {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode newHead = head;
        while (head != null && head.next != null) {
            if (head.val == head.next.val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }

        return newHead;
    }
}
