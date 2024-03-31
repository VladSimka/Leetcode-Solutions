package com.vladsimonenko.algorithms.lists;

import java.util.ArrayList;
import java.util.List;

public class RemoveNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) return null;
        ListNode current = head;

        List<ListNode> list = new ArrayList<>();

        while (current != null) {
            list.add(current);
            current = current.next;
        }

        ListNode afterSkip = null;

        if (n != 1) {
            afterSkip = list.get(list.size() - n + 1);
        }

        if (list.size() == n) {
            return head.next;
        }
        list.get(list.size() - n - 1).next = afterSkip;

        return head;

    }

}
