class Solution {


    public ListNode removeElements(ListNode head, int val) {

        ListNode node = null;

        if (head != null) {
            node = removeElements(head.next, val);
        }

        return null;
    }

    /*
     1->2->6->3->4->5->6
    */
    public static void main(String[] args) {
        ListNode list01 = new ListNode(1);
        ListNode list02 = new ListNode(2);
        ListNode list03 = new ListNode(6);
        ListNode list05 = new ListNode(3);
        ListNode list06 = new ListNode(4);
        ListNode list07 = new ListNode(5);
        ListNode list08 = new ListNode(6);

        list01.next = list02;
        list02.next = list03;
        list03.next = list05;
        list05.next = list06;
        list06.next = list07;
        list07.next = list08;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
