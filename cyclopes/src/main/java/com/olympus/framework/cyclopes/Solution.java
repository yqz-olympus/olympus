package com.olympus.framework.cyclopes;

import org.w3c.dom.NodeList;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        while (l1 != null || l2 != null) {
            if (l1 == null && l2 != null) {

            }
        }


        return null;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        ListNode l01 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l02 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode listNode = s.mergeTwoLists(l01, l02);

        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }
}