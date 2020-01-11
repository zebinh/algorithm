/**
 * 剑指Offer，删除链表中重复的节点
 */


class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class DeleteDuplicationSolution {

    public ListNode deleteDuplication(ListNode pHead)
    {
        ListNode first = new ListNode(0);
        first.next = pHead;

        ListNode pre = first;
        ListNode cur = pHead;

        while (cur != null && cur.next !=null) {
            if (cur.val != cur.next.val) {
                pre.next = cur;
                pre = cur;
                cur = cur.next;
            }else {
                ListNode cursor = cur.next;
                while (cursor != null && cur.val == cursor.val ) {
                    cursor = cursor.next;
                }
                cur = cursor;
            }
        }
        pre.next = cur;

        return first.next;
    }
}