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
        return recursive(null, head);
    }

    public ListNode recursive(ListNode cur, ListNode nxt) {

        if (nxt == null) {
            return cur;
        }

        ListNode tmp = nxt.next;
        nxt.next = cur;
        return recursive(nxt, tmp);
    }
}