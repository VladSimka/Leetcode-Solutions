package com.vladsimonenko.algorithms.lists;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum = new ListNode();
        ListNode current = sum;
        int remainder = 0;
        while (l1 != null || l2 != null) {
            current.next = new ListNode();
            current = current.next;

            int fullSum = remainder;
            if (l1 != null) {
                fullSum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                fullSum += l2.val;
                l2 = l2.next;
            }
            remainder = fullSum / 10;
            current.val = fullSum % 10;

        }

        if (remainder != 0) {
            current.next = new ListNode(remainder);
        }

        return sum.next;
    }
}
