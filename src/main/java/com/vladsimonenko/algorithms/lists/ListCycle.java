package com.vladsimonenko.algorithms.lists;

public class ListCycle {

    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode next = head;
        ListNode doubleNext = head;


        while (next != null && doubleNext != null) {
            next = next.next;


            if (doubleNext.next != null) {
                doubleNext = doubleNext.next.next;
            } else {
                return false;
            }

            if (next == doubleNext) return true;
        }

        return false;
    }
}
