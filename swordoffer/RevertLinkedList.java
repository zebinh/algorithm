/**
 * 剑指Offer，反转链表
 */
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class RevertLinkedList {

    public ListNode ReverseList(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode p1 = null;
        ListNode p2 = head;
        while (p2 != null) {
            
            ListNode tmp = p2.next;
            p2.next = p1;

            p1 = p2;
            p2 = tmp;
        }

        return p1;
    }
}