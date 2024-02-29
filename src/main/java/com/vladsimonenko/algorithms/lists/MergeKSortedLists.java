package com.vladsimonenko.algorithms.lists;

import java.util.HashSet;
import java.util.Set;

public class MergeKSortedLists {

    public static void main(String[] args) {
        ListNode list1 = null;
        ListNode list2 = new ListNode(1);
//        ListNode next = list1;
//        next.next = new ListNode(2);
//        next = next.next;
//        next.next = new ListNode(5);
//        next = next.next;

        mergeKLists(new ListNode[]{list1, list2});
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode list = new ListNode();
        ListNode prev = list;
        ListNode current = list;
        int countNulls = 0;

        Set<Integer> wasNull = new HashSet<>();

        while (countNulls != lists.length) {
            int index = 0;
            int min = Integer.MAX_VALUE;

            for (int i = 0; i < lists.length; i++) {
                if (lists[i] == null) {
                    if (!wasNull.contains(i)) {
                        countNulls++;
                        wasNull.add(i);
                    }
                    continue;
                }
                ListNode currentList = lists[i];
                if (lists[i].val < min) {
                    index = i;
                    min = lists[i].val;
                }

            }

            if (lists[index] != null) {
                current.val = lists[index].val;
                ListNode node = new ListNode();
                current.next = node;
                prev = current;
                current = current.next;
                lists[index] = lists[index].next;
            }
        }
        prev.next = null;
        return (list.val == 0 && list.next == null) ? null : list;
    }
}
